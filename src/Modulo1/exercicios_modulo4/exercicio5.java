package Modulo1.exercicios_modulo4;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto = ");
        int cod = sc.nextInt();
        System.out.print("Quantidade = ");
        double qntd = sc.nextInt();
        System.out.print("Preço = ");
        double preco = sc.nextDouble();

        System.out.print("Codigo do produto = ");
        int cod2 = sc.nextInt();
        System.out.print("Quantidade = ");
        double qntd2 = sc.nextInt();
        System.out.print("Preço = ");
        double preco2 = sc.nextDouble();

        double valor1 = qntd * preco + qntd2 * preco2;
        System.out.printf("VALOR A PAGAR = %.2f", valor1);

        sc.close();
    }
}
