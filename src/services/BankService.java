package src.services;

import src.models.*;

import java.net.SocketOption;
import java.util.*;


public class BankService {
    Map<Integer, Account> accounts = new HashMap<>();
    private Scanner scanner= new Scanner(System.in);



    public void createAccount(){
        System.out.println("Enter the customer name :");
        String name  = scanner.nextLine();

        System.out.println("Enter the phone number :");
        String number = scanner.nextLine();

        System.out.println("Enter the address :");
        String address = scanner.nextLine();

        Customer customer= new Customer(name,number,address);

        System.out.println("Enter the account type :");
        System.out.println("1.Savings account");
        System.out.println("2.Current account");
        int type = scanner.nextInt();


        System.out.println("Enter the initial deposit amount :");
        double amount = scanner.nextDouble();
        scanner.nextLine();


        int accNumber = accounts.size()+1;


        Account account;

        if(type==1)
        {
            account= new SavingsAccount(accNumber,customer,amount);
        }
        else {
            account= new CurrentAccount(accNumber,customer,amount);
        }


        accounts.put(accNumber,account);
        System.out.println("Account crested successfully Your account number is :" + accNumber);

        }



    public void depositMoney(){
            System.out.println("Enter the account number:");
            int accNumber = scanner.nextInt();

            Account account= accounts.get(accNumber);

            if(account == null)
            {
                System.out.println("Account not found");
                return;
            }

            System.out.println("Enter the amount to deposit :");

            double amount = scanner.nextDouble();

            if(amount<=0)
            {
                System.out.println("Invalid amount");
                return;
            }

            account.deposit(amount);

            System.out.println("Amount deposited successfully");
    }

    public void withdrawMoney(){
        System.out.println("Enter the account number :");
        int accNumber = scanner.nextInt();

        Account account = accounts.get(accNumber);

        if(account == null )
        {
            System.out.println("Invalid account number entered");
            return;
        }

        System.out.println("Enter the amount to withDraw :");

        double amount = scanner.nextDouble();

        if(amount<=0)
        {
            System.out.println("Invalid amount entered");
            return;
        }

        boolean message = account.withdraw(amount);

        if(message)
        {
            System.out.println("amount withdraw success");
        }
        else
        {
            System.out.println("Amount not sufficient");
        }
    }


    public void checkBalance(){

        System.out.println("Enter the account number");
        int accNumber = scanner.nextInt();

        Account account = accounts.get(accNumber);

        if(account == null)
        {
            System.out.println("Invalid account number");
            return;
        }

        System.out.println("The name of the customer is :" + account.getCustomer().getName());
        System.out.println("Balance amount in the account is :" + account.getBalance());
    }


    public void viewAccountDetails(){

    }


}
