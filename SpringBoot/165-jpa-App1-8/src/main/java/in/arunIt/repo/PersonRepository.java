package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
