package net.northking.springcloud.service.impl;

import net.northking.springcloud.entities.Product;
import net.northking.springcloud.mapper.ProductMapper;
import net.northking.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/14 17:12
 * Description:
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }
}
