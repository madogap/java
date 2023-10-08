package org.lanchonetes;

public class Estabelecimento {
    Cozinheiro cozinheiro = new Cozinheiro();
    //nao preciasam esta visiveis para todas as aplicacoes
    cozinheiro.lavarIngredientes();
    cozinheiro.baterVitaminaLiquidificador();
    cozinheiro.selecionarIngredientesVitamina();
    cozinheiro.preparaLanche();
    cozinheiro.preparaVitamina();
    cozinheiro.preparaVitamina();
    //estabelecimento com ciencia
    cozinheiro.adicionarSucoBalcao();
    cozinheiro.adicionarLancheBalcao();
    cozinheiro.adicionarComboBalcao();

    Almoxarife almoxarife = new Almoxarife();
    //nao preciasam esta visiveis para todas as aplicacoes
    almoxarife.controlarEntrada();
    almoxarife.controlarSaida();
    //acao somente o pacote cozinha precisar saber (default)
    almoxarife.entregarIngredientes();
    almoxarife.trocarGas();

    Atendente atendente = new Atendente();
    atendente.pegarLancheCozinha();
    atendente.receberPagameto();
    atendente.servindoMesa();
    //acoa somente o pacote cozinha precisar saber (default)
    atendente.trocarGas();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

    cliente.pegarPedidoBalcao();

    cliente.consultarSaldoAplicativo();

    cozinheiro.pedirParaTrocarGas(atendente);
    cozinheiro.pedirParaTrocarGas(almoxarife);





}
