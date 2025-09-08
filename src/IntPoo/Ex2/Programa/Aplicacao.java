package IntPoo.Ex2.Programa;

import IntPoo.Ex2.Entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario salario = new Funcionario();

        System.out.print("Nome: ");
        salario.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        salario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        salario.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + salario);
        System.out.println();
        System.out.print("Quanto adiciona no seu salario: ");

        double percentage = sc.nextDouble();
        salario.aumento(percentage);

        System.out.println();
        System.out.println("Atualização: " + salario);

        sc.close();
    }
}
