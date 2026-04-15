/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.lersm.mavenproject1;

/**
 *
 * @author IFNMG
 */
public class SpaceShare {
    public static void main(String[] args) {
       
        Estacao estacao101 = new Estacao(101);
       
        Reserva r1 = new Reserva("Alice", 4);
        Reserva r2 = new Reserva("Bruno", 5);
        Reserva r3 = new Reserva("Carla", 3); // Vai estourar o limite (4 + 5 + 3 = 12)

        System.out.println("Tentando adicionar Alice (4h): " + estacao101.adicionarReserva(r1)); 
        System.out.println("Tentando adicionar Bruno (5h): " + estacao101.adicionarReserva(r2)); 
        System.out.println("Tentando adicionar Carla (3h): " + estacao101.adicionarReserva(r3)); 

        System.out.println(); 
        
        estacao101.imprimirMapa();
    }
}