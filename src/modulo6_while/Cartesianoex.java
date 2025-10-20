package modulo6_while;

import java.util.Scanner;

public class Cartesianoex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cordena x: ");
        int x = sc.nextInt();

        System.out.println("Cordena y: ");
        int y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.print("Primeiro quadrante");
            }
            else if (x < 0 &&  y > 0) {
                System.out.print("Segundo quadrante");
            }
            else if (x < 0 &&  y < 0) {
                System.out.print("Terceiro quadrante");
            }
            else if (x > 0 &&  y < 0) {
                System.out.print("Quarto quadrante");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
