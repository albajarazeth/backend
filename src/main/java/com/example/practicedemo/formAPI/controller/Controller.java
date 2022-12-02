package com.example.practicedemo.formAPI.controller;


import com.example.practicedemo.formAPI.model.Model;
import com.example.practicedemo.formAPI.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RequestMapping("/notes")
@RestController
public class Controller {

    @Autowired
    private Services service;



    @PostMapping
    public Model addProduct(@RequestBody Model product) {
        return service.saveProduct(product);
    }

    @GetMapping
    public List<Model> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("{id}")
    public Model findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PutMapping
    public Model updateProduct(@RequestBody Model product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}




