package modulo5;

import java.util.Scanner;

public class ex5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int qntde = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = qntde * 4;
        }
        else if (codigo == 2) {
            total = qntde * 4.5;
        }
        else if (codigo == 3) {
            total = qntde * 5;
        }
        else if (codigo == 4) {
            total = qntde * 2;
        }
        else {
            total = qntde * 1.50;
        }

        System.out.printf("TOTAL: %.2f", total);
        sc.close();
    }
}
