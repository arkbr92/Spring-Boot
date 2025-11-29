package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
