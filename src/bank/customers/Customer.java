package bank.customers;

import java.util.ArrayList;

/**
 * Customer class
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    /**
     * Customer constructor
     * @param name String
     * @param initialTransaction double
     */
    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }

    /**
     * Add transactions in ArrayList<Double>
     * @param initialTransaction double
     */
    public void addTransaction(double initialTransaction) {
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
