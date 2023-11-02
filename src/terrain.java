public class terrain extends carte {

    private String couleur;

    terrain(char type) {
        cout = 0;

        switch (type) {
            case 'B':
                couleur = "Blanc";
                break;
            case 'b':
                couleur = "Bleu";
                break;
            case 'n':
                couleur = "Noir";
                break;
            case 'r':
                couleur = "Rouge";
                break;
            case 'v':
                couleur = "Vert";
                break;
            default:
                break;
        }

        System.out.println("Un nouveau terrain.");

    }

    @Override
    public String toString() {
        return "Un terrain " + couleur;
    }

}
