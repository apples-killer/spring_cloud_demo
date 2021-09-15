package com.product.dao;

import com.product.entity.ProductInfo;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ProductInfoMapperTest {

    @Resource
    private ProductInfoMapper productInfoMapper;

    @Test
    void selectByPrimaryKey() {
        ProductInfo productInfo = productInfoMapper.selectByPrimaryKey(1);
        System.out.println(productInfo.toString());

    }
}