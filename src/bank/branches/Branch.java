package bank.branches;

import bank.customers.Customer;

import java.util.ArrayList;

/**
 * class Branch
 */
public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    /**
     * Branch constructor
     * @param name String
     */
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    /**
     * Add a new Customer in ArrayList<Customer>
     * @param customerName String
     * @param initialAmount double
     * @return boolean
     */
    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    /**
     * Add a customer Transaction in ArrayList<Double> in Customer class
     * @param customerName String
     * @param amount double
     * @return boolean
     */
    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    /**
     * Find the customer with his name in ArrayList<Customer>
     * @param name String
     * @return Customer
     */
    private Customer findCustomer(String name) {
        for (Customer foundCustomer : this.customers) {
            if (foundCustomer.getName().equals(name)) {
                return foundCustomer;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
