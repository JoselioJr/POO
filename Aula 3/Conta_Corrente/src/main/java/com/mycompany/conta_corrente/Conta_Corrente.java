/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta_corrente;
import java.util.Scanner;

/**
 *
 * @author Joselio Jr
 */
public class Conta_Corrente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta account = new Conta();
        int x=1;

        while(x==1){
            System.out.println("\n------------OPERAÇÕES------------");
            System.out.println("1 - Depósito");
            System.out.println("2 - Sacar");
            System.out.println("3 - Tranferência");
            System.out.print("Oque deseja realizar? ");

            switch(sc.nextInt()){
                case 1:
                    System.out.print("\nDigite o valor do depósito: ");
                    account.deposito(sc.nextDouble());
                    
                    System.out.println("Saldo após o depósito: "+account.saldo);
                    System.out.print("\nDeseja realizar mais alguma operação (1 - Sim | 2 - Não)? ");
                    if(sc.nextInt()==1){
                        x = 1;
                        break;
                    }else{
                        x = 2;
                        break;
                    }
                case 2:
                    if(account.saldo == 0){
                        System.out.println("\nVocê se encontra sem saldo para realizar um saque!");
                        
                        System.out.print("\nDeseja realizar mais alguma operação (1 - Sim | 2 - Não)? ");
                        if(sc.nextInt()==1){
                            x = 1;
                            break;
                        }else{
                            x = 2;
                            break;
                        }
                    }
                    
                    System.out.println("\nSaldo: "+account.saldo);
                    System.out.print("\nDigite o valor do saque: ");
                    double u = sc.nextDouble();

                    while((account.saldo-u)<0){
                        System.out.println("\nSaldo insuficiente!");
                        
                        System.out.print("\nDigite o valor do saque novamente: ");
                        u = sc.nextDouble();
                    }
                    account.sacar(u);
                    System.out.println("\nSaldo após o saque: "+account.saldo);
                    
                    System.out.print("\nDeseja realizar mais alguma operação (1 - Sim | 2 - Não)? ");
                    if(sc.nextInt()==1){
                        x = 1;
                        break;
                    }else{
                        x = 2;
                        break;
                    }
                case 3:
                    if(account.saldo == 0){
                        System.out.println("\nVocê se encontra sem saldo para realizar uma tranferência!");
                        
                        System.out.print("\nDeseja realizar mais alguma operação (1 - Sim | 2 - Não)? ");
                        if(sc.nextInt()==1){
                            x = 1;
                            break;
                        }else{
                            x = 2;
                            break;
                        }
                    }
                    
                    System.out.println("\nSaldo: "+account.saldo);
                    System.out.print("\nDigite o número da conta que irá realizar a transferência: ");
                    int num = sc.nextInt();
                    if(num == account.numConta2){
                        System.out.println("\nNúmero da conta: "+account.numConta2);
                        System.out.println("Nome do Titular: "+account.nome2);
                    }else{
                        System.out.println("\nNúmero da conta: "+num);
                        System.out.println("Nome do Titular: Fulano de Tal");
                    }
                    
                    System.out.print("\nDigite o valor da transferência: ");
                    double valor = sc.nextDouble();
                    
                    while((account.saldo-valor)<0){
                        System.out.println("\nSaldo insuficiente!");
                        
                        System.out.print("\nDigite o valor de tranferência novamente: ");
                        valor = sc.nextDouble();
                    }
                    
                    System.out.print("\nDigite a sua chave de tranferência: ");
                    int chv = sc.nextInt();
                    
                    if(chv == account.chaveTrans){
                        System.out.println("\nTransferência realizada com sucesso!");
                        
                        System.out.println("\n-------------------- COMPROVANTE --------------------");
                        System.out.println("Nome do titular: "+account.nome1);
                        System.out.println("Número da conta: "+account.numConta1);
                        System.out.println("Agência: "+account.agencia);
                        System.out.println("Valor transferido: "+valor+"\n");
                        if(num == account.numConta2) System.out.println("Nome do recebedor: "+account.nome2);
                        else System.out.println("Nome do recebedor: Fulano de Tal");
                        System.out.println("Número da conta de tranferência: "+num);
                        System.out.println("Agência: "+account.agencia);
                        System.out.println("-----------------------------------------------------");
                    }else System.out.println("\nChave incorreta!\nRealize o processo de transferência novamente");
                    
                    if(chv == account.chaveTrans){
                        account.sacar(valor);
                        System.out.println("\nSaldo após tranferência: "+account.saldo);
                    }
                    
                    System.out.print("\nDeseja realizar mais alguma operação (1 - Sim | 2 - Não)? ");
                    if(sc.nextInt()==1){
                        x = 1;
                        break;
                    }else{
                        x = 2;
                        break;
                    }
            }
        }
    }
}