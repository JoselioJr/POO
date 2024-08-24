public class Sobremesa extends ItemCardapio{
    private int tamanhoPorcao;
    private int contagemCalorias;
    
    public Sobremesa(String nome, double preco, int tamanhoPorcao, int contagemCalorias) {
        super(nome, preco);
        this.tamanhoPorcao = tamanhoPorcao;
        this.contagemCalorias = contagemCalorias;
    }

    public int getTamanhoPorcao() {
        return tamanhoPorcao;
    }

    public void setTamanhoPorcao(int tamanhoPorcao) {
        this.tamanhoPorcao = tamanhoPorcao;
    }

    public int getContagemCalorias() {
        return contagemCalorias;
    }

    public void setContagemCalorias(int contagemCalorias) {
        this.contagemCalorias = contagemCalorias;
    }

    @Override
    public double calcularPreco() {
        if (getTamanhoPorcao() == 1) {
            return getPreco() + 5;
        }else if(getTamanhoPorcao() == 2){
            return getPreco() + 3;
        }else return getPreco() + 2;
    }

    @Override
    public String descrever() {
        return "Produto: "+getNome()+"\nTamanho: "+getTamanhoPorcao()+"\nContagem de Calorias: "+getContagemCalorias()+"Preço: "+calcularPreco();
    }   
}