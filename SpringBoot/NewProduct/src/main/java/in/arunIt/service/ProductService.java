package in.arunIt.service;

import java.util.List;

import in.arunIt.binding.Productt;

public interface ProductService {
	
	public Productt saveProduct(Productt product);
	public Productt getProductById(Integer pId);
	public List<Productt> getAllProducts();
	

}
