package org.example;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        GerenciadorRestaurante gerenciador = GerenciadorRestaurante.obterInstancia();

        Refeicao refeicaoBrasileira = gerenciador.servirRefeicao(new RestauranteBrasileiro());
        Refeicao refeicaoMexicana = gerenciador.servirRefeicao(new RestauranteMexicano());

        System.out.println("Refeição brasileira: " + refeicaoBrasileira.descricao());
        System.out.println("Refeição mexicana: " + refeicaoMexicana.descricao());

        Cobranca cobrancaComum = new CobrancaComum(new PagamentoPix());
        Cobranca cobrancaPromocional = new CobrancaPromocional(new PagamentoValeRefeicao());

        System.out.println(cobrancaComum.cobrar(50.00));
        System.out.println(cobrancaPromocional.cobrar(50.00));
    }
}
