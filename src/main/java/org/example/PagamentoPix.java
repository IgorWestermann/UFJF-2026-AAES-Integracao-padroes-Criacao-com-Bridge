package org.example;

import java.util.Locale;

public final class PagamentoPix implements FormaPagamento {
    @Override
    public String pagar(double valor) {
        return "Pagamento via Pix: R$ "
                + String.format(Locale.ROOT, "%.2f", valor).replace('.', ',');
    }
}
