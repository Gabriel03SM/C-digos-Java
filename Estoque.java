import java.util.Scanner;

public class Estoque {
    static int numMax = 5; // tamanho inicial do array
    static String[] produtos = new String[numMax];
    static int quantidade = 0; // quantos produtos já foram cadastrados

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    adicionarProduto(sc);
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    static void adicionarProduto(Scanner sc) {
        // se o array já está cheio, aumenta antes de adicionar
        if (quantidade == numMax) {
            aumentarArray();
        }

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        produtos[quantidade] = nome;
        quantidade++;
        System.out.println("Produto adicionado!");
    }

    static void aumentarArray() {
        numMax = numMax * 2; // dobra o tamanho
        String[] novoArray = new String[numMax];

        for (int i = 0; i < produtos.length; i++) {
            novoArray[i] = produtos[i];
        }

        produtos = novoArray;
        System.out.println("Array cheio! Redimensionado para " + numMax + " posições.");
    }

    static void listarProdutos() {
        System.out.println("\n--- Produtos cadastrados ---");
        if (quantidade == 0) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (int i = 0; i < quantidade; i++) {
            System.out.println((i + 1) + " - " + produtos[i]);
        }
    }
}
