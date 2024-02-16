/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeracao;
import java.util.Scanner;

/**
 *
 * @author Joselio Jr
 */
public class Numeracao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant, soma, maior, menor;
        
        quant = 0;
        soma = 0;
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;

        while(true){
            System.out.print("Digite um número (ou -1 para encerrar): ");
            int num = sc.nextInt();

            if(num == -1){
                break;
            }

            quant++;
            soma += num;

            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
        }

        if(quant > 0){
            double media = soma / quant;
            System.out.println("\nResultados:");
            System.out.println("Quantidade de números digitados: "+quant);
            System.out.println("Maior número digitado: "+maior);
            System.out.println("Menor número digitado: "+menor);
            System.out.println("Média dos números digitados: "+media);
        }else{
            System.out.println("\nNenhum número foi digitado.");
        }
    }
}
