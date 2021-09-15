package com.product.controller;

import com.product.entity.ProductInfo;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/productCtrl")
public class ProductController {

    @Resource
    private ProductService productService;

    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ProductInfo queryProductInfoById(@PathVariable Integer id){
        ProductInfo productInfo = productService.queryProductById(id);
        productInfo.setProductName("IP地址："+ip+":"+port);
        return productInfo;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Integer addProduct(@RequestBody ProductInfo productInfo){
        int count = productService.addProduct(productInfo);
        return count;

    }

}
