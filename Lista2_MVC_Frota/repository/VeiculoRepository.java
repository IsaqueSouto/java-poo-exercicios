import java.io.*;
import java.util.List;

public class VeiculoRepository {

    public void salvar(List<Veiculo> veiculos, String nomeArquivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {

            for (Veiculo v : veiculos) {
                bw.write(v.getPlaca() + ";" + v.calcularCustoTotal());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }

    public void ler(String nomeArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo.");
        }
    }
}