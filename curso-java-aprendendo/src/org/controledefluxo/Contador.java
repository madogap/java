package org.controledefluxo;


import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextDouble();
        int parametroDois = terminal.nextDouble();

        try {
            //chamar o metodo contendo a logica de contagem
        } catch (Exception e) {
            //Imprimir a mesagem o segundo parametro deve ser maior que o primeiro
        }
        

    }
    static void contar(int parametroUm, int parametroDois)throws ParametrosInvaldException{
        int contagem = parametroDois - parametroUm; 
        //Realizar o for para imprimir os numeroes com base na variravel contagem
    }
}
