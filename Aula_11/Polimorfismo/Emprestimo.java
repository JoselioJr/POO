public class Emprestimo {
    private Veiculo veiculo;
    private Pessoa pessoa;
    private Locadora locadora;

    public Emprestimo(Veiculo veiculo, Pessoa pessoa, Locadora locadora) {
        this.veiculo = veiculo;
        this.pessoa = pessoa;
        this.locadora = locadora;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Locadora getLocadora() {
        return locadora;
    }

    public void setLocadora(Locadora locadora) {
        this.locadora = locadora;
    }

    public boolean RealizarEmprestimo(){
        if (VerificarQuantidadeEmprestimo(getPessoa()) == true) {
            if (VerificarDiponibildiaVeiculo(getVeiculo()) == true) {
                System.out.println("\nEmpréstimo realizado!");
                getLocadora().RemoverCarroDisponível(getVeiculo());
                return true;
            }else {
                System.out.println("\nEmpréstimo não realizado!");
                return false;
            }
        }else {
            System.out.println("\nEmpréstimo não realizado!");
            return false;
        }
    }

    public void RenovarEmprestimo(){
        System.out.println("\nRenovação realizada com sucesso!");
        getVeiculo().setRenovacoes(getVeiculo().getRenovacoes()+1);
    }

    public void CancelarEmprestimo(){
        getPessoa().setEmprestimos(getPessoa().getEmprestimos()+1);
        getVeiculo().setEmprestado(false);

        System.out.println("\n--------------DADOS DO EMPRÉSTIMO--------------");
        if (getPessoa() instanceof PessoaJuridica) {
            PessoaJuridica pj = ((PessoaJuridica)getPessoa());

            System.out.println("Empresa: "+pj.getNome());
            System.out.println("Nome do Representante: "+pj.getNomeRepresentante());
        }else System.out.println("Nome Cliente: "+getPessoa().getNome());
        
        System.out.println("Veículo: "+getVeiculo().getMarca()+" - "+getVeiculo().getModelo());
        System.out.println("\n--------------COBRANÇA--------------");
        System.out.println("Valor do Empréstimo: "+getVeiculo().getValor());
        System.out.println("Valor de Multa em Renovações: "+getVeiculo().CalculoMulta());
        System.out.println("Total: "+(getVeiculo().getValor()+getVeiculo().CalculoMulta()));

        getVeiculo().setRenovacoes(0);
        getLocadora().AdicionarCarroDisponível(getVeiculo());
    }

    public boolean VerificarDiponibildiaVeiculo(Veiculo veiculo){
        if (veiculo.isEmprestado() == true) {
            if (getPessoa() instanceof PessoaFisica) {
                if (getPessoa().getEmprestimos()==0) {
                    getPessoa().setEmprestimos(1);
                }
            }
            System.out.println("\nVeículo indiponível!");
            return false;
        }else {
            veiculo.setEmprestado(true);
            return true;
        } 
    }

    public boolean VerificarQuantidadeEmprestimo(Pessoa pessoa){
        if (pessoa instanceof PessoaFisica) {
            if (pessoa.getEmprestimos()>0) {
                pessoa.setEmprestimos(pessoa.getEmprestimos()-1);
                return true;
            }else {
                System.out.println("\nQuantidade de empréstimos para cliente indiponíveis!");
                return false;
            }
        }else if (pessoa instanceof PessoaJuridica){
            pessoa.setEmprestimos(pessoa.getEmprestimos()-1);
            return true;
        }else return false;
    }
}
