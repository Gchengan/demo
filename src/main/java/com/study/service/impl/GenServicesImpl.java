package com.study.service.impl;


import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheUpdate;
import com.alicp.jetcache.anno.Cached;
import com.alicp.jetcache.anno.CreateCache;
import com.alicp.jetcache.redis.RedisCache;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.study.dao.GenDao;
import com.study.pojo.Gen;
import com.study.pojo.R;
import com.study.service.GenServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenServicesImpl implements GenServices {
@Autowired
private GenDao genDao;

@CreateCache(name = "gen_",expire = 3600)
private Cache<String, List<Gen>> jetCache;

    @Override
    public R getAll() {


            return new R(genDao.selectList(null));

    }

    @Override
    @Cached(name = "gen_",key = "#id",expire = 3600)
    public R getById(Integer id) {
        Gen gen = genDao.selectById(id);
        LambdaQueryWrapper<Gen> genLambdaQueryWrapper = new LambdaQueryWrapper<>();
        LambdaQueryWrapper<Gen> eq = genLambdaQueryWrapper.eq(Gen::getId, id);
        List<Gen> gens = genDao.selectList(eq);
        return new R(gens);
    }

    @Override
    public R insert(Gen gen) {
        int insert = genDao.insert(gen);
        return new R(insert>0,insert>0?"添加成功":"添加失败");
    }

    @Override
    public R update(Gen gen) {
        int i = genDao.updateById(gen);
        return new R(i>0,i>0?"修改成功":"修改失败");
    }

    @Override
    public R delete(Integer id) {
        int i = genDao.deleteById(id);

        return new R(i>0, i>0?"删除成功":"删除失败");
    }
}
