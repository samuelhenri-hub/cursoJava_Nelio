package Modulo1.exercicios_modulo4;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1;
        num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int num2;
        num2 = sc.nextInt();

        int soma = (num1 + num2);
        System.out.print("SOMA: " + soma);
    }
}
