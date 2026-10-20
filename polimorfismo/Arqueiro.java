public class Arqueiro extends Personagem {
    private int flechas;
    private int precisao;

    public Arqueiro(String nome, int vidaMaxima, int flechas, int precisao) {
        super(nome, "Arqueiro", vidaMaxima);
        this.flechas = flechas;
        this.precisao = precisao;
    }

    public int getFlechas() {
        return flechas;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void atacar() {
        System.out.println(getNome() + " dispara uma flecha!");
        atirar();
    }

    public void atirar() {
        if (flechas == 0) {
            System.out.println(getNome() + " não tem flechas para atirar.");
            return;
        }
        flechas--;
        System.out.println(getNome() + " atirou uma flecha com precisão " + precisao + "! Flechas restantes: " + flechas);
    }
}
