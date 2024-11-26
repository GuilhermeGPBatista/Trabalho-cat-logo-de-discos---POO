import java.util.ArrayList;
import java.util.List;

public class Disco {
    String titulo;
    int anoLancamento;
    String artista;
    List<String> faixas = new ArrayList<>();

    public Disco(String titulo, int anoLancamento, String artista) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
    }

    public void adicionarFaixa(String faixa) {
        faixas.add(faixa);
    }

    public String toString() {
        return "Título: " + titulo
                + ", Ano: " + anoLancamento
                + ", Artista: " + artista
                + ", Faixas: " + faixas;
    }
}


