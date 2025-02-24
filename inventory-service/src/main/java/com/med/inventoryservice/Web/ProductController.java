package com.med.inventoryservice.Web;

import com.med.inventoryservice.Entity.Product;
import com.med.inventoryservice.Repository.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
//@CrossOrigin("*")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
//    @PreAuthorize("hasAuthority('ADMIN')")
    private List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    private Product getProductById(@PathVariable String id) {
        return productRepository.findById(id).get();
    }

    @GetMapping("/auth")
    private Authentication authentication(Authentication authentication) {
        return authentication;
    }
}
