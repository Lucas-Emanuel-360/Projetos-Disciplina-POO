/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.lersm.ecodrive1;

public class EcoDrive1 {

    public static void main(String[] args) {
        
        Motorista m1 = new Motorista("Lucas", 12345678901L);
        Veiculo v1 = new Veiculo("ABC-1234", "Caminhão Baú", m1);
        
        v1.abastecer(40); // Abastece com os 40L
        v1.abastecer(40);// Abastece com os 40L novamente para dar erro 
        
        v1.registrarViagem(150); // Registra a primeira viagem de 150 Km
        v1.registrarViagem(50); // Registra a segunda viagem de 50 Km
        v1.registrarViagem(80); // Regostra a terceira viagem de 80Km
        
        // 500 - 280 = 220 entao tem 22 L sobrando
        
        // Registrando viagem que vai dar erro por falta de combustivel
        
        v1.registrarViagem(230); // e pra dar erro
        
        v1.exibirStatus();
        
        // colocar mais um veiculo v2 e m2
        
        Motorista m2 = new Motorista("Cleber", 12345678910L);
        Veiculo v2 = new Veiculo("ABC-4321", "Ranger Raptor", m2);
        
        v2.abastecer(5);
        
        v2.registrarViagem(45);
        
        v2.exibirStatus();
        
        v2.gerarRelatorioViagens();
        v1.gerarRelatorioViagens();
    }
}