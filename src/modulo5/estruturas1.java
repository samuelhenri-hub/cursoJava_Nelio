package modulo5;

import java.util.Scanner;

public class estruturas1 {
    public static void main(String [] args) {

        Scanner sc = new Scanner (System.in);

        int hora;
        System.out.print("Que horas são? ");
        hora = sc.nextInt();

        if ( hora < 12) {
            System.out.print("Bom dia!!");
        }
        else if (hora >= 12) {
            System.out.print("Boa tarde!!");
        }
        else {
            System.out.print("Boa noire!!");
        }
    }
}
