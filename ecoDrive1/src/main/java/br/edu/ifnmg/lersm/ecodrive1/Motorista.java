/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm.ecodrive1;

public class Motorista {

    private long numeroCnh;
    private String nome;
    private char categoriaCnh;
    private Veiculo veiculo;
   
    
    public Motorista() {
        nome = "Sem Nome ou Nome Invalido";
        numeroCnh = 10000000000L;
    }

    public Motorista(String nome, long numeroCnh, char categoriaCnh) {
        this.nome = nome;
        this.numeroCnh = numeroCnh;
        this.categoriaCnh = categoriaCnh;
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

    public char getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(char categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Motorista{" + "numeroCnh=" + numeroCnh + ", nome=" + nome + '}';
    }

}
