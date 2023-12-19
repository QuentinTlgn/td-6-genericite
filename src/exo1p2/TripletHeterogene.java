package exo1p2;

public class TripletHeterogene<T1, T2, T3> {

    private final T1 premier;
    private final T2 second;
    private final T3 troisieme;

    public TripletHeterogene(T1 premier, T2 second, T3 troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public T1 getPremier() {
        return premier;
    }

    public T2 getSecond() {
        return second;
    }

    public T3 getTroisieme() {
        return troisieme;
    }

    public void afficher(){
        System.out.println("Premier : "+premier+", second : "+second+", troisieme : "+troisieme);
    }    
}
