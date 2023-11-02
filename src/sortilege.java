public class sortilege extends carte {
    private String nom, explication;

    sortilege(int cout, String nom, String explication) {
        this.cout = cout;
        this.nom = nom;
        this.explication = explication;

        System.out.println("Un sortilège de plus.");
    }

    public String getExplication() {
        return explication;
    }

    @Override
    public String toString() {
        return "un sortilege " + nom;
    }
}
