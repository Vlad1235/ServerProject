package com.example.services;

import com.example.entities.Product;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ProductWs {

  @WebMethod
  List<Product> getProducts();
  @WebMethod
  Product getProduct(int id);
  @WebMethod
  Product createProduct(Product product);
  @WebMethod
  Product updateProduct(Product product);
  @WebMethod
  void deleteProduct(int id);
}
