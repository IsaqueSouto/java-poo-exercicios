public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(double saldo, double valor) {
        super("Saldo disponível: R$ " + saldo + " | Valor solicitado: R$ " + valor);
    }
}