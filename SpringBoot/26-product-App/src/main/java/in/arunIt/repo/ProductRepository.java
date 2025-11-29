package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
