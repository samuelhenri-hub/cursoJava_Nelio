package modulo6_while;

import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 || y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("QUADRANTE 1");
            }
            else if (x < 0 && y > 0) {
                System.out.println("QUADRANTE 2");
            }
            else if (x < 0 && x < 0) {
                System.out.println("QUADRANTE 3");
            }
            else {
                System.out.println("QUADRANTE 4");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
