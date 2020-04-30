package withdraw.application;

import withdraw.model.entities.Account;
import withdraw.model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Integer accountNumber;
        String holder;
        Double balance, withdrawLimit, withdrawAmount;
        Account account;
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the account number: ");
                accountNumber = input.nextInt();
                System.out.print("Enter the holder name: ");
                holder = input.next();
                System.out.print("Enter the account balance name: ");
                balance = input.nextDouble();
                System.out.print("Enter the account withdraw limit name: ");
                withdrawLimit = input.nextDouble();
                account = new Account(accountNumber,holder,balance,withdrawLimit);

                System.out.println(account.toString());

                System.out.print("Enter the amount you wish to withdraw: ");
                withdrawAmount = input.nextDouble();
                account.withdraw(withdrawAmount);

                System.out.println(account.toString());

                System.out.println("Wish to run again? (Y/N)");
                if (input.next().toLowerCase().charAt(0) == 'N') {
                    System.exit(0);
                }

            } catch (InputMismatchException inputError) {
                System.out.println("Input error: You must enter only numbers, '-', '.'.");
            } catch (DomainException error) {
                System.out.println(error.getMessage());
            }
        }
    }
}
