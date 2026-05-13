// SalaReuniao.java (Atualizado)
package br.edu.ifnmg.aluno.lersm.spaceshare;

public class SalaReuniao extends Estacao implements Higienizavel {
    private int capacidade;
    private boolean temProjetor;

    public SalaReuniao(int numero, int capacidade, boolean temProjetor) {
        super(numero);
        this.capacidade = capacidade;
        this.temProjetor = temProjetor;
    }

    public void exibirEspecificacoes() {
        System.out.println("Especificações da Sala #" + getNumero());
        System.out.println("Capacidade: " + capacidade + " pessoas");
        System.out.println("Recursos: " + (temProjetor ? "Projetor disponível" : "Apenas mesa"));
    }

    // 1. Implementação da Interface Higienizavel
    @Override
    public void realizarLimpeza() {
        System.out.println("Limpando sala, trocando café e higienizando projetor.");
    }

    // 2. Implementação obrigatória da classe abstrata Estacao
    @Override
    public double calcularPreco(int horas) {
        return horas * 30.0; // Exemplo: R$ 30 por hora para sala de reunião
    }
}