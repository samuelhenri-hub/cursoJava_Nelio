package modulo5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double divi = a / b;

        if (divi == 0) {
            System.out.print("SAO MULTIPLOS");
        }
        else {
            System.out.print("NAO SAO MULTIPLOS");
        }
        sc.close();
    }
}
