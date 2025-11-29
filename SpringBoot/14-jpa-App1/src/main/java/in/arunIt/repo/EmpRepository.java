package in.arunIt.repo;

import org.springframework.data.repository.CrudRepository;

import in.arunIt.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer> {

}
