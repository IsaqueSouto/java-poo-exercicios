public class Desenvolvedor extends Funcionario {
    private final int horasExtras;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * 50.0);
    }
}