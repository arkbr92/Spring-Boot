package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.arunIt.entity.Person;
import in.arunIt.entity.PersonPk;
@Repository
public interface PersonRepository extends JpaRepository<Person, PersonPk> {

}
