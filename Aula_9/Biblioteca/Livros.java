public class Livros extends Publicacoes {
    private int numeroEdicao;
    private String editora;
    private String isbn;

    public Livros(String nomeAutor, String titulacao, String dataPublicacao, String titulo, String referencia,
            int numeroEdicao, String editora, String isbn) {
        super(nomeAutor, titulacao, dataPublicacao, titulo, referencia);
        this.numeroEdicao = numeroEdicao;
        this.editora = editora;
        this.isbn = isbn;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}