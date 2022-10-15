package com.study.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class R implements Serializable {
    private Object genData;
    private boolean flag;
    private String msg;

    public R(Object genData) {
        this.genData = genData;
    }

    public R(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }
}
