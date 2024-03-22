package model;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static Object cadastrar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCriando uma conta!\n");
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu CPF: ");
        String cpf = sc.nextLine();

        Pessoa p = new Pessoa(nome, cpf);

        System.out.print("Digite a agência da sua conta Ex.:001: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o número da sua conta: ");
        String numero = sc.nextLine();
        System.out.print("Digite o número do banco da sua conta: ");
        int banco = sc.nextInt();

        Conta c = new Conta(p, agencia, numero, banco);

        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> lista = new ArrayList<Conta>();

        lista.add((Conta) cadastrar());
        
        int i=1;
        while(i == 1){

            System.out.println("\n------------------OPÇÕES------------------");
            System.out.println("1 - Adicionar conta");
            System.out.println("2 - Exibir status da conta");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Sair");
            System.out.println("--------------------------------------------");
            System.out.println("\nObs.: Para que possa ser realizada a opção '5 - Tranferir' deve-se ter no mínimo 2 contas já cadastradas!\n");
            System.out.print("O'que deseja realizar? ");
            int comand = sc.nextInt();

            switch (comand) {
                case 1:
                    lista.add((Conta) cadastrar());
                    break;
                case 2:
                    System.out.print("\nDigite o número da conta a ser exibido os dados: ");
                    String num = sc.next();

                    int a;
                    for(a=0;a<lista.size();a++){
                        if(num.equals(lista.get(a).getNumero())){
                            System.out.println("\n--------------------DADOS--------------------");
                            System.out.println("Número da conta: "+lista.get(a).getNumero());
                            System.out.println("Nome do usuário: "+lista.get(a).getTitular().getNome());
                            System.out.println("Saldo da conta: "+lista.get(a).getSaldo());
                            System.out.println("---------------------------------------------");

                            break;
                        }else continue;
                    }
                    a=a+1;
                    if (a==lista.size()+1) {
                        System.out.println("\nConta não encontrada!");
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o número da conta para saque: ");
                    String num2 = sc.next();

                    int c;
                    for(c=0;c<lista.size();c++){
                        if(num2.equals(lista.get(c).getNumero())){
                            System.out.print("\nDigite o valor a ser sacado: ");
                            double valor = sc.nextDouble();

                            if (lista.get(c).sacar(valor) == true){
                                System.out.println("\nSaque realizado com sucesso!");
                                System.out.println("\nSaldo após Saque: "+lista.get(c).getSaldo());
                            }
                            else System.out.println("\nSaldo insuficiente!");
                            break;
                        }else continue;
                    }
                    c=c+1;
                    if (c==lista.size()+1) {
                        System.out.println("\nConta não encontrada!");
                    }
                    break;
                case 4:
                    System.out.print("\nDigite o número da conta para depósito: ");
                    String num1 = sc.next();

                    int b;
                    for(b=0;b<lista.size();b++){
                        if(num1.equals(lista.get(b).getNumero())){
                            System.out.print("\nDigite o valor a ser depositado: ");
                            double valor = sc.nextDouble();

                            if (lista.get(b).depositar(valor) == true){
                                System.out.println("\nDepósito realizado com sucesso!");
                                System.out.println("\nSaldo após depósito: "+lista.get(b).getSaldo());
                            }
                            else System.out.println("Depósito não sucedido!");

                            break;
                        }else continue;
                    }if (b==lista.size()) {
                        System.out.println("\nConta não encontrada!");
                    }
                    break;
                case 5:
                    System.out.print("\nDigite o número da sua conta: ");
                    String num3 = sc.next();

                    int d, e;
                    for(d=0;d<lista.size();d++){
                        if(num3.equals(lista.get(d).getNumero())){
                            System.out.print("\nDigite o valor a ser transferido: ");
                            double valor = sc.nextDouble();

                            System.out.print("\nDigite o número da conta a ser transferido o valor "+valor+": ");
                            String num4 = sc.next();

                            for(e=0;e<lista.size();e++){
                                if(num4.equals(lista.get(e).getNumero())){
                                    if(lista.get(d).transferir(valor, lista.get(e)) == true){
                                        System.out.println("\nTransferência realizada com sucesso!");
                                        break;
                                    }
                                }else continue;
                            }
                            e=e+1;
                            if (e==lista.size()+1) {
                                System.out.println("\nConta não encontrada ou saldo insuficiente!");
                            }
                            break;
                        }else continue;
                    }
                    d=d+1;
                    if (d==lista.size()+1) {
                        System.out.println("\nConta não encontrada!");
                    }
                    break;
                case 6:
                    i++;
                    break;
            }
        }
    }
}