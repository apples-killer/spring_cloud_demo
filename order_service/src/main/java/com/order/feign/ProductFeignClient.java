package com.order.feign;

import com.order.entity.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-product")
public interface ProductFeignClient {

    @RequestMapping(value = "/productCtrl/{id}",method = RequestMethod.GET)
    public ProductInfo queryProductInfo(@PathVariable("id") Integer id);
}
