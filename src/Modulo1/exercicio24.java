package Modulo1;


public class exercicio24 {

    public static void main(String[] args) {

        String produto1 = "Computador";
        String produto2 = "Mesa de escritorio";

        int idade = 30;
        int cod = 5290;
        char sexo = 'F';

        double preco1 = 2.100;
        double preco2 = 610.0;
        double medida = 53.873849;

        System.out.printf("Produtos:%n %s o preço é de R$ %.3f reais%n %s o preço é de R$ %.2f reais%n", produto1, preco1, produto2, preco2);
        System.out.printf("Registro:%d anos de idade, codigo: %d e o genero: %s %n", idade, cod, sexo);
        System.out.printf("Medida com oito casas decimais: %.8f%n Aredondando: %.3f%n", medida, medida);
        System.out.printf("Ponto decimal dos EUA: %.2f%n", medida);

    }
}
