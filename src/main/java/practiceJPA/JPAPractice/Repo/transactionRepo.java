package practiceJPA.JPAPractice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practiceJPA.JPAPractice.Model.TransactionEntity.Account;

@Repository
public interface transactionRepo extends JpaRepository<Account, Long> {
    boolean existsByName(String name);
}
