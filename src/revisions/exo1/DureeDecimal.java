package revisions.exo1;

public class DureeDecimal {

    private double duree;

    public int getHeures(){
        return (int) (duree);
    }

    public int getMinutes(){
        return (int) (duree - getHeures()) *60;
    }

    public int getSecondes(){
        return (int) (duree - getHeures() - getMinutes()) / 60 *3600;
    }

    
}
