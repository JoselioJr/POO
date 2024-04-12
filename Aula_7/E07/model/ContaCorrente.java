package model;

public class ContaCorrente extends Conta{
    private PessoaFisica pf;

    public ContaCorrente(String agencia, String numero, int banco, PessoaFisica pf) {
        super(agencia, numero, banco);
        this.pf = pf;
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= getSaldo()){
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