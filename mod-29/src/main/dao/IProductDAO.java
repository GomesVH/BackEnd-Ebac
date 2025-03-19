package com.jdbcExample.dao;

import com.jdbcExample.domain.Product;

import java.util.List;

public interface IProductDAO {
    Integer save(Product product) throws Exception;
    Integer update(Product product) throws Exception;
    Product findByCode(String code) throws Exception;
    List<Product> findAll() throws Exception;
    Integer delete(Product product) throws Exception;
}