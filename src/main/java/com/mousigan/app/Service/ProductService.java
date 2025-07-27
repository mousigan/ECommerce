package com.mousigan.app.Service;

import com.mousigan.app.Model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(101,"iphone",50000),
            new Product(102,"Macbook",90000),
            new Product(103,"samsung",42000)
    ));

//    public ProductService(List<Product> products) {
//        this.products = products;
//    }

    //    public List<Product> getProductList(){
//        return products;
//    }
    public ProductService() {

    }
    public Product getProductById(int id) {
        return products.stream()
                .filter(p -> p.getProdId() == id)
                .findFirst()
                .orElse(new Product(100,"No Item",0));  // Or throw a custom exception
    }


    public List<Product> getProducts(){
        return products;
    }

    public void addProduct(@RequestBody Product product){
        products.add(product);
    }

    public void updateProduct(@RequestBody Product product){
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==product.getProdId()){
                index=i;
            }
        }
        products.set(index, product);
    }

    public void deleteProduct(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }

    }
}
