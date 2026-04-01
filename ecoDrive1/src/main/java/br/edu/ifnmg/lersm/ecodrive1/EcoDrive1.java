/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.lersm.ecodrive1;

public class EcoDrive1 {

    public static void main(String[] args) {

        Motorista motoristaA = new Motorista("Motorista A", 11111111111L, 'B');
        Motorista motoristaB = new Motorista("Motorista B", 22222222222L, 'D');
        Motorista motoristaC = new Motorista("Motorista C", 22222222222L, 'D');        
        
        Veiculo veiculo = new Veiculo("ABC-1234", "Caminhão Baú");
        
        veiculo.abastecer(20); 

        System.out.println("\n--- Teste do Desafio 1: Viajar sem motorista ---"); // Mostrar erro sem motorista

        veiculo.registrarViagem(40); 

        System.out.println("\n--- Teste do Cenário 2: Tentar vincular Motorista A (Cat. B) ---"); // Mostrar erro motorista sem cnh adequada
        veiculo.setMotorista(motoristaA); 

        System.out.println("\n--- Teste do Cenário 3: Vincular Motorista B e viajar 40km ---"); // Vai dar certo de vincular e viajar
        veiculo.setMotorista(motoristaB); 
        veiculo.registrarViagem(40); 

        System.out.println("\n--- Teste do Cenário 4: Exibir Status ---"); // Mostra o status atual do veiculo da frota
        veiculo.exibirStatus(); 
        
        System.out.println("\n--- Teste do Cenário 5: Vincular Motorista C e viajar 60km ---"); // Troca o motorista e viaja mais 60km
        veiculo.setMotorista(motoristaC); 
        veiculo.registrarViagem(60); 

        System.out.println("\n--- Teste do Cenário 6: Exibir Status ---"); // Mostra o status atual do veiculo da frota
        veiculo.exibirStatus(); 
        
        
    }
}