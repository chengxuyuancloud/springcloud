package net.northking.springcloud.service;

import net.northking.springcloud.entities.Product;

import java.util.List;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/14 17:12
 * Description:
 */
public interface ProductService {
    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
