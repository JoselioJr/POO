public class Artigos extends Publicacoes {
    private String resumo;

    public Artigos(String nomeAutor, String titulacao, String dataPublicacao, String titulo, String referencia,
            String resumo) {
        super(nomeAutor, titulacao, dataPublicacao, titulo, referencia);
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
