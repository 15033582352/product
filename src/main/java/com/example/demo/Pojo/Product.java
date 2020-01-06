package com.example.demo.Pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Product {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Integer handleId;
    private String name;
    private String subtitle;
    private String mainImage;
    private String subImage;
    private String detail;
    private Double price;
    private Integer stock;
    private Integer status;
    private Date  createTime;
    private Date updateTime;
    private Integer pageNo;
    private Integer pageSize;
}
