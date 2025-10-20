package modulo6_while;

import java.util.Scanner;

public class Postoex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int opcao = sc.nextInt();

        while (opcao != 4) {
            if (opcao == 1) {
                alcool += 1;
            }
            else if (opcao == 2) {
                gasolina += 1;
            }
            else if (opcao == 3) {
                diesel += 1;
            }
            else {
                System.out.print("codigo invalido");
            }
            opcao = sc.nextInt();
        }
        System.out.printf("Muito obrigado%n Gasolina: %d%n Alcool: %d%n Diesel: %d", gasolina, alcool, diesel);
        sc.close();
    }
}
