import bank.Bank;

/**
 * Class main
 */
public class Main {
    public static void main(String[] args) {
       Bank bank = new Bank("Crédit mutuel");
       String firstBranchName = "Compte courant";
       bank.addBranch(firstBranchName);
       bank.addCustomer(firstBranchName,"Kilian", 25.0d);
       bank.addCustomer(firstBranchName, "Manon", 55.0d);
       bank.addCustomer(firstBranchName, "Anne", 1_000.0d);

       String secondBranchName = "Livret jeune";
       bank.addBranch(secondBranchName);
       bank.addCustomer(secondBranchName, "Kilian", 1_000.0d);

       bank.addCustomerTransaction(firstBranchName, "Manon", 44.22d);
       bank.addCustomerTransaction(firstBranchName, "Manon", 12.44d);
       bank.addCustomerTransaction(firstBranchName, "Anne", 1.65d);

       bank.listCustomers(firstBranchName, true);
       bank.listCustomers(secondBranchName, true);
    }
}