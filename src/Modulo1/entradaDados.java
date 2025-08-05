package Modulo1;

import javax.xml.transform.stream.StreamSource;
import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

    private static Locale locale;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);

        String nome;
        nome = sc.next();
        System.out.println("Seu nome é: " + nome);

        int idade;
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

        double altura;
        altura = sc.nextDouble();
        System.out.println("Sua altura é: " + altura);

        char genero;
        genero = sc.next().charAt(0);
        System.out.println("O Seu genero é: " + genero);

        sc.close();
    }
}
