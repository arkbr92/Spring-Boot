package in.arunIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.arunIt.entity.Product;
import in.arunIt.service.ProductService;

@Controller
public class ProductControleer {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public ModelAndView saveProduct() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("ProdObj",new Product());
		mav.setViewName("index");
		
		return mav;
		
	}
	@PostMapping("/product")
	public ModelAndView postProduct(Product ProdObj) {
		
	
		ModelAndView mav=new ModelAndView();
		boolean status = productService.savePtroduct(ProdObj);
		if(status) {
			mav.addObject("smsg","Product Saved Successfully");
		}else {
			mav.addObject("fmsg","failed to save");
		}
		mav.addObject("ProdObj",new Product());
		
		mav.setViewName("index");
		return mav;
		
	}
	
	@GetMapping("/products")
	public ModelAndView retrievProduct() {
		List<Product> allProducts = productService.getAllProducts();
		ModelAndView mav=new ModelAndView();
	
		mav.addObject("msg",allProducts);
		mav.setViewName("data");
		
		return mav;
		
		
	
	}
	
	

}
