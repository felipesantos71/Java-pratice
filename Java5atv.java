/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java5atv;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Java5atv {

    public static void main(String[] args) {
        Scanner indagacao = new Scanner (System.in);
        
        System.out.println("Digite seu nome: ");
        String pseudonimo = indagacao.next();
        
        System.out.println("Digite sua 1ª nota: ");
        double primeiraNota = indagacao.nextDouble();
        
        System.out.println("Digite sua 2ª nota: ");
        double segundaNota = indagacao.nextDouble();
        
        //Calculando média
        double media = (primeiraNota + segundaNota)/2;
        
        //Exbidindo resultados
        System.out.println("Aluno: " + pseudonimo);
        System.out.println("Média do aluno: " + media);
    }
}
