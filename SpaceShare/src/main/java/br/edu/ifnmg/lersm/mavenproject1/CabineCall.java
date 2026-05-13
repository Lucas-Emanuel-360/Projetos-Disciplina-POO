// CabineCall.java (Atualizado)
package br.edu.ifnmg.aluno.lersm.spaceshare;

public class CabineCall extends Estacao implements Promocional {
    private boolean isolamentoAcustico;
    private double desconto = 0;

    public CabineCall(int numero, boolean isolamentoAcustico) {
        super(numero);
        this.isolamentoAcustico = isolamentoAcustico;
    }

    // Implementação da Interface Promocional
    @Override
    public void aplicarDesconto(double percentual) {
        this.desconto = percentual;
        System.out.println("Desconto de " + percentual + "% aplicado na cabine " + getNumero() + "!");
    }

    @Override
    public double calcularPreco(int horas) {
        // Como Estacao agora é abstrata, não podemos chamar super.calcularPreco()
        double precoBase = horas * 15.0; // Preço base inventado para o exemplo
        if (this.isolamentoAcustico) {
            precoBase = precoBase * 1.20; 
        }
        return precoBase - (precoBase * (desconto / 100));
    }
}