public class VeiculoFacade {
    public static boolean verificarPendenciasVeiculo(Veiculo veiculo) {
        return !Detran.getInstance().verificarVeiculoComPendencia(veiculo) &&
                !Inmetro.getInstance().verificarVeiculoComPendencia(veiculo);
    }
}
