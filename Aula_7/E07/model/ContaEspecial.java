package model;

public class ContaEspecial extends Conta{
    private PessoaFisica pf;
    private double limite;

    public ContaEspecial(String agencia, String numero, int banco, PessoaFisica pf) {
        super(agencia, numero, banco);
        this.pf = pf;
        this.limite = 1000;
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= getSaldo()+limite){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta contaDestino){
        if(sacar(valor)){
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }
}
