package org.controlecandidatos.candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1000.99);
        analisarCandidato(2000);
        analisarCandidato(5000.99);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando os resultados dos demais candidatos");
        
        }

    }
}
