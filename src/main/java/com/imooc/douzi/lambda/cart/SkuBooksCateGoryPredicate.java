package com.imooc.douzi.lambda.cart;

/**
 * @author ：lujinlong
 * @date ：Created in 2019/11/14 22:55
 * @modified By：
 */
public class SkuBooksCateGoryPredicate implements  SkuPredicate {
    public boolean test(Sku sku) {
        return SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory());
    }
}
