package in.arunIt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.binding.Productt;
import in.arunIt.repo.ProducttRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProducttRepository producttRepository;

	@Override
	public Productt saveProduct(Productt product) {
		Productt save = producttRepository.save(product);
		return save;
	}

	@Override
	public Productt getProductById(Integer pId) {
		return producttRepository.findById(pId).orElseThrow();
		  
		
	}

	@Override
	public List<Productt> getAllProducts() {
		return producttRepository.findAll();
		
	}

	
}
