public class Veiculo {
    public boolean licenciar() {
        return VeiculoFacade.verificarPendenciasVeiculo(this);
    }
}
