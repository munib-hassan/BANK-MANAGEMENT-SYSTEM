import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {

                input.nextLine();

                System.out.print("Enter account number: ");
                String accountNumber = input.nextLine();

                System.out.print("Enter account holder name: ");
                String name = input.nextLine();

                System.out.print("Enter initial balance: ");
                double balance = input.nextDouble();

                Account account =
                        new Account(accountNumber, name, balance);

                bank.addAccount(account);

            } else if (choice == 2) {

                System.out.print("Enter account number: ");
                String accountNumber = input.next();

                Account account = bank.findAccount(accountNumber);

                if (account != null) {

                    System.out.print("Enter amount to deposit: ");
                    double amount = input.nextDouble();

                    account.deposit(amount);

                } else {
                    System.out.println("Account not found.");
                }

            } else if (choice == 3) {

                System.out.print("Enter account number: ");
                String accountNumber = input.next();

                Account account = bank.findAccount(accountNumber);

                if (account != null) {

                    System.out.print("Enter amount to withdraw: ");
                    double amount = input.nextDouble();

                    account.withdraw(amount);

                } else {
                    System.out.println("Account not found.");
                }

            } else if (choice == 4) {

                System.out.print("Enter account number: ");
                String accountNumber = input.next();

                Account account = bank.findAccount(accountNumber);

                if (account != null) {
                    account.displayAccount();
                } else {
                    System.out.println("Account not found.");
                }

            } else if (choice == 5) {

                System.out.println("Thank you for using Bank Management System.");
                break;

            } else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}