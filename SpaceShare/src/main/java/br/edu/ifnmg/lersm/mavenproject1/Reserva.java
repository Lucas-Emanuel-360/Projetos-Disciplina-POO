/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm.mavenproject1;

import java.time.LocalTime;
import java.util.Objects;

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

    public LocalTime getHoraTermino() {
        return horaInicio.plusHours(duracaoHoras);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Reserva reserva = (Reserva) obj;
        return Objects.equals(usuario, reserva.usuario) && Objects.equals(horaInicio, reserva.horaInicio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, horaInicio);
    }
}