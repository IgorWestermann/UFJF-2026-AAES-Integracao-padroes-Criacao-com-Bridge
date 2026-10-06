package org.example;

import java.util.Objects;

public abstract class Cobranca {
    protected final FormaPagamento formaPagamento;

    protected Cobranca(FormaPagamento formaPagamento) {
        this.formaPagamento = Objects.requireNonNull(formaPagamento);
    }

    public String cobrar(double valor) {
        return formaPagamento.pagar(calcularValorFinal(valor));
    }

    protected abstract double calcularValorFinal(double valor);
}
