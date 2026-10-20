import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personagem> grupo = new ArrayList<>();
        grupo.add(new Guerreiro("Arthas", 120, 20, 15));
        grupo.add(new Mago("Gandalf", 80, 100, 30));
        grupo.add(new Arqueiro("Legolas", 90, 20, 25));
        grupo.add(new Mago("Merlin", 70, 5, 40));
        grupo.add(new Guerreiro("Aragorn", 110, 18, 12));
        grupo.add(new Paladino("Uther", 130, 20));

        System.out.println("----- Batalha do grupo de aventureiros -----");
        for (Personagem personagem : grupo) {
            personagem.atacar();
            System.out.println();
        }
    }
}
