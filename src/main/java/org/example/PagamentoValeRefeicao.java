package org.example;

import java.util.Locale;

public final class PagamentoValeRefeicao implements FormaPagamento {
    @Override
    public String pagar(double valor) {
        return "Pagamento com vale-refeição: R$ "
                + String.format(Locale.ROOT, "%.2f", valor).replace('.', ',');
    }
}
