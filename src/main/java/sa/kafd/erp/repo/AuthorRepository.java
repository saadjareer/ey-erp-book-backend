package sa.kafd.erp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sa.kafd.erp.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
