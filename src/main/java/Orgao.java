import java.util.ArrayList;
import java.util.List;

public class Orgao {
    private final List<Veiculo> veiculosComPendencia = new ArrayList<>();

    public void addVeiculoPendente(Veiculo veiculo) {
        this.veiculosComPendencia.add(veiculo);
    }

    public boolean verificarVeiculoComPendencia(Veiculo veiculo) {
        return this.veiculosComPendencia.contains(veiculo);
    }
}
