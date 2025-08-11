package com.gomesvh.msProduct.service;

import com.gomesvh.msProduct.domain.Product;
import com.gomesvh.msProduct.exception.ProductNotFoundException;
import com.gomesvh.msProduct.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record ProductService(ProductRepository repository) {
    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(String code) throws ProductNotFoundException {
        return repository.findById(code)
                .orElseThrow(() -> new ProductNotFoundException("Produto não encontrado"));
    }

    public Product save(@Valid Product product) {
        return repository.save(product);
    }

    public void delete(String code) {
        repository.deleteById(code);
    }

    public Product update(@Valid Product product) {
        return repository.save(product);
    }
}