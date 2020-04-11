package BankAccount;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        double saldo;
        int numeroConta;
        Conta conta;

        System.out.println("Qual o nome do titular da conta?");
        nome = input.nextLine();
        System.out.println("Qual o número da conta?");
        numeroConta = input.nextInt();
        input.nextLine();
        System.out.println("A conta possui um depósito inicial?");
        System.out.println("S - para sim\n"+
                           "N - para não");
        if(Character.toLowerCase(input.nextLine().charAt(0)) == 's'){
            System.out.println("Qual o valor do depósito inicial?");
            conta = new Conta(nome, numeroConta, input.nextDouble());
        } else {
            conta = new Conta(nome, numeroConta);
        }

        System.out.println(conta);

        System.out.println("Digite o valor do depósito:");
        System.out.println(conta.deposito(input.nextDouble()));

        System.out.println(conta.saldo());

        System.out.println("Qual o valor do saque que você gostaria de realizar?");
        System.out.println(conta.saque(input.nextDouble()));
        input.nextLine();

        System.out.println("Digite o novo nome do titular:");
        conta.setTitularConta(input.nextLine());

        System.out.println(conta);
    }
}
