/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm.ecodrive1;

import java.time.LocalDate;

public class Viagem {
    private LocalDate data;
    private double distancia;
    private double consumo;

    public Viagem(LocalDate data, double distancia, double consumo) {
        this.data = data;
        this.distancia = distancia;
        this.consumo = consumo;
    }

    public boolean validarConsumo() {
       
        if (this.distancia <= 0) {
            return false;
        }
        if (this.consumo <= 0) {
            return false;
        }
        

        double consumoEsperado = this.distancia / 10.0;
        double tolerancia = 0.1; 
        
        return Math.abs(this.consumo - consumoEsperado) <= tolerancia;
    }

    // Getters
    public LocalDate getData() {
        return data;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getConsumo() {
        return consumo;
    }
}