package org.example.pbooksapp001.controller;

import org.example.pbooksapp001.model.Product;
import org.example.pbooksapp001.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

   @Autowired
   private ProductService productService;

   // Get all products
   @GetMapping("/products")
   public List<Product> getAllProducts() {
       return productService.getAllProducts();
   }

   // Get product by id
   @GetMapping("/products/{id}")
   public String getProductById(@PathVariable Long id) {
       return productService.getProductById(id).toString();
   }

   // Add new product
   @PostMapping("/products")
   public Product addProduct(@RequestBody Product product) {
       return productService.addProduct(product);
   }

   // Update existing product
   @PutMapping("/products")
   public Product updateProduct(@RequestBody Product product) {
       return productService.updateProduct(product);
   }

   // Delete product
   @DeleteMapping("/products/{id}")
   public void deleteProduct(@PathVariable Long id) {
       productService.deleteProduct(id);
   }
}