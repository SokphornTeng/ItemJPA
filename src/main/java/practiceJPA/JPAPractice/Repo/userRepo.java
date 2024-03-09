package practiceJPA.JPAPractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practiceJPA.JPAPractice.Model.Entity.User;

import java.util.Optional;

@Repository
public interface userRepo extends JpaRepository<User, Long> {
    User existsByName(String name);
   Optional<User> findByIdAndDeletedAtIsNull(Long id);
}
