import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor para a soma:");
        int valor1 = input.nextInt();
        System.out.println("Entre com o segundo valor para a soma:");
        int valor2 = input.nextInt();
        System.out.println("Soma dos valores é: "+ (valor1+valor2));
        System.out.println("Digite o raio da circunferência:");
        System.out.printf("%.2f\n", (Math.pow(input.nextDouble(), 2)*3.14159));
        System.out.println("Digite 4 valor separados por espaço:");
        int valor3 = input.nextInt();
        int valor4 = input.nextInt();
        int valor5 = input.nextInt();
        int valor6 = input.nextInt();
        System.out.println("Resultado da diferença do produto de A e B pelo produto de C e D:" + (valor3*valor4 - valor5*valor6));
        input.close();
    }
}