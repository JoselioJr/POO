public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private int emprestimos;

    public Pessoa(String nome, String telefone, String endereco, int emprestimos) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.emprestimos = emprestimos;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(int emprestimos) {
        this.emprestimos = emprestimos;
    }
}
