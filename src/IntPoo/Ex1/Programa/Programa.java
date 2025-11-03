package IntPoo.Ex1.Programa;

import IntPoo.Ex1.Entidades.produtos;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        produtos produtos = new produtos();

        System.out.println("Digite as seguintes informações do produto");

        sc.close();
    }
}
