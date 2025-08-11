package Modulo1.exercicios_modulo4;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quatro valores:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int soma = num1 + num2 + num3 + num4;
        int diferenca = num1 * num2 - num3 * num4;

        System.out.printf("SOMA = %d%n DIFERENÇA = %d%n", soma, diferenca);
        sc.close();
    }
}
