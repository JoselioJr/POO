import java.util.Scanner;

public class Biblioteca {
    private String nome;
    private String endereco;
    Publicacoes publi;
    
    Scanner sc = new Scanner(System.in);

    public Biblioteca() {
        this.nome = "Biblioteca Renascer";
        this.endereco = "Rua Major F 41, Num: 371, Centro";
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

    Object cadUsuario(){
        System.out.print("Digite o nome do Usuário: ");
        String nome = sc.nextLine();
        System.out.print("Digite o telefone do Usuário: ");
        String telefone = sc.nextLine();
        System.out.print("Digite o E-mail do Usuário: ");
        String email = sc.nextLine();
        System.out.print("Digite o CPF do Usuário: ");
        String cpf = sc.nextLine();

        Usuario usu = new Usuario(nome, telefone, email, cpf);

        return usu;
    }

    Object cadUsuarioEspecial(){
        System.out.print("Digite o nome do Usuário: ");
        String nome = sc.nextLine();
        System.out.print("Digite o telefone do Usuário: ");
        String telefone = sc.nextLine();
        System.out.print("Digite o E-mail do Usuário: ");
        String email = sc.nextLine();
        System.out.print("Digite o CPF do Usuário: ");
        String cpf = sc.nextLine();

        UsuarioEspecial usu = new UsuarioEspecial(nome, telefone, email, cpf);

        return usu;
    }

    Object addArtigo(){
        System.out.print("Digite o nome do Autor: ");
        String autor = sc.nextLine();
        System.out.print("Digite a Titulação: ");
        String titulacao = sc.nextLine();
        System.out.print("Digite a Data de Publicação: ");
        String dtPublicacao = sc.nextLine();
        System.out.print("Digite o Título: ");
        String titulo = sc.nextLine();
        System.out.print("Digite a Referência: ");
        String referencia = sc.nextLine();
        System.out.print("Digite o Resumo: ");
        String resumo = sc.nextLine();

        Artigos artigo = new Artigos(autor, titulacao, dtPublicacao, titulo, referencia, resumo);

        return artigo;
    }

    Object addLivro(){
        System.out.print("Digite o nome do Autor: ");
        String autor = sc.nextLine();
        System.out.print("Digite a Titulação: ");
        String titulacao = sc.nextLine();
        System.out.print("Digite a Data de Publicação: ");
        String dtPublicacao = sc.nextLine();
        System.out.print("Digite o Título: ");
        String titulo = sc.nextLine();
        System.out.print("Digite a Referência: ");
        String referencia = sc.nextLine();
        System.out.print("Digite o Número de Edição: ");
        int numEd = sc.nextInt();
        System.out.print("Digite a Editora: ");
        String editora = sc.nextLine();
        System.out.print("Digite o ISBN: ");
        String isbn = sc.nextLine();

        Livros livro = new Livros(autor, titulacao, dtPublicacao, titulo, referencia, numEd, editora, isbn);

        return livro;
    }

    Object addTese(){
        System.out.print("Digite o nome do Autor: ");
        String autor = sc.nextLine();
        System.out.print("Digite a Titulação: ");
        String titulacao = sc.nextLine();
        System.out.print("Digite a Data de Publicação: ");
        String dtPublicacao = sc.nextLine();
        System.out.print("Digite o Título: ");
        String titulo = sc.nextLine();
        System.out.print("Digite a Referência: ");
        String referencia = sc.nextLine();
        System.out.print("Digite o Resumo: ");
        String resumo = sc.nextLine();
        System.out.print("Digite o número de Páginas: ");
        int editora = sc.nextInt();
        System.out.print("Digite a Data de Defesa: ");
        String dtDefesa = sc.nextLine();
        System.out.print("Digite a Instituição: ");
        String iinstituicao = sc.nextLine();

        Teses tese = new Teses(autor, titulacao, dtPublicacao, titulo, referencia, resumo, editora, dtDefesa, iinstituicao);

        return tese;
    }

    boolean emprestimo(boolean emp){
        if (emp == true) {
            System.out.println("\nPublicação já em empréstimo!");
            return false;
        }else {
            System.out.println("\nEmpréstimo realizado com sucesso!");
            return true;
        }
    }
}