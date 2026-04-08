/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.edu.ifnmg.lersm.ecodrive1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Veiculo {

    // Atributos do Veículo
    private String placa;
    private String modelo;
    private double nivelCombustivel;
    private double distanciaTotalPercorrida; // Odômetro
    private final double CAPACIDADE_MAXIMA = 50.0;

    private Motorista motorista;

    // Substituição das listas paralelas por uma lista de objetos Viagem
    private List<Viagem> historicoViagens = new ArrayList<>();

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        this.nivelCombustivel = 0.0;
        this.distanciaTotalPercorrida = 0.0;
    }

    public void abastecer(double quantidadeLitros) {
        if (this.nivelCombustivel + quantidadeLitros > CAPACIDADE_MAXIMA) {
            this.nivelCombustivel = CAPACIDADE_MAXIMA;
            System.out.println("Tanque cheio (50L).");
        } else {
            this.nivelCombustivel += quantidadeLitros;
            System.out.println("Abastecido com sucesso com " + quantidadeLitros + " Litros");
        }
    }
    
    public void registrarViagem(double distanciaKm) {
        if (motorista == null) {
            System.out.println("Erro: Não é possível viajar sem um motorista cadastrado!");
            return;
        }
        
        double consumoEstimado = distanciaKm / 10.0;
        
        // Cria a instância da nova viagem
        Viagem novaViagem = new Viagem(LocalDate.now(), distanciaKm, consumoEstimado);
        
        // Valida o consumo usando o método da nova classe
        if (!novaViagem.validarConsumo()) {
            System.out.println("Erro: Consumo de combustível ou distância informada são inválidos.");
            return;
        }

        if (distanciaKm > 0 && this.nivelCombustivel >= consumoEstimado) {
            this.nivelCombustivel -= consumoEstimado;
            this.distanciaTotalPercorrida += distanciaKm; // Atualização do odômetro

            // Adiciona a instância validada ao histórico
            historicoViagens.add(novaViagem);

            System.out.println("Viagem de " + distanciaKm + "km concluída por: " + motorista.getNome());
        } else {
            System.out.println("Erro: Viagem não permitida (Combustível insuficiente).");
        }
    }

    public void exibirStatus() {
        System.out.println("\n---------- STATUS DO VEÍCULO ----------");
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        if (this.motorista != null) {
            System.out.println("Motorista Atual: " + motorista.getNome());
        } else {
            System.out.println("Motorista Atual: Nenhum");
        }
        System.out.printf("Combustível no Tanque: %.2f L%n", this.nivelCombustivel);
        System.out.printf("Odômetro: %.1f km%n", this.distanciaTotalPercorrida);
        System.out.println("---------------------------------------\n");
    }

    // Desafio 1: Método atualizado com laço for e soma total
    public void gerarRelatorioViagens() {
        String nomeMotorista = (this.motorista != null) ? this.motorista.getNome() : "Desconhecido";
        System.out.println("\n======= RELATÓRIO DE VIAGENS DE " + nomeMotorista + " =======");
        
        double quilometragemTotalDaLista = 0.0;

        for (Viagem viagem : historicoViagens) {
            System.out.printf("[%s] Distância: %.1f km | Consumo: %.1f L%n", 
                              viagem.getData(), viagem.getDistancia(), viagem.getConsumo());
            quilometragemTotalDaLista += viagem.getDistancia();
        }
        
        System.out.println("-------------------------------------------------");
        System.out.printf("SOMA TOTAL DE QUILÔMETROS: %.1f km%n", quilometragemTotalDaLista);
        System.out.println("=================================================\n");
    }

    // Getters e Setters
    public Motorista getMotorista() { return motorista; }
    
    public void setMotorista(Motorista novoMotorista) {
        if (novoMotorista.getCategoriaCnh() != 'D' && novoMotorista.getCategoriaCnh() != 'd') {
            System.out.println("Acesso Negado: O motorista " + novoMotorista.getNome() + " não possui categoria 'D'.");
            return;
        } 
        if (this.motorista != null) {
            this.motorista.setVeiculo(null);
            System.out.println("Aviso: O motorista " + this.motorista.getNome() + " foi desvinculado do veículo " + this.placa);
        } 
        this.motorista = novoMotorista;
        this.motorista.setVeiculo(this); 
        System.out.println("Sucesso: O motorista " + novoMotorista.getNome() + " assumiu o veículo " + this.placa);
    } 
    
    public String getPlaca() { return placa; }
    public double getDistanciaTotalPercorrida() { return distanciaTotalPercorrida; }
    public String getModelo() { return this.modelo; }
    public double getNivelCombustivel() { return this.nivelCombustivel; }
}