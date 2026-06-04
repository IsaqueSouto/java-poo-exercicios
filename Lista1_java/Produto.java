public class Produto implements Promocional {
    private double preco;

    public Produto(String nome, double preco) {
        this.preco = preco;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }

    public double getPreco() {
        return preco;
    }
}