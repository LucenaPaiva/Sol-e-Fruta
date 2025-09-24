import java.util.ArrayList;

public class Pedido {
    private int numero;
    private String cliente;
    private ArrayList<Item> itens;

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

           return itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}