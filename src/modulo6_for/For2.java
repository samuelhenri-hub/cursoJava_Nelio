package modulo6_for;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int out = 0;
        int in = 0;

        for (int x = 0; x < n; x++) {
            int y = sc.nextInt();

            if (y >= 10 && y <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }
        System.out.printf("%d in %n %d out", in, out);

        sc.close();
    }
}
