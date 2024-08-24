import java.util.ArrayList;

public class Pedido {
    ArrayList<ItemCardapio> pedido = new ArrayList<>();

    public void AdicionarItem(ItemCardapio item){
        pedido.add(item);
    }

    public double CalcularTotalPedido(){
        double total = 0;
        for(ItemCardapio item : pedido){
            total += item.calcularPreco();
        }
        return total;
    }

    public void descricaoPedido() {
        for (ItemCardapio item : pedido) {
            System.out.println(item.descrever());
        }
        System.out.println("Total do pedido: "+CalcularTotalPedido());
    }
}
