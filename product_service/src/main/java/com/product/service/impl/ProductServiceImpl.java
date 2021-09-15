package com.product.service.impl;

import com.product.dao.ProductInfoMapper;
import com.product.entity.ProductInfo;
import com.product.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductInfoMapper productInfoMapper;

    public ProductInfo queryProductById(Integer id){
        ProductInfo productInfo = productInfoMapper.selectByPrimaryKey(id);
        return productInfo;
    }

    public int addProduct(ProductInfo productInfo) {
        int count = productInfoMapper.insert(productInfo);
        return count;
    }


}
