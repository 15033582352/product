package com.example.demo.Service;

import com.example.demo.Pojo.Product;
import com.example.demo.common.ServerResponse;

public interface ProductService {
    //查询
    ServerResponse getProducts();
    //删除
    ServerResponse deleteProduct(Integer id);
    //增加
    ServerResponse insertProduct(Product product);
    //修改
    ServerResponse updateProduct(Product product);
    //查询一个
    ServerResponse getOne(Integer id);
    ServerResponse pages(Product product);
}
