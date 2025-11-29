package in.arunIt.service;

import java.util.List;

import in.arunIt.entity.Product;

public interface ProductService {
	
	public boolean savePtroduct(Product p);
	
	public List<Product> getAllProducts();

}
