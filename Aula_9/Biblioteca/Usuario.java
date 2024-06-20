public class Usuario extends Pessoa{
    private int qtdEmpr;

    public Usuario(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
        this.qtdEmpr = 1;
    }

    public int getQtdEmpr() {
        return qtdEmpr;
    }

    public void setQtdEmpr(int qtdEmpr) {
        this.qtdEmpr = qtdEmpr;
    }
}