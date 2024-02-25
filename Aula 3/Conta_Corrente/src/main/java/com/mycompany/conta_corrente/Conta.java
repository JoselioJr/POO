/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta_corrente;

/**
 *
 * @author Joselio Jr
 */
public class Conta {
    String nome1 = "Marcel";
    String nome2 = "Joselio";
    int numConta1 = 123456789;
    int numConta2 = 987654321;
    int agencia = 6;
    int chaveTrans = 1834;
    double saldo = 0;
    
    double sacar(double saque){
        saldo = saldo-saque;
        return(saldo);
    }
    
    double deposito(double depos){
        saldo = saldo+depos;
        return(saldo);
    }
}
