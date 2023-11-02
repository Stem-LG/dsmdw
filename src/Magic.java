public class Magic {
    public static void main(String[] args) {
        Jeu maMain = new Jeu(10);
        terrain t = new terrain('B');
        maMain.ajouter(t);
        creature c = new creature(6, " Gobelin", 4, 6);
        maMain.ajouter(c);
        sortilege s = new sortilege(1, "Amplificatum", "Il augmente la taille de l'objet ou de l'animal visé");
        maMain.ajouter(s);
        System.out.println("Là, j'ai en stock :");
        maMain.afficher();
        maMain.jouer();
        maMain.jouer();
    }
}