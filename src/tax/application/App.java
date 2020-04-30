package tax.application;

import tax.entities.LegalEntity;
import tax.entities.NaturalPerson;
import tax.entities.TaxPayer;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);
    static ArrayList<TaxPayer> payers = new ArrayList<>();

    public static void main(String[] args) {
        String name;
        double annualIncome;
        char taxPayerType;

        System.out.print("Enter the number of tax payers: ");
        int taxPayersAmount = input.nextInt();
        for (int i = 1; i <= taxPayersAmount; i++) {
            System.out.println("Tax payer #"+ i +" data:");
            System.out.print("Individual or company: (i/c) ");
            taxPayerType = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            name = input.nextLine();
            System.out.print("Annual Income: $ ");
            annualIncome = input.nextDouble();

            if (taxPayerType == 'c') {
                legalEntity(name, annualIncome);
            } else {
                naturalPerson(name, annualIncome);
            }
        }

        System.out.println("Taxes paid:");
        double taxPaidTotal = 0;
        for (TaxPayer payer: payers) {
            System.out.println();
            System.out.printf(payer.getName()+": $%,.2f", payer.taxAmount());
            taxPaidTotal += payer.taxAmount();
        }
        System.out.println();
        System.out.println();
        System.out.printf("Total taxes paid: $%,.2f", taxPaidTotal);
    }

    static void legalEntity(String name, double annualIncome){
        System.out.print("Number of employees: ");
        int amountEmployees = input.nextInt();
        LegalEntity entity = new LegalEntity(name, annualIncome, amountEmployees);
        payers.add(entity);
    }
    static void naturalPerson(String name, double annualIncome){
        System.out.print("Healthcare expenses: $ ");
        double healthcareExpenses = input.nextDouble();
        NaturalPerson person = new NaturalPerson(name, annualIncome, healthcareExpenses);
        payers.add(person);
    }
}
