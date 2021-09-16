package com.order.feign;

import com.order.entity.ProductInfo;
import org.springframework.stereotype.Component;

@Component
public class ProductFeignClientFallBack implements ProductFeignClient{


    /**
     * 熔断降级方法
     * @param id
     * @return
     */
    public ProductInfo queryProductInfo(Integer id) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductName("feign触发熔断降级方法");
        return productInfo;
    }
}
