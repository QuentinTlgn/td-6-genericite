package revisions;

public class conversionHeure {

    private int heures;
    private int minutes;
    private int secondes;

    public conversionHeure(int heures, int minutes, int secondes) {
        super();
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public conversionHeure(double duree){
        int total = (int) (duree * 3600);
        heures = total/3600;
        total %= 3600;
        minutes = total / 60;
        total %= 60;
        secondes = total;
    }

    public int getH() {
        return heures;
    }

    public int getM() {
        return minutes;
    }

    public int getS() {
        return secondes;
    }

    public double getDecimal() {
        int total = secondes + minutes * 60 + heures * 3600;
        return ((double) total)/3600.0;
    }

    
}
