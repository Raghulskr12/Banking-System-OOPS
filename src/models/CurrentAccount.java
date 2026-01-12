package src.models;

public class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, Customer customer, double balance) {
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
        return false;
    }

}
