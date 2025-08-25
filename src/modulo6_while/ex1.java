package modulo6_while;

import java.util.Scanner;

public class ex1 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE SUA SENHA");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("SENHA INVALIDA");
            senha = sc.nextInt();
        }
        System.out.println("SENHA CORRETA");

        sc.close();
    }
}
