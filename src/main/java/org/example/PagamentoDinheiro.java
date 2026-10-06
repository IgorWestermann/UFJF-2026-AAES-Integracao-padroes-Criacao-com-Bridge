package org.example;

import java.util.Locale;

public final class PagamentoDinheiro implements FormaPagamento {
    @Override
    public String pagar(double valor) {
        return "Pagamento em dinheiro: R$ "
                + String.format(Locale.ROOT, "%.2f", valor).replace('.', ',');
    }
}
