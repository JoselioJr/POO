import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Pessoa> clientes = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("\n--------------------------LOCADORA--------------------------");
        System.out.print("Digite o nome da Locadora: ");
        String nome = scan.nextLine();
        System.out.print("Digite o endereço da Locadora: ");
        String endereco = scan.nextLine();
        System.out.print("Digite o telefone da Locadora: ");
        String telefone = scan.nextLine();

        Locadora locadora = new Locadora(nome, endereco, telefone);

        boolean loop = true;

        while (loop) {
            System.out.println("\n----------COMANDOS----------");
            System.out.println("1 - Adicionar Carro Popular");
            System.out.println("2 - Adicionar Carro de Luxo");
            System.out.println("3 - Adicionar Carro SUV");
            System.out.println("4 - Adicionar Cliente");
            System.out.println("5 - Realizar Empréstimo");
            System.out.println("6 - Renovar Empréstimo");
            System.out.println("7 - Cancelar Empréstimo");
            System.out.println("8 - Sair");
            System.out.println("------------------------------");
            System.out.print("Digite o que deseja fazer: ");
            int comando = scan.nextInt();

            switch (comando) {
                case 1:
                    scan.nextLine();
                    System.out.println("\n--------------------------CARRO POPULAR--------------------------");
                    System.out.print("Digite a marca do Veículo: ");
                    String marca = scan.nextLine();
                    System.out.print("Digite o modelo do Veículo: ");
                    String modelo = scan.nextLine();
                    System.out.print("Digite a placa do Veículo: ");
                    String placa = scan.nextLine();
                    System.out.print("Digite o ano do Veículo: ");
                    int ano = scan.nextInt();
                    System.out.print("Digite o valor de Locação: ");
                    double valor = scan.nextDouble();
                    System.out.print("Digite o valor de Multa: ");
                    double multa = scan.nextDouble();
                    System.out.print("Digite 1 se possui ar-condicionado ou 2 se não possui ar-condicionado: ");
                    int ar = scan.nextInt();
                    if (ar==1) {
                        veiculos.add(new CarroPopular(marca, modelo, placa, ano, valor, multa, true));
                        locadora.AdicionarCarroDisponível(veiculos.get(veiculos.size()-1));
                    }else {
                        veiculos.add(new CarroPopular(marca, modelo, placa, ano, valor, multa, false));
                        locadora.AdicionarCarroDisponível(veiculos.get(veiculos.size()-1));
                    }
                    
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("\n--------------------------CARRO DE LUXO--------------------------");
                    System.out.print("Digite a marca do Veículo: ");
                    String marca1 = scan.nextLine();
                    System.out.print("Digite o modelo do Veículo: ");
                    String modelo1 = scan.nextLine();
                    System.out.print("Digite a placa do Veículo: ");
                    String placa1 = scan.nextLine();
                    System.out.print("Digite o ano do Veículo: ");
                    int ano1 = scan.nextInt();
                    System.out.print("Digite o valor de Locação: ");
                    double valor1 = scan.nextDouble();
                    System.out.print("Digite o valor de Multa: ");
                    double multa1 = scan.nextDouble();
                    System.out.print("Digite a quantidade de AirBags que o veículo possui: ");
                    int air = scan.nextInt();
                    System.out.print("Digite o tamanho do porta-malas: ");
                    scan.nextLine();
                    String tamanho = scan.nextLine();
                    System.out.print("Digite 1 se possui ar-condicionado ou 2 se não possui ar-condicionado: ");
                    int ar1 = scan.nextInt();
                    if (ar1==1) {
                        veiculos.add(new CarroLuxo(marca1, modelo1, placa1, ano1, valor1, multa1, air, tamanho, true));
                        locadora.AdicionarCarroDisponível(veiculos.get(veiculos.size()-1));
                    }else {
                        veiculos.add(new CarroLuxo(marca1, modelo1, placa1, ano1, valor1, multa1, air, tamanho, false));
                        locadora.AdicionarCarroDisponível(veiculos.get(veiculos.size()-1));
                    }

                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("\n--------------------------CARRO SUV--------------------------");
                    System.out.print("Digite a marca do Veículo: ");
                    String marca2 = scan.nextLine();
                    System.out.print("Digite o modelo do Veículo: ");
                    String modelo2 = scan.nextLine();
                    System.out.print("Digite a placa do Veículo: ");
                    String placa2 = scan.nextLine();
                    System.out.print("Digite o ano do Veículo: ");
                    int ano2 = scan.nextInt();
                    System.out.print("Digite o valor de Locação: ");
                    double valor2 = scan.nextDouble();
                    System.out.print("Digite o valor de Multa: ");
                    double multa2 = scan.nextDouble();
                    System.out.print("Digite o tamanho do porta-malas: ");
                    scan.nextLine();
                    String tamanho2 = scan.nextLine();
                    System.out.print("Digite o tipo de tracao: ");
                    String tracao = scan.nextLine();
                    System.out.print("Digite o tipo de combustivel: ");
                    String combustivel = scan.nextLine();
                    
                    veiculos.add(new CarroSuv(marca2, modelo2, placa2, ano2, valor2, multa2, tamanho2, tracao, combustivel));
                    locadora.AdicionarCarroDisponível(veiculos.get(veiculos.size()-1));

                    break;
                case 4:
                    System.out.print("\nDigite 1 para adicionar cliente com CPF ou 2 para adiconar cliente com CNPJ: ");
                    int diferenca = scan.nextInt();

                    if (diferenca == 1) {
                        scan.nextLine();
                        System.out.println("\n--------------------------PESSOA FÍSICA--------------------------");
                        System.out.print("Digite a nome da pessoa: ");
                        String nomePessoaFisica = scan.nextLine();
                        System.out.print("Digite a telefone da pessoa: ");
                        String telefonePessoaFisica = scan.nextLine();
                        System.out.print("Digite a endereco da pessoa: ");
                        String enderecoPessoaFisica = scan.nextLine();
                        System.out.print("Digite a CPF da pessoa: ");
                        String cpfPessoaFisica = scan.nextLine();

                        clientes.add(new PessoaFisica(nomePessoaFisica, telefonePessoaFisica, enderecoPessoaFisica, cpfPessoaFisica));
                        locadora.AdicionarCliente(clientes.get(clientes.size()-1));
                    }else if(diferenca == 2){
                        scan.nextLine();
                        System.out.println("\n--------------------------EMPRESA--------------------------");
                        System.out.print("Digite a nome da Empresa: ");
                        String nomePessoaJuridica = scan.nextLine();
                        System.out.print("Digite a telefone da Empresa: ");
                        String telefonePessoaJuridica = scan.nextLine();
                        System.out.print("Digite a endereco da Empresa: ");
                        String enderecoPessoaJuridica = scan.nextLine();
                        System.out.print("Digite a CNPJ da Empresa: ");
                        String cnpjPessoaJuridica = scan.nextLine();
                        System.out.print("Digite o nome do representante: ");
                        String nomeRepresentante = scan.nextLine();

                        clientes.add(new PessoaJuridica(nomePessoaJuridica, telefonePessoaJuridica, enderecoPessoaJuridica, cnpjPessoaJuridica, nomeRepresentante));
                        locadora.AdicionarCliente(clientes.get(clientes.size()-1));
                    }
                    break;
                case 5:
                    if (veiculos.size()==0 || clientes.size()==0) {
                        System.out.println("\nNenhum cliente ou veículo cadastrado!");
                        break;
                    }else{
                        System.out.println("\n---------------VEÍCULOS---------------");
                        for(int i=0;i<veiculos.size();i++){
                            System.out.println((i+1)+":");
                            System.out.println("Marca: "+veiculos.get(i).getMarca()+" - Modelo: "+veiculos.get(i).getModelo()+" - Ano: "+veiculos.get(i).getAno());
                        }
                        System.out.print("\nEscolha o Veículo para empréstimo: ");
                        int escolhaVeiculo = scan.nextInt();

                        while (escolhaVeiculo>veiculos.size()) {
                            System.out.println("Escolha inválida!");
                            System.out.print("\nEscolha o Veículo para empréstimo: ");
                            int novaEscolhaVeiculo = scan.nextInt();
                            escolhaVeiculo = novaEscolhaVeiculo;
                        }

                        System.out.println("\n---------------CLIENTES---------------");
                        for(int i=0;i<clientes.size();i++){
                            System.out.println((i+1)+":");
                            System.out.println("Nome do cliente: "+clientes.get(i).getNome());
                        }
                        System.out.print("\nEscolha o Cliente: ");
                        int escolhaCliente = scan.nextInt();

                        while (escolhaCliente>clientes.size()) {
                            System.out.println("Escolha inválida!");
                            System.out.print("\nEscolha o Cliente: ");
                            int novaEscolhaCliente = scan.nextInt();
                            escolhaCliente = novaEscolhaCliente;
                        }

                        emprestimos.add(new Emprestimo(veiculos.get(escolhaVeiculo-1), clientes.get(escolhaCliente-1), locadora));
                        if (emprestimos.get(emprestimos.size()-1).RealizarEmprestimo() == true) {
                            locadora.AdicionarEmprestimo(emprestimos.get(emprestimos.size()-1));
                            break;
                        }else {
                            emprestimos.remove(emprestimos.size()-1);
                            break;
                        }
                    }
                case 6:
                    if (veiculos.size()==0 || clientes.size()==0 || emprestimos.size() == 0) {
                        System.out.println("\nNenhum cliente, veículo ou empréstimo cadastrado!");
                        break;
                    }else{
                        System.out.println("\n---------------EMPRÉSTIMOS---------------");
                        for(int i=0;i<emprestimos.size();i++){
                            System.out.println((i+1)+":");
                            System.out.println("Nome cliente: "+emprestimos.get(i).getPessoa().getNome());
                            System.out.println("Marca do Veículo: "+emprestimos.get(i).getVeiculo().getMarca()+" - Modelo: "+emprestimos.get(i).getVeiculo().getModelo());
                            System.out.println("Quantidade de renovações já realizadas: "+emprestimos.get(i).getVeiculo().getRenovacoes());
                        }
                        System.out.print("\nEscolha o Empréstimo a ser renovado: ");
                        int escolhaEmprestimo = scan.nextInt();

                        while (escolhaEmprestimo>emprestimos.size()) {
                            System.out.println("Escolha inválida!");
                            System.out.print("\nEscolha o Empréstimo a ser renovado: ");
                            int novaEscolhaEmprestimo = scan.nextInt();
                            escolhaEmprestimo = novaEscolhaEmprestimo;
                        }

                        emprestimos.get(escolhaEmprestimo-1).RenovarEmprestimo();
                        break;
                    }
                case 7:
                    if (veiculos.size()==0 || clientes.size()==0 || emprestimos.size() == 0) {
                        System.out.println("\nNenhum cliente, veículo ou empréstimo cadastrado!");
                        break;
                    }else{
                        System.out.println("\n---------------EMPRÉSTIMOS---------------");
                        for(int i=0;i<emprestimos.size();i++){
                            System.out.println((i+1)+":");
                            System.out.println("Nome cliente: "+emprestimos.get(i).getPessoa().getNome());
                            System.out.println("Marca do Veículo: "+emprestimos.get(i).getVeiculo().getMarca()+" - Modelo: "+emprestimos.get(i).getVeiculo().getModelo());
                            System.out.println("Quantidade de renovações já realizadas: "+emprestimos.get(i).getVeiculo().getRenovacoes());
                        }
                        System.out.print("\nEscolha o Empréstimo a ser cancelado: ");
                        int escolhaCancelamento = scan.nextInt();

                        while (escolhaCancelamento>emprestimos.size()) {
                            System.out.println("Escolha inválida!");
                            System.out.print("\nEscolha o Empréstimo a ser cancelado: ");
                            int novaEscolhaCancelamento = scan.nextInt();
                            escolhaCancelamento = novaEscolhaCancelamento;
                        }

                        emprestimos.get(escolhaCancelamento-1).CancelarEmprestimo();
                        emprestimos.remove(escolhaCancelamento-1);
                        break;
                    }
                case 8:
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}