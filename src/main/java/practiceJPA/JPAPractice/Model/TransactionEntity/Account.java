package practiceJPA.JPAPractice.Model.TransactionEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import practiceJPA.JPAPractice.Model.Entity.BaseAuditEntity;

import java.io.Serializable;

@Entity
@Table(name = "Account")
public class Account<ID extends Serializable> extends BaseAuditEntity<Long> {

    @Column(nullable = false, length = 50)
    private String name;
    private Double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
