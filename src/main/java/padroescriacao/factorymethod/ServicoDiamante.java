package padroescriacao.factorymethod;

public class ServicoDiamante implements IServico {

    public String ativar() {
        return "Plano Diamante ativado";
    }

    public String cancelar() {
        return "Plano Diamante cancelado";
    }
}