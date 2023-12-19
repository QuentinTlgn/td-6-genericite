package revisions.exomusic;

public class Piano extends InstrumentsACordes{
    public Piano(String nom, double prixAchat, double prixVente, double longueur, double largeur, int nbTouches) {
        super(nom, prixAchat, prixVente, longueur, largeur);
        this.nbTouches = nbTouches;
    }

    private int nbTouches;
}
