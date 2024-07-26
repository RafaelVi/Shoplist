package br.com.rafaelvi.shoplist.models;

public class Transaction {
    private String item_name;
    private int value;
    private boolean isValid;

    public Transaction(String item_name, int value) {
        this.item_name = item_name;
        this.value = value;
        this.isValid = true;
    }

    public String getItem_name() {
        return item_name;
    }

    public int getValue() {
        return value;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
