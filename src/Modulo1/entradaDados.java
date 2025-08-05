package Modulo1;

import java.util.Scanner;

public class entradaDados {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome;
        nome = sc.next();

        System.out.print("Digite sua idade: ");
        int idade;
        idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura;
        altura = sc.nextDouble();

        System.out.print("Digite seu sexo: ");
        char genero;
        genero = sc.next().charAt(0);

        System.out.printf("Seu nome é: %s %n Você tem %d anos %n Sua altura é de %.2f metros%n Seu sexo é: %s ", nome, idade, altura, genero);

        sc.close();
    }
}
