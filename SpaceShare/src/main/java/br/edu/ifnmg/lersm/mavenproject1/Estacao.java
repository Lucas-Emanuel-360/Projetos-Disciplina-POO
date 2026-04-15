/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm.mavenproject1;

/**
 *
 * @author IFNMG
 */
import java.util.ArrayList;

public class Estacao {
    private int numero;
    private ArrayList<Reserva> listaReservas;


    public Estacao(int numero) {
        this.numero = numero;
        this.listaReservas = new ArrayList<>(); 
    }


    public boolean adicionarReserva(Reserva r) {
        int horasTotais = 0;
        
        for (Reserva reservaExistente : listaReservas) {
            horasTotais += reservaExistente.getHoras();
        }

        if (horasTotais + r.getHoras() <= 10) {
            listaReservas.add(r);
            return true; 
        } else {
            return false; 
        }
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
                System.out.println(" -> " + r.getUsuario() + " (Uso: " + r.getHoras() + "h)");
            }
        }
    }
}