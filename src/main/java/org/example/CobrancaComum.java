package org.example;

public final class CobrancaComum extends Cobranca {
    public CobrancaComum(FormaPagamento formaPagamento) {
        super(formaPagamento);
    }

    @Override
    protected double calcularValorFinal(double valor) {
        return valor;
    }
}
