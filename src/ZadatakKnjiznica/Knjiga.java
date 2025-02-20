package ZadatakKnjiznica;

public class Knjiga implements PosudbaKnjige, Comparable<Knjiga>{
    String naslov;
    boolean jePosudjena = false;

    public Knjiga(String naslov) {
        this.naslov = naslov;
    }

    @Override
    public void posudiKnjigu() {
        jePosudjena = true;
        System.out.println("Posudio " + naslov);
    }

    @Override
    public void vratiKnjigu() {
        jePosudjena = false;
        System.out.println("Vratio " + naslov);
    }

    @Override
    public int compareTo(Knjiga o) {
        return naslov.compareTo(o.naslov);
    }

    @Override
    public String toString() {
        return "Knjiga s naslovom " + naslov + " je " + (jePosudjena? "posuđena" : "dostupna");
    }
}
