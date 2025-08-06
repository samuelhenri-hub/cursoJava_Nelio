package Modulo1;

import java.util.Scanner;

public class testeMatematica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1;
        num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int num2;
        num2 = sc.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int vezes = num1 * num2;
        double divisao = num1/num2;
        System.out.printf("Soma: %d %n Subtração: %d %n Multiplicação: %d %n Divisão: %.2f%n ",
                soma, subtracao, vezes, divisao);

        sc.close();
    }
}
