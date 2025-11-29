package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
