public class Paladino extends Personagem {
    private int fe;

    public Paladino(String nome, int vidaMaxima, int fe) {
        super(nome, "Paladino", vidaMaxima);
        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " golpeia com seu martelo sagrado com fé " + fe + "!");
        recuperarVida(fe / 2);
    }
}
