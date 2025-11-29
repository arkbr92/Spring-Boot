package in.arunIt.binding;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.annotation.Generated;


@Entity
public class Product {
	
	@Id
	private Integer Id;
	private String name;
	private String pColor;
	private Double price;

}
