package modulo5;

import java.util.Scanner;

public class ex2 {
    public static void main (String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("É PAR");
        }
        else {
            System.out.print("É IMPAR");
        }
        sc.close();
    }
}
