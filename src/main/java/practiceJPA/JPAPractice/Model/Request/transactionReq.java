package practiceJPA.JPAPractice.Model.Request;

import practiceJPA.JPAPractice.Model.TransactionEntity.Account;

import java.io.Serializable;

public class transactionReq implements Serializable {

    private String name;
    private Double balance;

    public transactionReq(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account reqMethod(){
        Account newAccount = new Account();
        newAccount.setName(this.name);
        newAccount.setBalance(this.balance);
        return newAccount;
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
