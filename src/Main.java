
interface Zivotinja {
    void glasanje();
}

class Pas implements Zivotinja {
    @Override
    public void glasanje() {
        System.out.println("Av Av");
    }
}

public class Main {
    public static void main(String[] args) {
        var pas = new Pas();
        pas.glasanje();
    }
}