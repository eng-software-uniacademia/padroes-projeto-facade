public class Detran extends Orgao {
    private static final Detran detran = new Detran();
    private Detran() {}

    public static Detran getInstance() {
        return detran;
    }
}
