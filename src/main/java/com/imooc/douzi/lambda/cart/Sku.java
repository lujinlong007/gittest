package com.imooc.douzi.lambda.cart;

/**
 * @author ：lujinlong
 * @date ：Created in 2019/11/14 20:33
 * @modified By：
 *
 */
public class Sku {
    //编号
    private Integer skuId;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Double getTotaolPrice() {
        return totaolPrice;
    }

    public void setTotaolPrice(Double totaolPrice) {
        this.totaolPrice = totaolPrice;
    }

    public Enum getSkuCategory() {
        return skuCategory;
    }

    public void setSkuCategory(Enum skuCategory) {
        this.skuCategory = skuCategory;
    }

    public Sku(Integer skuId, String skuName, Double skuPrice, Integer totalNum, Double totaolPrice, Enum skuCategory) {
        this.skuId = skuId;
        this.skuName = skuName;
        this.skuPrice = skuPrice;
        this.totalNum = totalNum;
        this.totaolPrice = totaolPrice;
        this.skuCategory = skuCategory;
    }

    //商品名称
    private String skuName;
    //单价
    private Double skuPrice;
    //购买个数
    private Integer totalNum;
    //总价
    private Double totaolPrice;
    //商品类型
    private Enum skuCategory;
}
