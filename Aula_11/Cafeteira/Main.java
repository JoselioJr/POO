import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ItemCardapio> cardapio = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        boolean loop = true;

        while (loop) {
            System.out.println("\n----------COMANDOS----------");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Realizar Pedido");
            System.out.println("3 - Sair");
            System.out.println("------------------------------");
            System.out.print("Digite o que deseja fazer: ");
            int comando = scan.nextInt();

            switch (comando) {
                case 1:
                System.out.println("\n----------PROTUDOS----------");
                System.out.println("1 - Adicionar Bebida");
                System.out.println("2 - Adicionar Lanche");
                System.out.println("3 - Adicionar Sobremesa");
                System.out.println("------------------------------");
                System.out.print("Digite o que deseja fazer: ");
                int comand = scan.nextInt();
                    switch (comand) {
                        case 1:
                            System.out.print("\nDigite o nome da Bebida: ");
                            scan.nextLine();
                            String nome = scan.nextLine();
                            System.out.print("Digite o Preço: ");
                            double preco = scan.nextDouble();
                            System.out.print("TAMANHOS:\n1 - Grande\n2 - Médio\n3 - Pequeno\nDigite o Tamanho: ");
                            int tamanho = scan.nextInt();
                            System.out.print("Digite a Temperatura desejada: ");
                            scan.nextLine();
                            String temperatura = scan.nextLine();

                            Bebida bebida = new Bebida(nome, preco, tamanho, temperatura);

                            cardapio.add(bebida);
                            break;
                        case 2:
                            System.out.print("\nDigite o nome do Lanche: ");
                            scan.nextLine();
                            String nome2 = scan.nextLine();
                            System.out.print("Digite o Preço: ");
                            double preco2 = scan.nextDouble();
                            System.out.print("Adicione um ingrediente: ");
                            scan.nextLine();
                            String ingrediente = scan.nextLine();

                            Lanche lanche = new Lanche(nome2, preco2);
                            lanche.AdicionarIngredientes(ingrediente);

                            while (true) {
                                System.out.print("Deseja adicionar outro ingrediente (1- S / 2- N)? ");
                                int add = scan.nextInt();

                                if (add == 1) {
                                    System.out.print("Adicione um ingrediente: ");
                                    scan.nextLine();
                                    String novoIngrediente = scan.nextLine();
                                    lanche.AdicionarIngredientes(novoIngrediente);
                                    continue;
                                }else break;
                            }

                            cardapio.add(lanche);
                            
                            break;
                        case 3:
                            System.out.print("Digite o nome da Bebida: ");
                            scan.nextLine();
                            String nome3 = scan.nextLine();
                            System.out.print("Digite o Preço: ");
                            double preco3 = scan.nextDouble();
                            System.out.print("TAMANHOS:\n1 - Grande\n2 - Médio\n3 - Pequeno\nDigite o Tamanho: ");
                            int tamanho2 = scan.nextInt();
                            System.out.print("Digite a Contagem de Calorias: ");
                            int calorias = scan.nextInt();

                            Sobremesa sobremesa = new Sobremesa(nome3, preco3, tamanho2, calorias);
                            cardapio.add(sobremesa);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    Pedido pedido = new Pedido();
                    if (cardapio.size()==0) {
                        System.out.println("Sem itens no cardápio!");
                        break;
                    }else {
                        System.out.println("Escolha o item a ser adicionado no pedido: ");
                        for(int i=0;i<cardapio.size();i++){
                            System.out.println("\n"+(i+1)+":");
                            System.out.println("Item: "+cardapio.get(i).getNome());
                            System.out.println("Preço: "+cardapio.get(i).calcularPreco());
                            System.out.println(cardapio.get(i).descrever());
                        }
                        System.out.print("Escolha: ");
                        int escolha = scan.nextInt();

                        pedido.AdicionarItem(cardapio.get(escolha-1));

                        while (true) {
                            System.out.println("Deseja adicinar outro item (1- S / 2- N)?");
                            int adicionar = scan.nextInt();

                            if (adicionar == 1) {
                                for(int i=0;i<cardapio.size();i++){
                                    System.out.println("\n"+(i+1)+":");
                                    System.out.println("Item: "+cardapio.get(i).getNome());
                                    System.out.println("Preço: "+cardapio.get(i).calcularPreco());
                                    System.out.println(cardapio.get(i).descrever());
                                }
                                System.out.print("Escolha: ");
                                int novaEscolha = scan.nextInt();

                                pedido.AdicionarItem(cardapio.get(novaEscolha-1));
                                continue;
                            }else break;
                        }

                        System.out.println("\n--------------DETALHES DO PEDIDO--------------");
                        pedido.descricaoPedido();
                        break;
                    }
                case 3:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
