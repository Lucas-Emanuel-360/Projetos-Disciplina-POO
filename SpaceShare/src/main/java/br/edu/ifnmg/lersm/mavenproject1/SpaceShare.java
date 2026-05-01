/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.lersm.mavenproject1;

import java.time.LocalTime;
import java.time.LocalTime;

public class SpaceShare {
    public static void main(String[] args) {
       
        Estacao estacao101 = new Estacao(101);
        Reserva r1 = new Reserva("João", LocalTime.of(8, 0), 2);
        estacao101.adicionarReserva(r1);
        
        System.out.println("--- Teste do Desafio de Especialização ---");
        
        SalaReuniao sala501 = new SalaReuniao(501, 10, true);
        CabineCall cabine10 = new CabineCall(10, true);
        
        Reserva reservaReuniao = new Reserva("Equipe Desenvolvimento", LocalTime.of(14, 0), 2);
        Reserva reservaCall = new Reserva("Lucas", LocalTime.of(10, 0), 1);
        
        sala501.adicionarReserva(reservaReuniao);
        cabine10.adicionarReserva(reservaCall);
            
        sala501.exibirEspecificacoes(); 
        sala501.imprimirMapa();         
        
        System.out.println();
       
        cabine10.entrarEmChamada();     
        cabine10.imprimirMapa();        

        System.out.println("\n--- Atividade 2: Teste de Duplicidade (HashSet) ---");
        Reserva reservaDuplicada = new Reserva("Equipe Desenvolvimento", LocalTime.of(14, 0), 2);
        
        sala501.adicionarReserva(reservaDuplicada);
        
        sala501.imprimirMapa();
    }
}