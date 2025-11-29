package in.arunIt.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer tId;
	private String name;
	private String doj;
	private String email;
	private String gender;
	private String source;
	private String destination;
	private String trainStatus;

}
