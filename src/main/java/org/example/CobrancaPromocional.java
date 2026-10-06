package org.example;

public final class CobrancaPromocional extends Cobranca {
    private static final double DESCONTO = 0.10;

    public CobrancaPromocional(FormaPagamento formaPagamento) {
        super(formaPagamento);
    }

    @Override
    protected double calcularValorFinal(double valor) {
        return valor * (1 - DESCONTO);
    }
}
