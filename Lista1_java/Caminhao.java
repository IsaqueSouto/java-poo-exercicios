public class Caminhao extends Veiculo implements Tributavel {
    private final double toneladasCarga;

    public Caminhao(String placa, double custoFixo, double toneladasCarga) {
        super(placa, custoFixo);
        this.toneladasCarga = toneladasCarga;
    }

    public double calcularCustoTotal() {
        return getCustoFixo() + (toneladasCarga * 50);
    }

    public double calcularIPVA() {
        return getCustoFixo() * 0.015;
    }
}