/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.lersm.spaceshare;

public class Mesa extends Estacao {
    public Mesa(int numero) {
        super(numero);
    }

    @Override
    public double calcularPreco(int horas) {
        // Implementação obrigatória do contrato da classe abstrata
        return horas * 10.0; 
    }
}