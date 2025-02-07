package com.abishek.MySpringWeb.service;

import com.abishek.MySpringWeb.model.Products;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    List<Products> productsList =new ArrayList<>(
            Arrays.asList(new Products(101,"PlayStation",50000),
                    new Products(102,"Iphone",70000)
            )); // Initialoze a list with array of products

    public List<Products> getProducts(){
        return productsList;
    }

    public Products getProductById(int prodId){
        return productsList.stream().filter(p -> p.getProductId()==prodId).findFirst().get();
    }

    public void addProduct(Products product){
        productsList.add(product);
    }

    public void updateProduct(Products prod) {
        int index=0;
        for(int i=0;i<productsList.size();i++){
            if(productsList.get(i).getProductId()==prod.getProductId()){
                index=i;
            }
        }
        productsList.set(index,prod);
    }

    public void deleteProduct(int prodId) {
        int index=0;
        for(int i=0;i<productsList.size();i++){
            if(productsList.get(i).getProductId()==prodId){
                index=i;
            }
        }
        productsList.remove(index);
    }
}
