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

    private List<LocalDate> datasViagens = new ArrayList<>();
    private List<Double> distanciasViagens = new ArrayList<>();
    private List<Double> consumosViagens = new ArrayList<>();


    public Veiculo(String placa, String modelo, Motorista motorista) {
        this.placa = placa;
        this.modelo = modelo;
        this.motorista = motorista;
        this.nivelCombustivel = 0.0;
        this.distanciaTotalPercorrida = 0.0;
    }

    public void abastecer(double quantidadeLitros) {
        if (this.nivelCombustivel + quantidadeLitros > CAPACIDADE_MAXIMA) {
            this.nivelCombustivel = CAPACIDADE_MAXIMA;
            System.out.println("Tanque cheio (50L).");
        } else {
            this.nivelCombustivel += quantidadeLitros;
            System.out.println("Abastecido com sucesso com "+ quantidadeLitros+" Litros");
        }
    }
    
    public void registrarViagem(double distanciaKm) {
        double consumoEstimado = distanciaKm / 10.0;

        if (distanciaKm > 0 && this.nivelCombustivel >= consumoEstimado) {
         
            this.nivelCombustivel -= consumoEstimado;
            this.distanciaTotalPercorrida += distanciaKm; // Atualização do odômetro

            datasViagens.add(LocalDate.now());
            distanciasViagens.add(distanciaKm);
            consumosViagens.add(consumoEstimado);

            System.out.println("Viagem de " + distanciaKm + "km concluída por: " + motorista.getNome());
        } else {
            System.out.println("Erro: Viagem não permitida (Combustível insuficiente ou distância inválida).");
        }
    }

    public void exibirStatus() {
        System.out.println("\n---------- STATUS DO VEÍCULO ----------");
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Motorista Atual: " + motorista.getNome());
        System.out.printf("Combustível no Tanque: %.2f L%n", this.nivelCombustivel);
        System.out.printf("Odômetro: %.1f km%n", this.distanciaTotalPercorrida);
        System.out.println("---------------------------------------\n");
    }

    public void gerarRelatorioViagens() {
        System.out.println("======= RELATÓRIO DE VIAGENS DE "+motorista.getNome()+" =======");
        for (int i = 0; i < distanciasViagens.size(); i++) {
            System.out.printf("[%s] Distância: %.1f km | Consumo: %.1f L%n", 
                              datasViagens.get(i), distanciasViagens.get(i), consumosViagens.get(i));
        }
    }

    // Getters e Setters
    public Motorista getMotorista() { return motorista; }
    public void setMotorista(Motorista motorista) { this.motorista = motorista; }
    public String getPlaca() { return placa; }
    public double getDistanciaTotalPercorrida() { return distanciaTotalPercorrida; }
    public String getModelo() {
    return this.modelo;
}

public double getNivelCombustivel() {
    return this.nivelCombustivel;
}
}