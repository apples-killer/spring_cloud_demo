package com.order.controller;

import com.order.entity.ProductInfo;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String queryProductInfoById(@PathVariable Integer id) {
        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        ServiceInstance instance = instances.get(0);
        ProductInfo productInfo = restTemplate.getForObject("http://" + instance.getHost() + ":" + instance.getPort() + "/productCtrl/" + id, ProductInfo.class);
        return productInfo.toString();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String addProduct(@RequestBody ProductInfo productInfo) {

        return "";

    }

}
