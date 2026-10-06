package org.example;

import java.util.Locale;

public final class PagamentoCartao implements FormaPagamento {
    @Override
    public String pagar(double valor) {
        return "Pagamento com cartão: R$ "
                + String.format(Locale.ROOT, "%.2f", valor).replace('.', ',');
    }
}
