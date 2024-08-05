package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner indagar = new Scanner(System.in);
        //Declarando variaveis
        String resultado;
        Double media;

        //Solicitando dados do usuário
        System.out.println("Digite seu nome: ");
        String nome = indagar.next();

        System.out.println("Digite seu 1ª nota: ");
        Double valor1 = indagar.nextDouble();
        
        System.out.println("Digite sua 2ª nota");
        Double valor2 = indagar.nextDouble();

        //Calculando média
        media = (valor1+valor2)/2;

        //Defindindo status do aluno
        if (media >= 7) {
            resultado = "Aprovado!";
        }  else if (media >= 5) {
            resultado = "Verificao Suplementar!";
        }   else    {
            resultado = "Reprovado!";
        }

        //Exibindo resultados
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média do aluno: " + media);
        System.out.println("Situação do aluno: " + resultado);
        
        indagar.close();

    }
}
