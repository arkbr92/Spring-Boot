package in.arunIt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	
	@Id
	private Integer eid;
	private String ename;
	private Double esalary;
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String ename, double esalary) {
		// TODO Auto-generated constructor stub
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsalary() {
		return esalary;
	}
	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
