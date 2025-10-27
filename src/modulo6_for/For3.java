package modulo6_for;

import java.awt.*;
import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a + b + c) / 10;
            System.out.print(media);
        }
    }
}
