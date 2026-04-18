/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm;

import java.time.LocalTime;

public class Reserva {
    private String usuario;
    private LocalTime horaInicio;
    private int duracaoHoras;

    public Reserva(String usuario, LocalTime horaInicio, int duracaoHoras) {
        this.usuario = usuario;
        this.horaInicio = horaInicio;
        this.duracaoHoras = duracaoHoras;
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    // Método que calcula a hora de término
    public LocalTime getHoraTermino() {
        return horaInicio.plusHours(duracaoHoras);
    }
}