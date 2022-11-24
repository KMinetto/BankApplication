# Bank application

---

Your job is to create a simple banking application.

## Instructions
Implement the following classes:

### Bank

- It has **two fields**, A `String` called _name_ and an `ArrayList` that holds objects of type `Branch` called _branches_.

- A **constructor** that takes a `String` (name of the bank). It **initialises** name and **instantiates** branches.

- And five **methods**, they are (their functions are in their names):

- `addBranch()`, has one parameter of type `String` (name of the branch) and returns a `boolean`. It returns `true` if the branch was **added successfully** or `false` **otherwise**.

- `addCustomer()`, has three parameters of type `String` (name of the branch), `String` (name of the customer), `double` (initial transaction) and returns a `boolean`. It returns `true` if the customer was **added successfully** or `false` **otherwise**.

-  `addCustomerTransaction()`, has three parameters of type `String` (name of the branch), `String` (name of the customer), `double` (transaction) and returns a `boolean`. It returns `true` if the customers transaction was **added successfully** or `false` **otherwise**.

- `findBranch()`, has one parameter of type `String` (name of the Branch) and returns a `Branch`. Return the `Branch` if it **exists** or `null` **otherwise**.

- `listCustomers()`, has two parameters of type `String` (name of the Branch), `boolean` (print transactions) and returns a `boolean`. Return true if the branch **exists** or `false` **otherwise**. This method **prints** out a **list of customers**.

→ TEST CODE

```java
class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}
```

→ OUTPUT

The list of **customers** should be printed out in the following format if **boolean** parameter is **true**:

```bash
Customer details for branch Adelaide
Customer: Tim[1]
Transactions
[1]  Amount 50.05
[2]  Amount 44.22
[3]  Amount 12.44
Customer: Mike[2]
Transactions
[1]  Amount 175.34
[2]  Amount 1.65
Customer: Percy[3]
Transactions
[1]  Amount 220.12
```

and if false, only the customers - **no transactions**:

```bash
bank.listCustomers("Adelaide", false);

Customer details for branch Adelaide
Customer: Tim[1]
Customer: Mike[2]
Customer: Percy[3]
```

### Branch

- It **has two fields**, A `String` called **name** and an `ArrayList` that holds objects of type `Customer` called **customers**.

- A **constructor** that takes a `String` (name of the branch). It **initialises** name and **instantiates** customers.

- And five methods, they are (their functions are in their names):

- `getName()`, getter for name.

- `getCustomers()`, getter for customers.

- `newCustomer()`, has two parameters of type `String` (name of customer), `double` (initial transaction) and returns a `boolean`. Returns `true` if the customer **was added successfully** or `false` **otherwise**.

- `addCustomerTransaction()`, has two parameters of type `String` (name of customer), `double` (transaction) and returns a `boolean`. Returns `true` if the customers transaction **was added successfully** or `false` **otherwise**.

- `findCustomer()`, has one parameter of type `String` (name of customer) and returns a `Customer`. Return the `Customer` if **they exist**, `null` **otherwise**.

### Customer

- It **has two fields**, A `String` called **name** and an `ArrayList` that holds objects of type `Double` called **transactions**.

- A **constructor** that takes a `String` (name of customer) and a `double` (initial transaction). It **initialises** name and **instantiates** transactions.

- And three methods, they are (their functions are in their names):

- `getName()`, getter for name.

- `getTransactions()`, getter for transactions.

-  `addTransaction()`, has one parameter of type `double` (transaction) and **doesn't return anything**.

## Tips

- In `Bank`, use the `findBranch()` method in each of the other four methods to validate a branch. Do the same thing in `Branch` with `findCustomer()` - **except for the two getters**.

-  In `Customer`, think about what else you need to do in the **constructor** when you **instantiate** a `Customer` object.

- Think about what **methods** you need to **call** from another class when **implementing** a method.

- Be extremely careful with the **spelling** of the names of the fields, **constructors** and **methods**.

- Be extremely careful about **spaces** and **spelling** in the **printed output**.

- All **transactions** are **deposits** _**(no withdraws/balances)**_.

## Notes

- All fields are **private**.

- All constructors are **public**.

- All methods are **public** (except for `findBranch()` and` findCustomer()` which are **private**).

- There are no static members .