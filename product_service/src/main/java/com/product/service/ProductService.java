package com.product.service;

import com.product.entity.ProductInfo;

public interface ProductService {

    public ProductInfo queryProductById(Integer id);

    public int addProduct(ProductInfo productInfo);
}
