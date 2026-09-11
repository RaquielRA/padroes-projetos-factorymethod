package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoOuroTest {

    @Test
    void deveAtivarOuro() {
        IServico servico = ServicoFactory.obterServico("Ouro");
        assertEquals("Plano Ouro ativado", servico.ativar());
    }

    @Test
    void deveCancelarOuro() {
        IServico servico = ServicoFactory.obterServico("Ouro");
        assertEquals("Plano Ouro cancelado", servico.cancelar());
    }
}