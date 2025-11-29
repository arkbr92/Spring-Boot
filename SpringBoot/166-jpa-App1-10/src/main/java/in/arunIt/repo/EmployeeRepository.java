package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
