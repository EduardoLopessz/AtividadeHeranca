public class Mago extends Personagem {
    private int mana;
    private int poderMagico;

    public Mago(String nome, int vidaMaxima, int mana, int poderMagico) {
        super(nome, "Mago", vidaMaxima);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança uma bola de fogo!");
        lancarMagia();
    }

    public void lancarMagia() {
        if (mana < 10) {
            System.out.println(getNome() + " não tem mana suficiente para lançar magia. Mana atual: " + mana);
            return;
        }
        mana -= 10;
        System.out.println(getNome() + " lançou uma magia com poder mágico " + poderMagico + "! Mana restante: " + mana);
    }
}
