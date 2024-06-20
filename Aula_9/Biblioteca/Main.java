import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Publicacoes> publi = new ArrayList<Publicacoes>();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<UsuarioEspecial> usuariosEsp = new ArrayList<UsuarioEspecial>();

        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        Artigos art = new Artigos("Joselio", "153546", "10/04/2004", "O grande avanço tecnológico", "Banco de dados", "A grande descorberta que mudará a história do uso de Banco de Dados.");
        publi.add(art);
        Artigos art1 = new Artigos("Gustavo", "050547", "10/02/1994", "Spring Boot - Quais as suas vantagens?", "Tecnologia", "O uso do software Spring Boot e as suas vantagens.");
        publi.add(art1);
        Artigos art2 = new Artigos("Jasmine", "287547", "25/06/2018", "O uso de aplicativos de amagrecimento", "Estética e Beleza", "O uso de aplicativos para emagrecimento.");
        publi.add(art2);

        int controle = 0;
        while (controle == 0) {
            System.out.println("\n-----------------------COMANDOS-----------------------");
            System.out.println("1 - Adicionar um usuário");
            System.out.println("2 - Adicionar um usuário especial");
            System.out.println("3 - Realizar um empréstimo");
            System.out.println("4 - Adicionar um artigo ao sistema");
            System.out.println("5 - Adicionar um livro ao sistema");
            System.out.println("6 - Adicionar uma tese ao sistema");
            System.out.println("------------------------------------------------------");
            System.out.print("Digite o comando a ser realizado: ");
            int comando = sc.nextInt();

            switch (comando) {
                case 1:
                    usuarios.add((Usuario) biblioteca.cadUsuario());
                    break;
                case 2:
                    usuariosEsp.add((UsuarioEspecial) biblioteca.cadUsuarioEspecial());
                        break;
                case 3:
                    System.out.println("\n-----------------------PUBLICAÇÕES-----------------------");
                    for(int i=0;i<publi.size();i++){
                        System.out.println(i+1+" - "+publi.get(i).getTitulo());
                    }
                    System.out.println("---------------------------------------------------------");
                    System.out.print("Escolha a Publicação a ser emprestada: ");
                    int escolha = sc.nextInt();
                    if (escolha > publi.size() || escolha == 0) {
                        System.out.println("\nPublicação não encontrada!");

                        break;
                    }
                    
                    sc.nextLine();
                    System.out.print("Digite o CPF do usuário: ");
                    String cpf = sc.nextLine();
                    
                    for(int i=0;i<usuarios.size();i++){
                        if(cpf.equals(usuarios.get(i).getCpf())){
                            if (usuarios.get(i).getQtdEmpr() > 0) {
                                if (biblioteca.emprestimo(publi.get(escolha-1).emprestado) == true) {
                                    publi.get(escolha-1).setEmprestado(true);
                                    publi.get(escolha-1).setCpfUsuario(usuarios.get(i).getCpf());
                                    usuarios.get(i).setQtdEmpr(usuarios.get(i).getQtdEmpr()-1);
                                }
                            }else System.out.println("\nUsuário com quantidade de empréstimos esgotado!");
                        }
                    }
                    for(int i=0;i<usuariosEsp.size();i++){
                        if (cpf == usuariosEsp.get(i).getCpf()) {
                            if (biblioteca.emprestimo(publi.get(escolha-1).emprestado) == true) {
                                publi.get(escolha-1).setEmprestado(true);
                                publi.get(escolha-1).setCpfUsuario(usuariosEsp.get(i).getCpf());
                            }
                        }
                    }
                    break;
                case 4:
                    publi.add((Artigos) biblioteca.addArtigo());
                    break;
                case 5:
                    publi.add((Livros) biblioteca.addLivro());
                    break;
                case 6:
                    publi.add((Teses) biblioteca.addTese());
                    break;
            }
        }
    }
}