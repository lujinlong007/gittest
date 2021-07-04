package com.imooc.douzi.lambda.cart;

/**
 * @author ：lujinlong
 * @date ：Created in 2019/11/14 21:00
 * @modified By：
 */
public enum SkuCategoryEnum {
    CLOTHING(10,"服装类"),
    ELECTRONICS(20,"数码类"),
    SPORTS(30,"运动类"),
    BOOKS(40,"图书类");



    //类型编号
    private Integer code;
    //名称

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

     SkuCategoryEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
