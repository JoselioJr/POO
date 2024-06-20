public class Teses extends Artigos {
    private int numPaginas;
    private String dataDefesa;
    private String instituicao;

    public Teses(String nomeAutor, String titulacao, String dataPublicacao, String titulo, String referencia,
            String resumo, int numPaginas, String dataDefesa, String instituicao) {
        super(nomeAutor, titulacao, dataPublicacao, titulo, referencia, resumo);
        this.numPaginas = numPaginas;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}