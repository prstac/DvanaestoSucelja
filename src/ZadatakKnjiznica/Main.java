package ZadatakKnjiznica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Knjiga> knjige = new ArrayList<>();
        knjige.add(new Knjiga("A"));
        knjige.add(new Knjiga("Ž"));
        knjige.add(new Knjiga("B"));
        knjige.add(new Knjiga("C"));
        knjige.add(new Knjiga("Č"));
        knjige.add(new Knjiga("D"));
        knjige.add(new Knjiga("E"));
        knjige.add(new Knjiga("F"));
        knjige.add(new Knjiga("G"));
        knjige.add(new Knjiga("L"));
        knjige.add(new Knjiga("Lo"));
        knjige.add(new Knjiga("LJ"));
        knjige.add(new Knjiga("LJa"));
        knjige.add(new Knjiga("LJb"));
        knjige.add(new Knjiga("La"));
        knjige.add(new Knjiga("J"));

        Collections.shuffle(knjige);
        izlistaj(knjige, "Promijesane knjige");

        knjige.get(1).posudiKnjigu();
        knjige.get(2).posudiKnjigu();
        knjige.get(3).posudiKnjigu();
        knjige.get(3).vratiKnjigu();
        knjige.get(3).vratiKnjigu();
        knjige.get(3).posudiKnjigu();
        knjige.get(3).posudiKnjigu();
        knjige.get(3).vratiKnjigu();
        System.out.println();

        Collections.sort(knjige);

        izlistaj(knjige, "Sortirane knjige");
    }

    private static void izlistaj(List<Knjiga> knjige, String naslov) {
        System.out.println(naslov);
        knjige.forEach(k-> System.out.println(k));
        System.out.println();
    }
}
