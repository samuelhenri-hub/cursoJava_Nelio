package IntPoo.Ex1.Programa;

import IntPoo.Ex1.Entidades.Retagulo;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retagulo rect = new Retagulo();

        System.out.println("INSIRA A ALTURA E LARGURA DO RETANGULO");
        rect.altura = sc.nextDouble();
        rect.largura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETRO = %.2f%n", rect.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        sc.close();
    }
}
