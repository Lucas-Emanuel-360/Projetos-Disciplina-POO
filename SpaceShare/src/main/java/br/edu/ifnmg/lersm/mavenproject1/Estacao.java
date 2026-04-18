/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm;

import java.time.LocalTime;
import java.util.ArrayList;

public class Estacao {
    private int numero;
    private ArrayList<Reserva> listaReservas;

    public Estacao(int numero) {
        this.numero = numero;
        this.listaReservas = new ArrayList<>(); 
    }

    public boolean adicionarReserva(Reserva nova) {
        LocalTime novaInicio = nova.getHoraInicio();
        LocalTime novaTermino = nova.getHoraTermino();

        for (Reserva existente : listaReservas) {
            LocalTime existenteInicio = existente.getHoraInicio();
            LocalTime existenteTermino = existente.getHoraTermino();

            if (novaInicio.isBefore(existenteTermino) && novaTermino.isAfter(existenteInicio)) {
                System.out.println("Erro: Conflito de horário! A reserva de " + nova.getUsuario() + 
                                   " (" + novaInicio + " às " + novaTermino + ") conflita com a de " + 
                                   existente.getUsuario() + " (" + existenteInicio + " às " + existenteTermino + ").");
                return false; 
            }
        }

     
        listaReservas.add(nova);
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