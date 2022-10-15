package com.study.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@TableName("gen_table")
public class Gen implements Serializable {
    @TableId
    private Long id;
    private String tableName;
    private String tableComment;
    private String className;
    private String tplCategory;
    private String packageName;
    private String moduleName;
    private String businessName;
    private String functionName;
    private String functionAuthor;
    private String options;
    private String note;
    private int createUser;
    private Date createTime;
    private int updateUser;
    private Date   updateTime;
    private int mark;

}
