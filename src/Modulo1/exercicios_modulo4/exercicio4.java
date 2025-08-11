package Modulo1.exercicios_modulo4;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero = ");
        int fun = sc.nextInt();
        System.out.print("Horas trabaladas = ");
        double hr = sc.nextDouble();
        System.out.print("Salario por hora = ");
        double phr = sc.nextDouble();

        double salario = (hr * phr);

        System.out.printf("NUMERO = %d %n SALARIO = R$ %.4f %n", fun, salario);
    }
}
