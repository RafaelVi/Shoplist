package br.com.rafaelvi.shoplist.main;

import br.com.rafaelvi.shoplist.models.CreditCard;
import br.com.rafaelvi.shoplist.models.Transaction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int iterator = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("What's the credit card limit?");
        double limit = in.nextDouble();
        CreditCard creditCard = new CreditCard(limit);

        while (iterator == 1) {
            System.out.println("What do you want to buy?");
            String item = in.next();
            System.out.println("How much does it cost?");
            double value = in.nextDouble();
            Transaction transaction = new Transaction(item, value);
            if (!creditCard.authorizeTransaction(transaction)) {
                System.out.println("Insufficient funds!");
                System.out.println(creditCard.transactionHistory());
                iterator = 0;
            } else {
                System.out.println("Purchase made!");
            }

            System.out.println("Press 0 to leave or 1 to continue");
            iterator = in.nextInt();
            if (iterator != 1) System.out.println(creditCard.transactionHistory());

        }
        
    }
}
