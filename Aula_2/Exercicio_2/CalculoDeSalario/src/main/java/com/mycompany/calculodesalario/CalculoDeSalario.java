/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculodesalario;
import java.util.Scanner;

/**
 *
 * @author Joselio Jr
 */
public class CalculoDeSalario {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: ");
        double sal = sc.nextDouble();
        
        System.out.print("\nDigite a quantidade de faltas: ");
        int qt1 = sc.nextInt();
        
        double desc = calc.faltas(qt1, sal);
        
        System.out.print("\nDigite a quantidade de produtos vendidos: ");
        int qt2 = sc.nextInt();
        
        double incre = calc.prod(qt2, desc);
        
        System.out.println("\n------------------HOLERITE------------------");
        System.out.println("Salário Bruto: "+sal);
        System.out.println("Desconto: "+(sal-desc));
        System.out.println("Incremento: "+(incre-desc));
        System.out.println("Salário Liquido: "+incre);
        System.out.println("--------------------------------------------");
    }
}
