package Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        var random = new Random();
        for (int i = 0; i < 20; i++) {
            studenti.add(new Student("student"+i, random.nextInt(1,6)));
        }

        izlistajStudente(studenti, "Studenti");

        //studenti.sort(Comparator.naturalOrder());
        //studenti.sort((s1, s2)-> s1.compareTo(s2)); // natural order

        //studenti.sort(Comparator.reverseOrder());
        //studenti.sort((s1, s2)-> s2.compareTo(s1)); // reverse order

        Collections.sort(studenti);
        izlistajStudente(studenti, "Studenti sortirani uzlazno");

        Collections.shuffle(studenti);
        izlistajStudente(studenti, "Studenti promijesani");

        Collections.sort(studenti);
        Collections.reverse(studenti);
        izlistajStudente(studenti, "Studenti sortirani silazno");
    }

    private static void izlistajStudente(List<Student> studenti, String message) {
        System.out.println(message + ":");
        studenti.forEach(s->System.out.println(s));
        System.out.println();
    }
}
