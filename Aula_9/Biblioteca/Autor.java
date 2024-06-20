public class Autor {
    private String nomeAutor;
    private String titulacao;
    public Autor(String nomeAutor, String titulacao) {
        this.nomeAutor = nomeAutor;
        this.titulacao = titulacao;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}