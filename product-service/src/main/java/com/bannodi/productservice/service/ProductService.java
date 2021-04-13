package com.bannodi.productservice.service;

import com.bannodi.productservice.model.Product;
import com.bannodi.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    private ProductRepository productRepo;

    @Autowired
    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product addProduct(Product newProduct) {
        return productRepo.save(newProduct);
    }

    public Product getProduct(long id) {
        return productRepo.findById(id).get();
    }

    public void deleteProduct(long id) {
        productRepo.deleteById(id);
    }
}
