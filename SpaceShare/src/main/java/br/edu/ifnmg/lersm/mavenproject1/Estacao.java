/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm.mavenproject1;

import java.time.LocalTime;
import java.util.HashSet;

public class Estacao {
    private int numero;
    private HashSet<Reserva> listaReservas;

    public Estacao(int numero) {
        this.numero = numero;
        this.listaReservas = new HashSet<>(); 
    }
    
    public int getNumero() {
        return numero;
    }

    public boolean adicionarReserva(Reserva nova) {
        boolean adicionado = listaReservas.add(nova);
        
        if (!adicionado) {
            System.out.println("Reserva ignorada: este agendamento já existe");
            return false;
        }
        
        return true;
    }

    public void imprimirMapa() {
        System.out.println("====================================");
        System.out.println("Estação de Trabalho Nº: " + numero);
        System.out.println("====================================");
        
        if (listaReservas.isEmpty()) {
            System.out.println("Nenhuma reserva para hoje.");
        } else {
            System.out.println("Usuários agendados:");
            for (Reserva r : listaReservas) {
                System.out.println(" -> " + r.getUsuario() + " (" + r.getHoraInicio() + " às " + r.getHoraTermino() + ")");
            }
        }
    }
}