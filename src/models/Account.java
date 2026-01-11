package src.models;

public abstract class Account {
    private int accountNumber;
    private Customer customer;
    private double balance;

    Account(int accountNumber, Customer customer, double balance){
        this.accountNumber=accountNumber;
        this.customer=customer;
        this.balance=balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public double getBalance()
    {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);


}
