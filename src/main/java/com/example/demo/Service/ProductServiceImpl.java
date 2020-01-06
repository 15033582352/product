package com.example.demo.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.Pojo.Product;
import com.example.demo.Dao.ProductDao;
import com.example.demo.common.ServerResponse;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{
    @Resource
    private  ProductDao productDao;
    @Override
    public ServerResponse getProducts() {
     List<Product> products=   productDao.selectList(null);
        return ServerResponse.serverSuccess("查询成功",products);
    }

    @Override
    public ServerResponse deleteProduct(Integer id) {
      int a=  productDao.deleteById(id);
      if (a>0){
          return ServerResponse.serverSuccess("删除成功");
      }
        return ServerResponse.serverError("删除失败");
    }

    @Override
    public ServerResponse insertProduct(Product product) {
        System.out.println("service"+product);
       int a= productDao.insert(product);
        if (a>0){
            return ServerResponse.serverSuccess("添加成功");
        }
        return ServerResponse.serverError("添加失败");

    }

    @Override
    public ServerResponse updateProduct(Product product) {
        System.out.println(product);
     int a=   productDao.updateById(product);
        if (a>0){
            return ServerResponse.serverSuccess("修改成功");
        }
        return ServerResponse.serverError("修改失败");

    }

    @Override
    public ServerResponse getOne(Integer id) {
      Product product=  productDao.selectById(id);
      if (product!=null){
          return ServerResponse.serverSuccess("查到一个", Arrays.asList(product));
      }else {
          return ServerResponse.serverError("没有查到");
      }

    }

    @Override
    public ServerResponse pages(Product product) {

        IPage<Product> productIPage = productDao.selectPage(new Page<Product>( product.getPageNo(),product.getPageSize()), null);
        return ServerResponse.serverSuccess("陈功g",Arrays.asList(productIPage));
    }
}
