package in.arunIt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arunIt.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
