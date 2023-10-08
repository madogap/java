package org.lanchonetes.atendimento.cozinha;

import org.lanchonetes.atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao(){System.out.println("ADICIONADO LANCHE");}
    public void adicionarSucoNoBalcao(){System.out.println("ADICIONAR SUCO NO BALCAO");}
    public void adicionarComboBalcao(){adicionarLancheNoBalcao();adicionarSucoNoBalcao();}

    public void pedirIngredientes(Almoxarife almoxarife){almoxarife.entregarIngredientes();}
    public void pedirParaTrocarGas(Almoxarife meuAmigo){meuAmigo.trocarGas();}
    

    public void fritarIngredientesLanche(){System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");}

    public void selecionarIngredientesVitamina(){System.out.println("SELCIONADO FRUTA, LEITE E SUCO");}
    public void selecionarIngredientesLanche(){System.out.println("SELECIONADO O PAO, SALADA, OVO E CARNE");}

    public void prepararCombo(){prepararLanche();preparaVitamina();}
    public void prepararVitamina(){System.out.println("PREPARANDO SUCO");}
    public void prepararLanche(){System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");}
    

}
