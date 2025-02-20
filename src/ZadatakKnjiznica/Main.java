package ZadatakKnjiznica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Knjiga> knjige = new ArrayList<>();
        knjige.add(new Knjiga("A"));
        knjige.add(new Knjiga("B"));
        knjige.add(new Knjiga("C"));
        knjige.add(new Knjiga("D"));
        knjige.add(new Knjiga("E"));
        knjige.add(new Knjiga("F"));
        knjige.add(new Knjiga("G"));

        Collections.shuffle(knjige);

        Collections.sort(knjige);

        knjige.get(1).posudiKnjigu();
        knjige.get(2).posudiKnjigu();
        knjige.get(3).posudiKnjigu();
        knjige.get(3).vratiKnjigu();;

        knjige.forEach(k-> System.out.println(k));
    }
}
