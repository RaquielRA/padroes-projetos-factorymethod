package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPrataTest {

    @Test
    void deveAtivarPrata() {
        IServico servico = ServicoFactory.obterServico("Prata");
        assertEquals("Plano Prata ativado", servico.ativar());
    }

    @Test
    void deveCancelarPrata() {
        IServico servico = ServicoFactory.obterServico("Prata");
        assertEquals("Plano Prata cancelado", servico.cancelar());
    }
}