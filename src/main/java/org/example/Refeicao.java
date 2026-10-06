package org.example;

import java.util.Objects;

public final class Refeicao {
    private final PratoPrincipal pratoPrincipal;
    private final Acompanhamento acompanhamento;
    private final Bebida bebida;

    public Refeicao(PratoPrincipal pratoPrincipal, Acompanhamento acompanhamento, Bebida bebida) {
        this.pratoPrincipal = Objects.requireNonNull(pratoPrincipal);
        this.acompanhamento = Objects.requireNonNull(acompanhamento);
        this.bebida = Objects.requireNonNull(bebida);
    }

    public PratoPrincipal pratoPrincipal() {
        return pratoPrincipal;
    }

    public Acompanhamento acompanhamento() {
        return acompanhamento;
    }

    public Bebida bebida() {
        return bebida;
    }

    public String descricao() {
        return pratoPrincipal.nome() + ", " + acompanhamento.nome() + " e " + bebida.nome();
    }
}
