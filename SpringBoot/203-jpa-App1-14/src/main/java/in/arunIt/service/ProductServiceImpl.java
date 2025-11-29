package in.arunIt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.entity.Product;
import in.arunIt.repo.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo productRepo;

	@Override
	public boolean savePtroduct(Product p) {
		Product savedProduct = productRepo.save(p);
		
		return savedProduct.getPid()!=null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

}
