package IntPoo.Ex1.Entidades;

public class produtos {
    public String nome;
    public double preco;
    public int quantidade;

    public double totalEstoque() {
        return preco * quantidade;
    }

    public void addEstoque (int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos (int quantidade) {
        this.quantidade -= quantidade;
    }
}
