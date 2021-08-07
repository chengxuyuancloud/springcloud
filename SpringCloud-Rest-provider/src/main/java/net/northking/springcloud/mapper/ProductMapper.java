package net.northking.springcloud.mapper;

import net.northking.springcloud.entities.Product;

import java.util.List;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/14 17:04
 * Description:
 */
public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
