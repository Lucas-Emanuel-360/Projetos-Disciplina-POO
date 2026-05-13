package br.edu.ifnmg.aluno.lersm.spaceshare;

import java.util.TreeSet;

public abstract class Estacao {
    private int numero;
    private TreeSet<Reserva> listaReservas;

    public Estacao(int numero) {
        this.numero = numero;
        this.listaReservas = new TreeSet<>();
    }
    
    public int getNumero() { return numero; }

    public abstract double calcularPreco(int horas);

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