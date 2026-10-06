package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CobrancaTest {
    @Test
    void cobrancaComumDeveManterValorOriginal() {
        Cobranca cobranca = new CobrancaComum(new PagamentoPix());

        assertEquals("Pagamento via Pix: R$ 100,00", cobranca.cobrar(100.00));
    }

    @Test
    void cobrancaPromocionalDeveAplicarDezPorCentoDeDesconto() {
        Cobranca cobranca = new CobrancaPromocional(new PagamentoPix());

        assertEquals("Pagamento via Pix: R$ 90,00", cobranca.cobrar(100.00));
    }

    @Test
    void mesmaCobrancaDeveAceitarDiferentesFormasDePagamento() {
        Cobranca cobrancaEmDinheiro = new CobrancaComum(new PagamentoDinheiro());
        Cobranca cobrancaNoCartao = new CobrancaComum(new PagamentoCartao());

        assertEquals("Pagamento em dinheiro: R$ 80,00", cobrancaEmDinheiro.cobrar(80.00));
        assertEquals("Pagamento com cartão: R$ 80,00", cobrancaNoCartao.cobrar(80.00));
    }

    @Test
    void abstracaoEImplementacaoDevemVariarIndependentemente() {
        Cobranca comumComVale = new CobrancaComum(new PagamentoValeRefeicao());
        Cobranca promocionalComVale = new CobrancaPromocional(new PagamentoValeRefeicao());

        assertEquals("Pagamento com vale-refeição: R$ 120,00", comumComVale.cobrar(120.00));
        assertEquals("Pagamento com vale-refeição: R$ 108,00", promocionalComVale.cobrar(120.00));
    }
}
