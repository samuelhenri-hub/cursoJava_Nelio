package modulo6_for;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b == 0) {
                System.out.print("Divisao impossivel");
            }
            else {
                double divisao = a / b;
                System.out.print(divisao);
            }
        }
        sc.close();
    }
}
