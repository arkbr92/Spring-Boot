package in.arunIt.service;


import java.util.Arrays;

import java.util.List;

import org.springframework.stereotype.Service;

import in.arunIt.entity.Employee;
import in.arunIt.repo.EmpRepository;

@Service
public class EmpServices {
	private EmpRepository empRepo;
	public EmpServices(EmpRepository empRepo) {
		// TODO Auto-generated constructor stub
		this.empRepo=empRepo;
	}
	
	public void allEmps() {
		
		Employee e1=new Employee(201,"Anil",5000.00);
		Employee e2=new Employee(202,"Sunil",6000.00);
		Employee e3=new Employee(203,"nikil",7000.00);
		Employee e4=new Employee(204,"kapil",5000.00);
		Employee e5=new Employee(205,"ninil",8000.00);
		
		List<Employee> emps=Arrays.asList(e1,e2,e3,e4,e5);
		
		empRepo.saveAll(emps);
		System.out.println("Records Saved................");
		
		
	}

}
