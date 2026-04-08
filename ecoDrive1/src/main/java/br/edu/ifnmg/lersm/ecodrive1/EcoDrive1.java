/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.lersm.ecodrive1;

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
        // Deve mostrar as 3 viagens e a soma de 85km
        veiculo.gerarRelatorioViagens(); 
        
        System.out.println("\n--- Desafio Extra: Tentar viagem longa (Combustível insuficiente) ---");
        // Tanque atual: 50L. Gastou 8.5L (sobrou 41.5L). 
        // 600km exigiria 60L, então deve falhar e NÃO entrar no relatório.
        veiculo.registrarViagem(600); 

        System.out.println("\n--- Verificação Final do Relatório ---");
        veiculo.gerarRelatorioViagens(); 
    }
}
