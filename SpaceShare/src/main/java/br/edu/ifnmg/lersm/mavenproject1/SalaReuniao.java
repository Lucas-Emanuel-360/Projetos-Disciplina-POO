/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm.mavenproject1;

// 'extends' estabelece o vínculo de herança
public class SalaReuniao extends Estacao {
    private int capacidade;
    private boolean temProjetor;

    public SalaReuniao(int numero, int capacidade, boolean temProjetor) {
        // O super(numero) envia o dado para o construtor da Estacao
        super(numero);
        this.capacidade = capacidade;
        this.temProjetor = temProjetor;
    }

    // Método exclusivo da Sala de Reunião
    public void exibirEspecificacoes() {
        System.out.println("Especificações da Sala #" + getNumero());
        System.out.println("Capacidade: " + capacidade + " pessoas");
        System.out.println("Recursos: " + (temProjetor ? "Projetor disponível" : "Apenas mesa"));
    }
}