package model;

public class ContaEmpresarial extends Conta{
    PessoaJuridica pj;
    private double limite;
    
    public ContaEmpresarial(String agencia, String numero, int banco, PessoaJuridica pj) {
        super(agencia, numero, banco);
        this.pj = pj;
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
