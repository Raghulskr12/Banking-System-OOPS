package src.models;

public class SavingsAccount extends Account{

    public SavingsAccount(int accountNumber, Customer customer, double balance) {
        super(accountNumber, customer, balance);
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance>amount)
        {
            balance-=amount;
            return true;
        }
        else {
            return false;
        }
    }
}
