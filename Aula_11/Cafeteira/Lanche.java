import java.util.ArrayList;

public class Lanche extends ItemCardapio{
    ArrayList<String> ingredientes = new ArrayList<>();

    public Lanche(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPreco() {
        return getPreco() + ingredientes.size();
    }

    @Override
    public String descrever() {
        return "\nProduto: "+getNome()+"\nIngredientes: "+String.join(",", ingredientes)+"Preço: "+calcularPreco();
    }

    public void AdicionarIngredientes(String ingrediente){
        ingredientes.add(ingrediente);
    }
}