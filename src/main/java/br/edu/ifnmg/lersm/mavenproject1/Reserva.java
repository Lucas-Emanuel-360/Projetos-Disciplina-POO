/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.lersm.mavenproject1;

/**
 *
 * @author IFNMG
 */
public class Reserva {
    private String usuario;
    private int horas;

    public Reserva(String usuario, int horas) {
        this.usuario = usuario;
        this.horas = horas;
    }
    public String getUsuario() {
        return usuario;
    }
    public int getHoras() {
        return horas;
    }
}