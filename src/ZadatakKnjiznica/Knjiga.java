package ZadatakKnjiznica;

import java.text.Collator;
import java.util.Locale;

public class Knjiga implements PosudbaKnjige, Comparable<Knjiga>{
    String naslov;
    boolean jePosudjena = false;
    Collator collator = Collator.getInstance(new Locale.Builder().setLanguage("hr").build());

    public Knjiga(String naslov) {
        this.naslov = naslov;
    }

    @Override
    public void posudiKnjigu() {
        if (jePosudjena) {
            System.out.println(naslov + " ne možete posuditi jer je već posuđen");
        } else {
            jePosudjena = true;
            System.out.println("Posudio " + naslov);
        }
    }

    @Override
    public void vratiKnjigu() {
        if (!jePosudjena) {
            System.out.println(naslov + " se ne može vratiti jer nije ni posuđena");
        } else {
            jePosudjena = false;
            System.out.println("Vratio " + naslov);
        }
    }

    @Override
    public int compareTo(Knjiga o) {
        return collator.compare(naslov, o.naslov);
        //return naslov.compareTo(o.naslov);
    }

    @Override
    public String toString() {
        return "Knjiga s naslovom " + naslov + " je " + (jePosudjena? "posuđena" : "dostupna");
    }
}
