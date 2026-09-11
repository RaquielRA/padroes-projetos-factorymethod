package padroescriacao.factorymethod;

public class ServicoPrata implements IServico {

    public String ativar() {
        return "Plano Prata ativado";
    }

    public String cancelar() {
        return "Plano Prata cancelado";
    }
}