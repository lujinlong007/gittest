package com.imooc.douzi.lambda.cart;

/**
 * @author ：lujinlong
 * @date ：Created in 2019/11/14 22:56
 * @modified By：
 */
public class SkuTotalPricePredicate implements SkuPredicate {
    public boolean test(Sku sku) {
        return sku.getTotaolPrice()>2000;
    }
}
