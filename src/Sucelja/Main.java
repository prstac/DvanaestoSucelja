package Sucelja;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var patka = new Patka();
        patka.plivaj();
        patka.leti();
        Skocimis sismis = new Skocimis();
        sismis.leti();
        List<Leti> leteceZivotinje = new ArrayList<>();
        leteceZivotinje.add(sismis);
     }
}
