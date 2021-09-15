package com.product.controller;

import com.product.entity.ProductInfo;
import com.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/productCtrl")
public class ProductController {

    @Resource
    private ProductService productService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ProductInfo queryProductInfoById(@PathVariable Integer id){
        ProductInfo productInfo = productService.queryProductById(id);
        return productInfo;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Integer addProduct(@RequestBody ProductInfo productInfo){
        int count = productService.addProduct(productInfo);
        return count;

    }

}
