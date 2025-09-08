package IntPoo.Ex1.Entidades;

public class Retagulo {
    public double altura;
    public double largura;

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return 2 * (altura + largura);
    }

    public double diagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
}
