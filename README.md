# UFJF 2026 — Singleton, Factory Method, Abstract Factory e Bridge

Projeto didático em Java que demonstra quatro padrões de projeto por meio de um restaurante capaz de preparar refeições brasileiras e mexicanas e cobrar por elas de diferentes maneiras.

## Padrões utilizados

### Singleton

`GerenciadorRestaurante` possui construtor privado e mantém uma única instância, acessada por `obterInstancia()`. Ele é o ponto central usado para servir refeições preparadas por diferentes restaurantes.

### Factory Method

`RestauranteRegional` define o fluxo fixo de preparação em `prepararRefeicao()` e delega a escolha da fábrica ao Factory Method `criarFabricaIngredientes()`. `RestauranteBrasileiro` e `RestauranteMexicano` sobrescrevem esse método para selecionar a família regional adequada.

### Abstract Factory

`FabricaIngredientesRegionais` declara a criação dos três produtos que compõem uma refeição: `PratoPrincipal`, `Acompanhamento` e `Bebida`. `FabricaIngredientesBrasileiros` e `FabricaIngredientesMexicanos` criam famílias completas e compatíveis desses produtos.

### Bridge

`Cobranca` é a abstração que mantém uma referência para a implementação `FormaPagamento`. `CobrancaComum` e `CobrancaPromocional` podem ser combinadas livremente com pagamento em dinheiro, cartão, Pix ou vale-refeição, permitindo que as duas hierarquias evoluam independentemente.

## Papéis das classes

| Classe ou interface | Papel |
| --- | --- |
| `GerenciadorRestaurante` | Singleton que coordena o atendimento |
| `RestauranteRegional` | Creator abstrato do Factory Method e fluxo comum de preparo |
| `RestauranteBrasileiro` | Concrete Creator que escolhe a fábrica brasileira |
| `RestauranteMexicano` | Concrete Creator que escolhe a fábrica mexicana |
| `FabricaIngredientesRegionais` | Abstract Factory das famílias de produtos |
| `FabricaIngredientesBrasileiros` | Concrete Factory de produtos brasileiros |
| `FabricaIngredientesMexicanos` | Concrete Factory de produtos mexicanos |
| `PratoPrincipal`, `Acompanhamento`, `Bebida` | Contratos dos produtos abstratos |
| `Feijoada`, `Farofa`, `Guarana` | Produtos concretos da família brasileira |
| `Tacos`, `Guacamole`, `Tequila` | Produtos concretos da família mexicana |
| `Refeicao` | Objeto que compõe um produto de cada categoria |
| `Cobranca` | Abstração do Bridge que delega o pagamento |
| `CobrancaComum` | Abstração refinada que mantém o valor original |
| `CobrancaPromocional` | Abstração refinada que concede 10% de desconto |
| `FormaPagamento` | Implementação do Bridge |
| `PagamentoDinheiro`, `PagamentoCartao`, `PagamentoPix`, `PagamentoValeRefeicao` | Implementações concretas dos meios de pagamento |
| `Main` | Demonstra a colaboração entre os quatro padrões |

## Como as classes colaboram

O `Main` obtém a instância única de `GerenciadorRestaurante` e entrega a ela um restaurante concreto. O restaurante executa o fluxo definido em `RestauranteRegional`, cujo Factory Method seleciona uma implementação de `FabricaIngredientesRegionais`. Essa fábrica cria prato principal, acompanhamento e bebida da mesma família, e o restaurante os reúne em uma `Refeicao`.

Trocar `RestauranteBrasileiro` por `RestauranteMexicano` altera toda a família de produtos sem modificar o fluxo de preparação nem o Singleton.

Depois de preparar as refeições, o `Main` combina tipos de cobrança com formas de pagamento. A composição substitui uma multiplicação de subclasses: qualquer cobrança pode utilizar qualquer forma de pagamento sem que uma hierarquia dependa dos detalhes da outra.

## Requisitos

- Java 17 ou superior
- Maven 3.9 ou superior

## Executar o projeto

```bash
mvn --no-transfer-progress compile exec:java
```

Saída esperada:

```text
Refeição brasileira: Feijoada, Farofa e Guaraná
Refeição mexicana: Tacos, Guacamole e Tequila
Pagamento via Pix: R$ 50,00
Pagamento com vale-refeição: R$ 45,00
```

## Executar os testes

```bash
mvn --no-transfer-progress test
```
