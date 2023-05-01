import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VeiculoTest {
    @Test
    void deveRetornarPendenciaInmetro() {
        var lancer = new Veiculo();
        Inmetro.getInstance().addVeiculoPendente(lancer);

        assertFalse(lancer.licenciar());
    }

    @Test
    void deveRetornarPendenciaDetran() {
        var lancer = new Veiculo();
        Detran.getInstance().addVeiculoPendente(lancer);

        assertFalse(lancer.licenciar());
    }

    @Test
    void deveRetornarSemPendencia() {
        var lancer = new Veiculo();
        assertTrue(lancer.licenciar());
    }
}
