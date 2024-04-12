package model;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    
    public void setCnpj(String cnpj) {
        if(cnpj.length()!=14){
            System.out.println("CNPJ INVÁLIDO!");
        }else{
            this.cnpj = cnpj;
        }
    }
}