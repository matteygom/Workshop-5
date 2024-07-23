package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
