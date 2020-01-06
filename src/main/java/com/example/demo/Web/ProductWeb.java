package com.example.demo.Web;

import com.example.demo.Pojo.Product;
import com.example.demo.Service.ProductService;
import com.example.demo.common.ServerResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;



@RestController
@CrossOrigin("*")
public class ProductWeb {
    @Resource
    private ProductService productService;
    @RequestMapping("/getProducts.do")
    public ServerResponse getProducts(Product product){
       productService.getProducts();
       return productService.pages(product);
    }
    @RequestMapping("/getOneProducts.do")
    public ServerResponse getOneProducts(Integer id){
        return productService.getOne(id);
    }
    @RequestMapping("/updateProduct.do")
    public ServerResponse updateProduct(Product product){
        return productService.updateProduct(product);
    }
    @RequestMapping("/insertProduct.do")
    public ServerResponse insertProduct(Product product){
        return productService.insertProduct(product);
    }
    @RequestMapping("/deleteProduct.do")
    public ServerResponse deleteProduct(Integer id){
        return productService.deleteProduct(id);
    }

}
