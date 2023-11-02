public class creature extends carte {
    private String nom;
    private int ptd, ptv;

    creature(int cout, String nom, int ptd, int ptv) {
        this.cout = cout;
        this.nom = nom;
        this.ptd = ptd;
        this.ptv = ptv;

        System.out.println("Une nouvelle creature.");

    }

    @Override
    public String toString() {
        return "une creature " + nom + " " + ptd + "/" + ptv;
    }
}
