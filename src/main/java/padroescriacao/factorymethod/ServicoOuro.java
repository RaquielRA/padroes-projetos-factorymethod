package padroescriacao.factorymethod;

public class ServicoOuro implements IServico {

    public String ativar() {
        return "Plano Ouro ativado";
    }

    public String cancelar() {
        return "Plano Ouro cancelado";
    }
}