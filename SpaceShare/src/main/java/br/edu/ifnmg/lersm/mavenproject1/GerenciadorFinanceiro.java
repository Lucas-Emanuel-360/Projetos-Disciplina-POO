package br.edu.ifnmg.aluno.lersm.spaceshare;

import java.util.ArrayList;

public class GerenciadorFinanceiro {

    public void imprimirFaturamento(ArrayList<Estacao> lista, int horas) { 
        System.out.println("\n=== Relatório Financeiro (" + horas + " horas) ===");
        
        for (Estacao e : lista) {
            System.out.println("Estação " + e.getNumero() + " | Total: R$ " + e.calcularPreco(horas));  
        }
    }
}