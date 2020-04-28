package com.example.services;

import com.example.entities.Product;
import com.example.jpa.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductWsImpl implements ProductWs {

  @Autowired
  private ProductRepository repository;

  @Override
  public List<Product> getProducts() {
    return repository.findAll();
  }

  @Override
  public Product getProduct(int id) {
    return repository.findById(id).get();
  }

  @Override
  public Product createProduct(Product product) {
    return repository.save(product);
  }

  @Override
  public Product updateProduct(Product product) {
    return repository.save(product);
  }

  @Override
  public void deleteProduct(int id) {
    repository.deleteById(id);
  }
}
