package net.northking.springcloud.service;

import net.northking.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * author Chamberlain
 * version V1.0
 * 2021/7/19 7:29
 * Description:
 */
@Component
public class ProductClientServiceFallBack implements ProductClientService {
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id, "id=" + id + "无数据--feign&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
