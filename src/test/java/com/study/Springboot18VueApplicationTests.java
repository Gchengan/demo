package com.study;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.Cached;
import com.alicp.jetcache.anno.CreateCache;
import com.study.dao.GenDao;
import com.study.pojo.Gen;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot18VueApplicationTests {
@Autowired
private GenDao genDao;

    @CreateCache(name = "demo_",expire = 3600)
    private Cache<String,String> jetCached;
    @Test
    void contextLoads() {
jetCached.put("a", "aa");
    }
    @Test
    void c(){
        String a = jetCached.get("a");
        System.out.println(a);
    }
}
