/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm.ecodrive1;

/**
 * @author IFNMG
 */
public class Motorista {

    private long numeroCnh;
    private String nome;

    public Motorista() {
        nome = "Sem Nome ou Nome Invalido";
        numeroCnh = 10000000000L;
    }

    public Motorista(String nome, long numeroCnh) {
        this.nome = nome;
        this.numeroCnh = numeroCnh;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters / Setters">
    public void setCnh(long numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public long getCnh() {
        return numeroCnh;
    }

    public void setNome(String nome) {
        if(nome.length() > 12){
            System.out.println("Tamanho de nome invalido");
            return;
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Motorista{" + "numeroCnh=" + numeroCnh + ", nome=" + nome + '}';
    }

}
