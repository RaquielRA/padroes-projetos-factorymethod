package padroescriacao.factorymethod;

public class ServicoBronze implements IServico {

    public String ativar() {
        return "Plano Bronze ativado";
    }

    public String cancelar() {
        return "Plano Bronze cancelado";
    }
}