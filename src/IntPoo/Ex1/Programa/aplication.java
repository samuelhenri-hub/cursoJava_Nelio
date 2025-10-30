package IntPoo.Ex1.Programa;

import IntPoo.Ex1.Entidades.retangulo1;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        retangulo1 x, y;
        x = new retangulo1();
        y = new retangulo1();

        System.out.println("Medidas do triangulo x: ");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();

        System.out.println("Medidas do triangulo y: ");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        sc.close();
    }
}
