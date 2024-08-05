/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java4atv;

import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Java4atv {
    
    public static void main(String[] args) {
    
        Scanner questionamento = new Scanner(System.in);
        int menor;
        System.out.println("Insira um valor inteiro: ");
        int valor1 = questionamento.nextInt();
        
        System.out.println("Insira um segundo valor inteiro: ");
        int valor2 = questionamento.nextInt();
        
        //Estrutura condicional if simples e operadores aritmeticos
        if (valor1 < valor2) {
            menor = valor1; 
        }   else    {
            menor = valor2;
        }
        
        //Exibindo resultados
        System.out.println("O menor numero é: " + menor);
        
        questionamento.close();
    }
}
