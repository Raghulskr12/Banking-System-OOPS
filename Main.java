import src.services.BankService;

import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        BankService bankService = new BankService();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("===WELCOME TO SBI BANK===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check Balance");
            System.out.println("5.Exit");

            System.out.println("Enter your choice :");
            int ans = scanner.nextInt();
            scanner.nextLine();

            switch (ans)
            {
                case 1 -> bankService.createAccount();
                case 2 -> bankService.depositMoney();
                case 3 -> bankService.withdrawMoney();
                case 4 -> bankService.checkBalance();
                case 5 -> {
                    System.out.println("Thanks for using the system");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }

        }
    }
}