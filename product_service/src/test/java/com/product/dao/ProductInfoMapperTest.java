package com.product.dao;

import com.product.entity.ProductInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

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