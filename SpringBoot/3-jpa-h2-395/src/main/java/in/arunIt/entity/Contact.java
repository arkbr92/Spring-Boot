package in.arunIt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity

public class Contact {
	@Id
	@GeneratedValue
	private Integer cId;
	private String name;
	private Long phNum;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhNum() {
		return phNum;
	}
	public void setPhNum(Long phNum) {
		this.phNum = phNum;
	}
	
	

}
