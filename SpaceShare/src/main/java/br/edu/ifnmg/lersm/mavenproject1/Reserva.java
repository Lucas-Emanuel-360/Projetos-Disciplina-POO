package br.edu.ifnmg.aluno.lersm.spaceshare;

import java.time.LocalTime;
import java.util.Objects;

// 1. Implementando a interface Comparable para ensinar o Java a ordenar as reservas
public class Reserva implements Comparable<Reserva> {
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

    // 2. Método exigido pela interface Comparable
    @Override
    public int compareTo(Reserva outra) {
        // Compara a hora de início desta reserva com a hora de início da "outra"
        return this.horaInicio.compareTo(outra.horaInicio);
    }
}