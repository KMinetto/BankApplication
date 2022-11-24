package bank;

import bank.branches.Branch;
import bank.customers.Customer;

import java.util.ArrayList;

/**
 * Bank class
 */
public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    /**
     * Bank constructor
     * @param name String
     */
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    /**
     * Add a branch in ArrayList<Branch>
     * @param name String
     * @return boolean
     */
    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            System.out.println("Branche ajoutée avec succès.");
            return true;
        }

        System.out.println("Branche déjà existante");
        return false;
    }

    /**
     * Add a new Customer in the branch
     *
     * @param branchName    String
     * @param customerName  String
     * @param initialAmount double
     * @return boolean
     */
    public boolean addCustomer(String branchName, String customerName , double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Ajout du client réalisé avec succès.");
            return branch.addNewCustomer(customerName, initialAmount);
        }

        System.out.println("Le client existe déjà.");
        return false;
    }

    /**
     * Add a transaction to a Customer in a specific Branh
     * @param branchName String
     * @param customerName String
     * @param amount double
     * @return boolean
     */
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    /**
     * Find a branch
     * @param name String
     * @return Branch
     */
    private Branch findBranch(String name) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Détails client dans la branche " + branch.getName() + " :");
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (Customer customer : branchCustomers) {
                System.out.println("Client :" + customer.getName());
                if (showTransaction) {
                    System.out.println("Transactions :");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (double transaction : transactions) {
                        System.out.println("Montant de la transaction :" + transaction);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
