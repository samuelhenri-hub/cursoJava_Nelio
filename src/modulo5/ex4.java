package modulo5;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int hrInicial = sc.nextInt();

        System.out.print("Hora Final: ");
        int hrFinal = sc.nextInt();

        if (hrFinal > hrInicial ) {
            int duracao = hrFinal - hrInicial;

            System.out.print("Duração: " + duracao + " horas");
        }
        else if (hrFinal < hrInicial) {
            int duracao = (24 - hrInicial) + hrFinal;
            System.out.print("Duração: " + duracao + " horas");

        }
        else if (hrFinal == hrInicial) {
            System.out.print("Duração: 24 horas");

        }

        sc.close();
    }
}
