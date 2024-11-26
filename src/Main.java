import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Disco> discos = new ArrayList<>();
    static List<Artista> artistas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1 - Cadastrar Disco");
            System.out.println("2 - Cadastrar Artista");
            System.out.println("3 - Listar Discos");
            System.out.println("4 - Editar Disco");
            System.out.println("5 - Remover Disco");
            System.out.println("6 - Sair...");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: cadastrarDisco(); break;
                case 2: cadastrarArtista(); break;
                case 3: listarDiscos(); break;
                case 4: editarDisco(); break;
                case 5: removerDisco(); break;
                case 6: System.out.println("programa fechado!"); return;
                default: System.out.println("Opção inexistente.");
            }
        }
    }

    static void cadastrarDisco() {
        System.out.println("Título do disco:");
        String titulo = scanner.nextLine();
        System.out.println("Ano de lançamento:");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome do artista:");
        String artista = scanner.nextLine();

        Disco disco = new Disco(titulo, ano, artista);
        System.out.println("Quantas faixas?");
        int numFaixas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numFaixas; i++) {
            System.out.println("Nome da faixa " + (i + 1) + ":");
            String faixa = scanner.nextLine();
            disco.adicionarFaixa(faixa);
        }

        discos.add(disco);
        System.out.println("Disco cadastrado!");
    }

    static void cadastrarArtista() {
        System.out.println("Nome do artista:");
        String nome = scanner.nextLine();
        System.out.println("Gênero musical:");
        String genero = scanner.nextLine();
        artistas.add(new Artista(nome, genero));
        System.out.println("Artista cadastrado!");
    }

    static void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco foi cadastrado.");
            return;
        }
        for (Disco disco : discos) {
            System.out.println(disco);
        }
    }

    static void editarDisco() {
        listarDiscos();
        System.out.println("Número do disco para editar:");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (index < 0 || index >= discos.size()) {
            System.out.println("Esse disco n foi achado! .");
            return;
        }
        System.out.println("Novo título:");
        discos.get(index).titulo = scanner.nextLine();
        System.out.println("Novo ano de lançamento:");
        discos.get(index).anoLancamento = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Disco atualizado!");
    }



    static void removerDisco() {
        listarDiscos();
        System.out.println("Número do disco para remover:");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        if (index < 0 || index >= discos.size()) {
            System.out.println("Esse disco n foi encontrado.");
            return;
        }
        discos.remove(index);
        System.out.println("Disco foi pro lixo :)!");
    }
}



