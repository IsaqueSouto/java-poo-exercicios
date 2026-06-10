import java.util.ArrayList;
import java.util.List;

public class FrotaController {

    private final List<Veiculo> frota = new ArrayList<>();
    private final VeiculoRepository repository = new VeiculoRepository();

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public List<Veiculo> listarVeiculos() {
        return frota;
    }

    public void salvarFrota(String arquivo) {
        repository.salvar(frota, arquivo);
    }

    public void lerFrota(String arquivo) {
        repository.ler(arquivo);
    }
}