package Modulo1;

import java.util.Scanner;

public class testeMAtematica {

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
        System.out.printf("Soma: %d %n Subtração: %d %n Multiplicação: %d %n", soma, subtracao, vezes);
    }
}
