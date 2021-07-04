package com.imooc.douzi.lambda.cart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：lujinlong
 * @date ：Created in 2019/11/14 20:38
 * @modified By：
 *
 * 购物车服务类
 */
public class CartService {

    //加入购物车的商品信息
    private static List<Sku> cartSkuList = new ArrayList<Sku>() {
        {

            add(new Sku(654032, "无人机",
                    4999.00, 1,
                    4999.00, SkuCategoryEnum.ELECTRONICS));

            add(new Sku(642934, "VR一体机",
                    2299.00, 1,
                    2299.00, SkuCategoryEnum.ELECTRONICS));

            add(new Sku(645321, "纯色衬衫",
                    409.00, 3,
                    1227.00, SkuCategoryEnum.CLOTHING));

            add(new Sku(654327, "牛仔裤",
                    528.00, 1,
                    528.00, SkuCategoryEnum.CLOTHING));

            add(new Sku(675489, "跑步机",
                    2699.00, 1,
                    2699.00, SkuCategoryEnum.SPORTS));

            add(new Sku(644564, "Java编程思想",
                    79.80, 1,
                    79.80, SkuCategoryEnum.BOOKS));

            add(new Sku(678678, "Java核心技术",
                    149.00, 1,
                    149.00, SkuCategoryEnum.BOOKS));

            add(new Sku(697894, "算法",
                    78.20, 1,
                    78.20, SkuCategoryEnum.BOOKS));

            add(new Sku(696968, "TensorFlow进阶指南",
                    85.10, 1,
                    85.10, SkuCategoryEnum.BOOKS));
        }
    };

    //获取购物车商品信息
    public  static List<Sku> getCartSkuList(){

        return cartSkuList;
    }


    /**
     * 1.0.0 筛选电子类商品
    *@Description:
    *@Param:
    *@return:
    *@Author: your name
    *@date:
    */
    public  static List<Sku> filterElectronicsSkus(List<Sku> cartSkuList){
        List<Sku> result = new ArrayList<Sku>();
        for(Sku sku:cartSkuList){
            if(SkuCategoryEnum.ELECTRONICS.equals(sku.getSkuCategory())){
                result.add(sku);
            }
        }
        return result;
    }
    /**
     * 2.0.0
    *@Description: 根据传入的类型 找出购物车中商品
    *@Param:
    *@return:
    *@Author: your name
    *@date:
    */
    public  static List<Sku> filterSkuByCategory(List<Sku> cartSkuList,SkuCategoryEnum skuCategoryEnum){
        List<Sku> result = new ArrayList<Sku>();
        for(Sku sku:cartSkuList){
            //传入的商品类型
            if(skuCategoryEnum.equals(sku.getSkuCategory())){
                result.add(sku);
            }
        }
        return result;
    }
    /**3.0.0。0
    *@Description:
    *@Param:
    *@return:
    *@Author: your name
    *@date:
    */
    public  static  List<Sku> filterSkus(List<Sku> cartSkuList,SkuCategoryEnum categoryEnum,Double totaoPrice,Boolean cateOrprice){

        List<Sku> result = new ArrayList<Sku>();
        for(Sku sku:cartSkuList){
            //如果根据商品类型判断，sku类型与输入类型判断
            //如果输入商品总价，总价判断
            if((cateOrprice && categoryEnum.equals(sku.getSkuCategory()))||(!cateOrprice&&sku.getTotaolPrice()>totaoPrice)){
                result.add(sku);
            }
        }
        return result;

    }

    /**4.0.0 根据不同的判断标准 ，对Sku列表进行过滤
    *@Description:
    *@Param:
    *@return:
    *@Author: your name
    *@date:
    */
    public  static  List<Sku> filterSkusExt(List<Sku> cartSkuList,SkuPredicate predicate){
        List<Sku> result = new ArrayList<Sku>();
        for(Sku sku:cartSkuList){
            //根据不同的Sku判断策略
            if(predicate.test(sku)){
                result.add(sku);
            }
        }
        return result;
    }



}
