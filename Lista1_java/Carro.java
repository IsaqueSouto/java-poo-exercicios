public class Carro extends Veiculo implements Tributavel {
    private final int quilometragem;

    public Carro(String placa, double custoFixo, int quilometragem) {
        super(placa, custoFixo);
        this.quilometragem = quilometragem;
    }

    public double calcularCustoTotal() {
        return getCustoFixo() + (quilometragem * 0.15);
    }

    public double calcularIPVA() {
        return getCustoFixo() * 0.04;
    }
}