package br.com.rafaelvi.shoplist.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Transaction> transactionList = new ArrayList<>();

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        transactionList = new ArrayList<>();
    }
    
    public boolean authorizeTransaction(Transaction transaction){
        if (this.balance > transaction.getValue()){
            this.setBalance(this.balance - transaction.getValue());
            this.getTransactionList().add(transaction);
            return true;
        }
        return false;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public String transactionHistory() {
        Collections.sort(this.transactionList);
        StringBuilder result = new StringBuilder("""
                ******************************
                PURCHASES MADE
                """);
        for (Transaction transaction : this.transactionList) {
            result.append(transaction.getItem_name()).append(" - ").append(transaction.getValue()).append("\n");
        }
        result.append("\n\nBalance: ").append(this.getBalance());
        result.append("\n******************************");
        return result.toString();
    }

}
