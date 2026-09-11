package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoBronzeTest {

    @Test
    void deveAtivarBronze() {
        IServico servico = ServicoFactory.obterServico("Bronze");
        assertEquals("Plano Bronze ativado", servico.ativar());
    }

    @Test
    void deveCancelarBronze() {
        IServico servico = ServicoFactory.obterServico("Bronze");
        assertEquals("Plano Bronze cancelado", servico.cancelar());
    }
}