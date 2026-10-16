public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Aragorn", 120, 20, 15);
        Mago mago = new Mago("Gandalf", 80, 100, 30);
        Arqueiro arqueiro = new Arqueiro("Legolas", 90, 20, 25);

        System.out.println("----- Personagens criados -----");
        guerreiro.exibirStatus();
        System.out.println("Força: " + guerreiro.getForca());
        System.out.println("Armadura: " + guerreiro.getArmadura());
        System.out.println();

        mago.exibirStatus();
        System.out.println("Mana: " + mago.getMana());
        System.out.println("Poder mágico: " + mago.getPoderMagico());
        System.out.println();

        arqueiro.exibirStatus();
        System.out.println("Flechas: " + arqueiro.getFlechas());
        System.out.println("Precisão: " + arqueiro.getPrecisao());

        System.out.println("\n----- Ações específicas -----");
        guerreiro.golpear();
        mago.lancarMagia();
        arqueiro.atirar();

        System.out.println("\n----- Mago lança magias até acabar a mana -----");
        while (mago.getMana() >= 10) {
            mago.lancarMagia();
        }
        mago.lancarMagia();

        System.out.println("\n----- Arqueiro atira até acabar as flechas -----");
        while (arqueiro.getFlechas() > 0) {
            arqueiro.atirar();
        }
        arqueiro.atirar();

        System.out.println("\n----- Ações gerais de Personagem -----");
        guerreiro.receberDano(40);
        guerreiro.recuperarVida(15);
        guerreiro.subirNivel();

        mago.receberDano(100);
        mago.recuperarVida(50);
        mago.receberMoedas(30);

        arqueiro.receberMoedas(50);
        arqueiro.gastarMoedas(500);
        arqueiro.gastarMoedas(120);

        System.out.println("\n----- Estado final -----");
        guerreiro.exibirStatus();
        System.out.println("Força: " + guerreiro.getForca());
        System.out.println("Armadura: " + guerreiro.getArmadura());
        System.out.println();

        mago.exibirStatus();
        System.out.println("Mana: " + mago.getMana());
        System.out.println("Poder mágico: " + mago.getPoderMagico());
        System.out.println();

        arqueiro.exibirStatus();
        System.out.println("Flechas: " + arqueiro.getFlechas());
        System.out.println("Precisão: " + arqueiro.getPrecisao());
    }
}
