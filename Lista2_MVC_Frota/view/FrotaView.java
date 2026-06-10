public class FrotaView {

    private final FrotaController controller = new FrotaController();

    public void iniciar() {

        controller.adicionarVeiculo(
                new Carro("ABC1234", 2000, 3000));

        controller.adicionarVeiculo(
                new Caminhao("XYZ9876", 5000, 8));

        System.out.println("Lista de veiculos");

        for (Veiculo v : controller.listarVeiculos()) {
            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Custo total: " + v.calcularCustoTotal());
            System.out.println();
        }

        controller.salvarFrota("frota.txt");

        System.out.println("Dados salvos no arquivo:");
        controller.lerFrota("frota.txt");
    }
}