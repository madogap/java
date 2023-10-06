package org.controledefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

   

        try {
            //chamar o metodo contendo a logica de contagem
            System.out.println("Digite o primeiro numero ");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo numero");
            int parametroDois = terminal.nextInt();

            if (parametroDois <= parametroUm) {
                throw new ParametrosInvaldException("O segundo parâmetro deve ser maior que o primeiro.");
            }
            contar(int parametroUm, int  parametroDois);
        } catch (ParametrosInvaldException e) {
            //Imprimir a mesagem o segundo parametro deve ser maior que o primeiro
            System.out.println(e.getMessage());
            }
        

    }
    
    static void contar(int parametroUm, int parametroDois) {
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }

    //static void contar(int parametroUm, int parametroDois) throws ParametrosInvaldException {
      //  int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os numeroes com base na variravel contagem
    //}
}
