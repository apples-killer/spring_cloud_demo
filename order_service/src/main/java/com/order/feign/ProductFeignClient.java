package com.order.feign;

import com.order.entity.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service-product")
public interface ProductFeignClient {

    @RequestMapping(value = "")
    public ProductInfo queryProductInfo();
}
