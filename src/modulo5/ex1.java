package modulo5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.print("NÃO NEGATIVO");
        }
        else {
            System.out.print("NEGATIVO");
        }

        sc.close();
    }
}
