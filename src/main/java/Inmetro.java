public class Inmetro extends Orgao {
    private static final Inmetro inmetro = new Inmetro();
    private Inmetro() {}

    public static Inmetro getInstance() {
        return inmetro;
    }
}
