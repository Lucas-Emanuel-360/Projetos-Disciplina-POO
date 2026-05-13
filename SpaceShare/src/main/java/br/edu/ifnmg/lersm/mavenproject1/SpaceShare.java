// SpaceShare.java (Atualizado)
package br.edu.ifnmg.aluno.lersm.spaceshare;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class SpaceShare {
    public static void main(String[] args) {
        HashMap<Integer, Estacao> mapaEstacoes = new HashMap<>();
        
        Mesa estacao101 = new Mesa(101);
        SalaReuniao sala501 = new SalaReuniao(501, 10, true);
        CabineCall cabine10 = new CabineCall(10, true);
        
        mapaEstacoes.put(estacao101.getNumero(), estacao101);
        mapaEstacoes.put(sala501.getNumero(), sala501);
        mapaEstacoes.put(cabine10.getNumero(), cabine10);
        
        System.out.println("--- Teste de Ordenação Cronológica (TreeSet) ---");
        estacao101.adicionarReserva(new Reserva("Waleska", LocalTime.of(14, 0), 2));
        estacao101.adicionarReserva(new Reserva("Fernando", LocalTime.of(8, 0), 2));
        estacao101.imprimirMapa();

        System.out.println("\n--- TESTE DE FATURAMENTO ---");
        ArrayList<Estacao> estacoes = new ArrayList<>();
        estacoes.add(estacao101); 
        estacoes.add(sala501);    
        estacoes.add(cabine10);   

        GerenciadorFinanceiro financeiro = new GerenciadorFinanceiro();
        financeiro.imprimirFaturamento(estacoes, 2); 
    }
}