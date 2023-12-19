package revisions.exomusic;

public class InstrumentsAVent extends Instruments {

    private String type;

    public InstrumentsAVent(String nom, double prixAchat, double prixVente, String type) {
        super(nom, prixAchat, prixVente);
        this.type = type;
    }

}
