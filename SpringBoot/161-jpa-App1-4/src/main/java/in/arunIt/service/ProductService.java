package in.arunIt.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.entity.Product;
import in.arunIt.repo.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public void saveAllProducts() {
		
		Product p=new Product();
		
		p.setPname("Fridge");
		p.setPprice(46000.00);
		
		p.setCreatedDate(LocalDate.now());
		p.setUpdatedDate(LocalDate.now());
		productRepo.save(p);
		System.out.println("Products Saved Successfully...........!!!!!");
	}
	

}
