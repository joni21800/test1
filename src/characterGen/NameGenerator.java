package characterGen;

import java.util.ArrayList;
import java.util.List;

public class NameGenerator {

    static List<String> names = new ArrayList<>();

    // initialize names list
    static {
        names.add("Hugo");
        names.add("Kitana");
        names.add("Selina");
        names.add("Trutor");
    }

    public static String createName() {
        System.out.println("We have " + names.size() + " names.");
        int x = (int) (Math.random() * names.size());
        return names.get(x);
    }
}
