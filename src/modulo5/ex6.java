package modulo5;

import java.util.Scanner;

public class ex6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num = sc.nextDouble();

        if (num >= 0 && num <=25) {
            System.out.print("Intervalo: [0,25]");
        }
        else if (num >= 25 && num <=50) {
                System.out.print("Intervalo: [25,50]");
        }
        else if (num >= 50 && num <=75) {
            System.out.print("Intervalo: [50, 75]");
        }
        else if (num >= 75 && num <=100) {
            System.out.print("Intervalo: [75, 100]");
        }
        else {
            System.out.print("FORA DO INTERVALO!");
        }
        sc.close();
    }
}
