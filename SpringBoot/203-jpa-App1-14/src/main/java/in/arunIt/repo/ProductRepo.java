package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
