import java.io.*;
import java.util.*;

public class GerenciadorFrota {
    private final List<Veiculo> frota = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void salvarDadosEmArquivo(String nomeArquivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                bw.write(v.getPlaca());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void lerDadosDoArquivo(String nomeArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}