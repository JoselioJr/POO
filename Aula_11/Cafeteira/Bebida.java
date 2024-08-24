public class Bebida extends ItemCardapio{
    private int tamanho;
    private String temperatura;
    
    public Bebida(String nome, double preco, int tamanho, String temperatura) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.temperatura = temperatura;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    
    @Override
    public double calcularPreco() {
        if (getTamanho() == 1) {
            return getPreco() + 5;
        }else if (getTamanho() == 2){
            return getPreco() + 3;
        }else return getPreco() + 2;
    }

    @Override
    public String descrever() {
        return "Produto: "+getNome()+"\nTamanho: "+getTamanho()+"\nTemperatura: "+getTemperatura()+"\nPreço: "+calcularPreco();
    }

    
}