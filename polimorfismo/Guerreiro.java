public class Guerreiro extends Personagem {
    private int forca;
    private int armadura;

    public Guerreiro(String nome, int vidaMaxima, int forca, int armadura) {
        super(nome, "Guerreiro", vidaMaxima);
        this.forca = forca;
        this.armadura = armadura;
    }

    public int getForca() {
        return forca;
    }

    public int getArmadura() {
        return armadura;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com sua espada!");
        golpear();
    }

    public void golpear() {
        System.out.println(getNome() + " realizou um golpe com força " + forca + "!");
    }
}
