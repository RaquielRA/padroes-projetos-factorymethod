package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDiamanteTest {

    @Test
    void deveAtivarDiamante() {
        IServico servico = ServicoFactory.obterServico("Diamante");
        assertEquals("Plano Diamante ativado", servico.ativar());
    }

    @Test
    void deveCancelarDiamante() {
        IServico servico = ServicoFactory.obterServico("Diamante");
        assertEquals("Plano Diamante cancelado", servico.cancelar());
    }
}