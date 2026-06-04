import java.util.ArrayList;

public class CarrinhoDeCompras {
    private final ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public void aplicarDescontoGeral(double percentual) {
        for (Produto p : produtos) {
            p.aplicarDesconto(percentual);
        }
    }
}