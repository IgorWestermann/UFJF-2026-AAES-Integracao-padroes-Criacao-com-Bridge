package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormasPagamentoTest {
    @Test
    void dinheiroDeveProcessarPagamentoIsoladamente() {
        assertEquals("Pagamento em dinheiro: R$ 50,00", new PagamentoDinheiro().pagar(50.00));
    }

    @Test
    void cartaoDeveProcessarPagamentoIsoladamente() {
        assertEquals("Pagamento com cartão: R$ 50,00", new PagamentoCartao().pagar(50.00));
    }

    @Test
    void pixDeveProcessarPagamentoIsoladamente() {
        assertEquals("Pagamento via Pix: R$ 50,00", new PagamentoPix().pagar(50.00));
    }

    @Test
    void valeRefeicaoDeveProcessarPagamentoIsoladamente() {
        assertEquals("Pagamento com vale-refeição: R$ 50,00", new PagamentoValeRefeicao().pagar(50.00));
    }
}
