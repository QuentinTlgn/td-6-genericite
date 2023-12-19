package revisions.exomusic;

public class InstrumentsACordes extends Instruments{

    private double longueur;
    private double largeur;

    public InstrumentsACordes(String nom, double prixAchat, double prixVente, double longueur, double largeur) {
        super(nom, prixAchat, prixVente);
        this.longueur = longueur;
        this.largeur = largeur;
    }
    
}
