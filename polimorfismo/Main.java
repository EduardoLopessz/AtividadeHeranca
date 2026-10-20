import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> grupo = new ArrayList<Personagem>();

        grupo.add(new Guerreiro("Arthas", 120, 20, 15));
        grupo.add(new Mago("Gandalf", 80, 100, 30));
        grupo.add(new Arqueiro("Legolas", 90, 20, 25));
        grupo.add(new Mago("Merlin", 70, 5, 40));
        grupo.add(new Guerreiro("Aragorn", 110, 18, 12));
        grupo.add(new Paladino("Uther", 130, 20));

        System.out.println("----- Batalha do grupo de aventureiros -----");
        for (Personagem p: grupo) {
            p.atacar();
            System.out.println();
        }
    }
}
