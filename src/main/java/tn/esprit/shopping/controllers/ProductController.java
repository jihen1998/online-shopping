package tn.esprit.shopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.NotNull;

import tn.esprit.shopping.entities.Product;
import tn.esprit.shopping.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
@Autowired ProductService productService;
    // productService constructor injection

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}