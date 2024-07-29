package br.com.rafaelvi.shoplist.models;

public class Transaction implements Comparable<Transaction> {
    private String item_name;
    private double value;
    private boolean isValid;

    public Transaction(String item_name, double value) {
        this.item_name = item_name;
        this.value = value;
        this.isValid = true;
    }

    public String getItem_name() {
        return item_name;
    }

    public double getValue() {
        return value;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    @Override
    public int compareTo(Transaction t) {
        return Double.compare(this.getValue(), t.getValue());
    }
}
