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



    public void depositMoney(){}

    public void withdrawMoney(){}

    public void checkBalance(){}


}
