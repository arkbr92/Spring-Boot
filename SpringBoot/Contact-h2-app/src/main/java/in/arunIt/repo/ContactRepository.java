package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
