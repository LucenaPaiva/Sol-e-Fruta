import java.util.ArrayList;
import java.util.Scanner;

public class SolEFruta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        int numeroPedido = 1;
        int opcao;

        do {
            System.out.println("===== Sol e Fruta - Menu Principal =====");
            System.out.println("1. Registrar Pedido");
            System.out.println("2. Remover Pedido");
            System.out.println("3. Listar Pedidos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    Pedido pedido = new Pedido(numeroPedido, nomeCliente);

                    String maisItem;
                    do {
                        System.out.print("Nome do item (ex: Salada Tropical): ");
                        String nomeItem = scanner.nextLine();
                        System.out.print("Preço do item: R$ ");
                        double precoItem = scanner.nextDouble();
                        scanner.nextLine(); // Limpa o buffer

                        pedido.adicionarItem(new Item(nomeItem, precoItem));

                        System.out.print("Adicionar outro item? (s/n): ");
                        maisItem = scanner.nextLine();
                    } while (maisItem.equalsIgnoreCase("s"));

                    pedidos.add(pedido);
                    numeroPedido++;

                    imprimirNota(pedido);
                    break;

                case 2:
                    System.out.print("Digite o número do pedido para remover: ");
                    int numeroRemover = scanner.nextInt();
                    scanner.nextLine();

                    boolean removido = false;
                    for (Pedido p : pedidos) {
                        if (p.getNumero() == numeroRemover) {
                            pedidos.remove(p);
                            removido = true;
                            System.out.println("Pedido removido com sucesso.");
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Pedido não encontrado.");
                    }
                    break;

                case 3:
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido registrado.");
                    } else {
                        for (Pedido p : pedidos) {
                            imprimirNota(p);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }

    public static void imprimirNota(Pedido pedido) {
        System.out.println("\n========================================");
        System.out.println(" Restaurante Sol e Fruta ");
        System.out.println("========================================");
        System.out.println("Pedido N°: " + pedido.getNumero());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("----------------------------------------");
        System.out.println("Itens:");
        for (Item item : pedido.getItens()) {
            System.out.println("- " + item.getNome() + " R$ " + item.getPreco());
        }
        System.out.println("----------------------------------------");
        System.out.println("Total: R$ " + pedido.calcularTotal());
        System.out.println("========================================");
        System.out.println(" Obrigado pela preferência! :) ");
        System.out.println("========================================\n");
    }
}