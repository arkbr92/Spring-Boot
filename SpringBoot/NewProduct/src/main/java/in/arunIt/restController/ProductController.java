package in.arunIt.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.arunIt.binding.Productt;
import in.arunIt.service.ProductService;
import in.arunIt.service.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productService;
	
	@PostMapping(value="/product",
	             consumes="application/json",
	             produces={"application/xml","application/json"})
	public ResponseEntity<Productt> saveProduct(@RequestBody Productt productt){
		Productt saveProduct = productService.saveProduct(productt);
		return new ResponseEntity<>(saveProduct,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping(value="/product/{pid}",
	            
	             produces={"application/xml","application/json"})
	public ResponseEntity<Productt> getProduct(@PathVariable("pid") Integer pId) throws Exception{
		
		if(pId==1) {
		Productt p=new Productt();
		
		
		p.setName("Mouse");
		p.setPrice(500.50);
		
			
		return new ResponseEntity<>(p,HttpStatus.OK);
		
		}else {
			throw new Exception("Invalid Id");
		}}
	
	
	
	
	
	@GetMapping(value="/products",
           
            produces={"application/xml","application/json"})
	public ResponseEntity<List<Productt>> getAllTicket(){
		List<Productt> allProducts = productService.getAllProducts();
		return new ResponseEntity<> (allProducts,HttpStatus.OK);
	}

}
