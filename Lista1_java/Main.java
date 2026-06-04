public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Gerente("Ana", 5000, 1000);
        Funcionario f2 = new Desenvolvedor("Carlos", 4000, 10);

        System.out.println(f1.getNome() + " - " + f1.calcularSalario());
        System.out.println(f2.getNome() + " - " + f2.calcularSalario());

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(new Produto("Mouse", 100));
        carrinho.aplicarDescontoGeral(10);

        ContaBancaria conta = new ContaBancaria("João", 500);

        try {
            conta.sacar(600);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            new Carro("ABC12", 1000, 500);
        } catch (PlacaInvalidaException e) {
            System.out.println(e.getMessage());
        }

        GerenciadorFrota gf = new GerenciadorFrota();

        gf.adicionarVeiculo(new Carro("ABC1234", 1000, 500));
        gf.adicionarVeiculo(new Caminhao("XYZ9876", 2000, 10));

        gf.salvarDadosEmArquivo("frota.txt");
        gf.lerDadosDoArquivo("frota.txt");
    }
}