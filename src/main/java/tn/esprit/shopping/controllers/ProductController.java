package tn.esprit.shopping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.shopping.dto.ProductDTO;
import tn.esprit.shopping.entities.Product;
import tn.esprit.shopping.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
@Autowired ProductService productService;
    // productService constructor injection

    @GetMapping(value = { "", "/" })
    public  Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/add")
    public  Product addProduct(ProductDTO product) {
    	Product p=new Product(product.getIddto(),product.getNamedto(),product.getSousCategorie(),product.getPrice(),product.getPictureUrl());
        return productService.save(p);
    }
}