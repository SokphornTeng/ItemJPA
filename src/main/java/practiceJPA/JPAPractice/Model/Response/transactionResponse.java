package practiceJPA.JPAPractice.Model.Response;

import practiceJPA.JPAPractice.Model.TransactionEntity.Account;

import java.io.Serializable;

public class transactionResponse implements Serializable {

    private Long id;
    private String name;
    private Double balance;

    public transactionResponse(Long id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public static transactionResponse responseMethod(Account accResponse){
        return new transactionResponse(
                (Long) accResponse.getId(),
                accResponse.getName(),
                accResponse.getBalance()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
