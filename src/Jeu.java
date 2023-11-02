import java.util.ArrayList;

public class Jeu {

    private ArrayList<carte> tabCartes = new ArrayList<carte>();
    private int max;

    private int nb;

    Jeu(int nbc) {
        nb = 0;
        max = nbc;
        System.out.println("on change de main");
    }

    public void ajouter(carte c) {
        if (nb < max) {
            tabCartes.add(c);
            nb++;
        }
    }

    public void jouer() {
        if (nb > 0) {
            System.out.println("Je joue une carte...");
            System.out.println("La carte jouée est :");
            System.out.println(tabCartes.remove(0));
            nb--;
        }
    }

    public void afficher() {
        for (int i = 0; i < nb; i++) {
            System.out.println(tabCartes.get(i));
        }
    }
}
