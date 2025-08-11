package Modulo1;

import java.util.Scanner;

public class testeMatematica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num1;
        num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        double num2;
        num2 = sc.nextInt();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double vezes = num1 * num2;
        double divisao = num1/num2;
        System.out.printf("Soma: %.2f%n Subtração:%.2f%n Multiplicação: %.2f%n Divisão: %.4f%n ",
                soma, subtracao, vezes, divisao);

        sc.close();
    }
}
