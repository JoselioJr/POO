import java.util.ArrayList;

public class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    ArrayList<Veiculo> carrosDisponiveis = new ArrayList<>();
    ArrayList<Pessoa> clientes = new ArrayList<>();
    ArrayList<Emprestimo> emprestimosRealizados = new ArrayList<>();
    
    public Locadora(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void AdicionarCarroDisponível(Veiculo veiculo){
        carrosDisponiveis.add(veiculo);
    }

    public void RemoverCarroDisponível(Veiculo veiculo){
        carrosDisponiveis.remove(veiculo);
    }

    public void AdicionarCliente(Pessoa pessoa){
        clientes.add(pessoa);
    }

    public void AdicionarEmprestimo(Emprestimo emprestimo){
        emprestimosRealizados.add(emprestimo);
    }

    public void RemoverEmprestimo(Emprestimo emprestimo){
        emprestimosRealizados.remove(emprestimo);
    }
}