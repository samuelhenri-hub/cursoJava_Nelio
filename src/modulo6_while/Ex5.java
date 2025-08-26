package modulo6_while;

import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args ) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int x = 1; x != n; x++) {

            int i = sc.nextInt();

            if (i >= 10 && i <= 20) {
                in += + 1;
            }
            else {
                out += + 1;
            }
        }
        System.out.println("IN: " + in + " OUT: " + out);

        sc.close();
    }
}
