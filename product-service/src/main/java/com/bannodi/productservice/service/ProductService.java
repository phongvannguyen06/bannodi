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

    public Product getProduct(long productId) {
        return productRepo.findById(productId).get();
    }

    public Product updateProductOfUser(long productId, Product updatedProduct) {
        updatedProduct.setId(productId);
        return productRepo.save(updatedProduct);
    }

    public Product addProduct(Product newProduct) {
        return productRepo.save(newProduct);
    }

    public void deleteProduct(long id) {
        productRepo.deleteById(id);
    }

}
