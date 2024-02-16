/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculodesalario;
import java.util.Scanner;

/**
 *
 * @author Joselio Jr
 */
public class Calculadora {
    Scanner sc = new Scanner(System.in);
    
    double faltas(int qt1, double sal){
        double result, desc;
        
        while(qt1<0){
            System.out.println("\n--- Quantidade que foi inserida é inválida! ---\n");
            System.out.print("Digite a quantidade de faltas correta: ");
            qt1 = sc.nextInt();
        }
        if(qt1>5){
            desc = sal * 0.15;
            result = sal - desc;
            
            System.out.print("Valor descontado: "+desc+"\n");
            
            return(result);
        }else{
            return(sal);
        }
    }
    
    double prod(int qt2, double sal){
        int incre;
        double result;
        
        while(qt2<0){
            System.out.println("\n--- Quantidade que foi inserida é inválida! ---\n");
            System.out.print("Digite a quantidade de produtos vendidos correta: ");
            qt2 = sc.nextInt();
        }
        if(qt2>20){
            incre = qt2 * 13;
            result = sal + incre;
            
            System.out.print("Incremento: "+incre+"\n");
            
            return(result);
        }else{
            incre = qt2 * 10;
            result = sal + incre;
            
            System.out.print("Incremento: "+incre+"\n");
            
            return(result);
        }
    }
}
