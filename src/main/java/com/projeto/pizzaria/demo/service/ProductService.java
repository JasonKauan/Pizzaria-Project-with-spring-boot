package com.projeto.pizzaria.demo.service;


import com.projeto.pizzaria.demo.entity.Product;
import com.projeto.pizzaria.demo.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //método para buscar todos os produtos
    public List<Product> findAllProducts(){
        return repository.findAll();
    }


    //método para buscar produto por id
    public Product findByid(UUID id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
    }


    //método para salvar produto com validação de nome
    @Transactional
    public Product saveProduct(Product product){
        if (product.getName().length()<3){
            throw new RuntimeException("Nome do produto muito curto! tente colocar um nome com mais de 3 caracteres.");
        }
        return repository.save(product);
    }

    //método para atualizar o produto
    @Transactional
    public Product updateProduct(UUID id ,Product product){
        Product existingProduct = repository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
    // método para atualizar apenas algum(s) dado(s) do produto
    @Transactional
    public Product PatchProduct(UUID id ,Product product){
        Product existingProduct = repository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        if (product.getName() != null) {
            existingProduct.setName(product.getName());
        }
        if (product.getDescription() != null) {
            existingProduct.setDescription(product.getDescription());
        }
        if (product.getPrice() != null) {
            existingProduct.setPrice(product.getPrice());
        }
        return repository.save(existingProduct);
    }

    public void deleteProduct(UUID id){
        Product existingProduct = repository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        repository.delete(existingProduct);
    }


}
