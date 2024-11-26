package org.example.pbooksapp001.service;

import org.example.pbooksapp001.model.Product;
import org.example.pbooksapp001.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
   @Autowired
   private ProductRepository productRepository;

   public List<Product> getAllProducts() {
       return productRepository.findAll();
   }

   public Product getProductById(Long id) {
       return productRepository.findById(id).orElse(null);
   }

   public Product addProduct(Product product) {
       return productRepository.save(product);
   }

   public Product updateProduct(Product product) {
       return productRepository.save(product);
   }

   public void deleteProduct(Long id) {
       productRepository.deleteById(id);
   }
}