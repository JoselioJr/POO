public class Publicacoes extends Autor{
    private String dataPublicacao;
    private String titulo;
    private String referencia;
    private String cpfUsuario;
    boolean emprestado = false;
    
    public Publicacoes(String nomeAutor, String titulacao, String dataPublicacao, String titulo, String referencia) {
        super(nomeAutor, titulacao);
        this.dataPublicacao = dataPublicacao;
        this.titulo = titulo;
        this.referencia = referencia;
        this.cpfUsuario = null;
        this.emprestado = false;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}