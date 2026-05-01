/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.lersm.mavenproject1;

public class CabineCall extends Estacao {
    private boolean isolamentoAcustico;

    public CabineCall(int numero, boolean isolamentoAcustico) {
        super(numero);
        this.isolamentoAcustico = isolamentoAcustico;
    }

    public void entrarEmChamada() {
        if (this.isolamentoAcustico) {
            System.out.println("Silêncio ativado");
        } else {
            System.out.println("Aviso: Esta cabine não possui isolamento acústico ativo.");
        }
    }
}