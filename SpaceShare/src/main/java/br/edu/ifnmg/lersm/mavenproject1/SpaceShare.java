/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.lersm;

import java.time.LocalTime;

public class SpaceShare {
    public static void main(String[] args) {
       
        Estacao estacao101 = new Estacao(101);
       
        // Criando as reservas conforme o cenário de teste
        Reserva r1 = new Reserva("João", LocalTime.of(8, 0), 2);
        Reserva r2 = new Reserva("Maria", LocalTime.of(9, 0), 2);
        Reserva r3 = new Reserva("Carlos", LocalTime.of(10, 0), 1);
        Reserva r4 = new Reserva("Ana", LocalTime.of(7, 0), 4);

        // 1. Reserva 1: João, às 08:00, por 2 horas. (Dever ser Aceita)
        System.out.println("Tentando adicionar João: " + estacao101.adicionarReserva(r1)); 
        
        // 2. Reserva 2: Maria, às 09:00, por 2 horas. (Deve ser Negada - conflita com João)
        System.out.println("Tentando adicionar Maria: " + estacao101.adicionarReserva(r2)); 
        
        // 3. Reserva 3: Carlos, às 10:00, por 1 hora. (Deve ser Aceita - João termina às 10h)
        System.out.println("Tentando adicionar Carlos: " + estacao101.adicionarReserva(r3)); 
        
        // 4. Reserva 4: Ana, às 07:00, por 4 horas. (Deve ser Negada - atropela a reserva do João)
        System.out.println("Tentando adicionar Ana: " + estacao101.adicionarReserva(r4)); 

        System.out.println(); 
        
        // Imprime o mapa final para confirmar quem conseguiu a vaga
        estacao101.imprimirMapa();
    }
}