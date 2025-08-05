package Modulo1;

public class concatenar {

    public static void main(String[] args) {

        double alt = 1.753456;
        System.out.println(alt);
        System.out.printf("%.2f%n", alt);

        System.out.println("Minha altura=" + alt + "Metros");
        System.out.printf("Minha altura= %.2f metros %n", alt);

        String carro = "Kwid";
        int ano = 2021;
        double preco = 75.500;

        System.out.printf("%s foi lançado no ano de %d e custa R$ %.3f mil%n", carro, ano, preco);
    }
}
