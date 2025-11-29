package in.arunIt.service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import in.arunIt.entity.Employee;
import in.arunIt.repo.EmpRepository;

import org.springframework.stereotype.Service;

@Service
public class EmpService {
	private EmpRepository empRepo;
	
	
	public EmpService(EmpRepository empRepo) {
		// TODO Auto-generated constructor stub
		this.empRepo=empRepo;
	}

	public void getAllEmpsSort() {
		
		org.springframework.data.domain.Sort sort = org.springframework.data.domain.Sort.by("esalary").descending();
		//org.springframework.data.domain.Sort sort = org.springframework.data.domain.Sort.by("esalary").ascending();
		 
		List<Employee> emps = empRepo.findAll(sort);
		emps.forEach(System.out::println);
		
	}
	
	public void getAllEmpsPagination() {
		 int pageSize=5;
		int pageNumber=1;
		PageRequest pg = PageRequest.of(pageNumber-1, pageSize);
		Page<Employee> page = empRepo.findAll(pg);
		List<Employee> emps = page.getContent();
		emps.forEach(System.out::println);
	}
	
	
	
	
}
