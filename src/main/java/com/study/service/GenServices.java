package com.study.service;


import com.study.pojo.Gen;
import com.study.pojo.R;

public interface GenServices {
    public R getAll();
    public R getById(Integer id);
    public R insert(Gen gen);
    public R update(Gen gen);
    public R delete(Integer id);
}
