/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.lersm.ecodrive1;

import java.util.HashSet;

public class EcoDrive1 {

    public static void main(String[] args) {

        Motorista motoristaD = new Motorista("Carlos Silva", 99988877766L, 'D');        
        Veiculo veiculo = new Veiculo("XYZ-9876", "Caminhão de Carga");
        
        veiculo.abastecer(50);
        veiculo.setMotorista(motoristaD); 

        System.out.println("\n--- Desafio 3: Realizar 3 viagens de distâncias diferentes ---");
        veiculo.registrarViagem(20); 
        veiculo.registrarViagem(50); 
        veiculo.registrarViagem(15); 

        System.out.println("\n--- Desafio 4: Gerar Relatório de Viagens ---");
        veiculo.gerarRelatorioViagens(); 
        
        System.out.println("\n--- Desafio Extra: Tentar viagem longa (Combustível insuficiente) ---");
        veiculo.registrarViagem(600); 

        System.out.println("\n--- Verificação Final do Relatório ---");
        veiculo.gerarRelatorioViagens(); 

        System.out.println("\n=== Atividade 1: Validação de Identidade (HashSet) ===");
        
        HashSet<Veiculo> frota = new HashSet<>();

        Veiculo v1 = new Veiculo("IFN-2026", "Azul");
        Veiculo v2 = new Veiculo("IFN-2026", "Preto");

        frota.add(v1);
        frota.add(v2);

        System.out.println("Quantidade de veículos no HashSet: " + frota.size());
        
        if (frota.size() == 1) {
            System.out.println("Sucesso! Apenas 1 veículo foi adicionado.");
        } else {
            System.out.println("Falha! O HashSet permitiu duplicatas.");
        }

        for (Veiculo v : frota) {
            System.out.println("Veículo armazenado -> Placa: " + v.getPlaca() + " | Cor/Modelo: " + v.getModelo());
        }
    }
}