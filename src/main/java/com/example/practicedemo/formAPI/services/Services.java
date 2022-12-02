package com.example.practicedemo.formAPI.services;

import com.example.practicedemo.formAPI.model.Model;
import com.example.practicedemo.formAPI.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {
    @Autowired
    private Repo repository;

    public Model saveProduct(Model product) {
        return repository.save(product);

    }

    public List<Model> getProducts() {
        return repository.getAllProducts();
    }

    public Model getProductById(int id) {
        return repository.findById(id);
    }

    public String deleteProduct(int id) {
        repository.delete(id);
        return "product removed !! " + id;
    }

    public Model updateProduct(Model product) {
        return repository.update(product);
    }
    public Model isDone(Model product) { return  repository.isDone(product);}

}
