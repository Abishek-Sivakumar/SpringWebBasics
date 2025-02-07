package com.abishek.MySpringWeb.repository;

import com.abishek.MySpringWeb.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer> {

}
