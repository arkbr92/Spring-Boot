package in.arunIt;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.Person;
import in.arunIt.entity.PersonPK;

public interface PersonRepository extends JpaRepository<Person, PersonPK> {

}
