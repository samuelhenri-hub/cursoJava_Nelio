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

        int mais = num1 + num2;
        System.out.printf("Soma: %d %n", mais);
    }
}
