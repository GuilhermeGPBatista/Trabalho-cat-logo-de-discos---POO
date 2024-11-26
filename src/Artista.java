public class Artista {
    String nome;
    String genero;

    public Artista(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String toString() {
        return "Nome: " + nome + ", Gênero: " + genero;
    }
}

