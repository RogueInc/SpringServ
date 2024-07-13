package com.rogueinc.Serv.Respository;

import com.rogueinc.Serv.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {
}
