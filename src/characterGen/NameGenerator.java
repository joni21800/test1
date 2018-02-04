package characterGen;

import java.util.ArrayList;
import java.util.List;

public class NameGenerator {

    private List<String> names = new ArrayList<>();

    public NameGenerator() {
        initialize();
    }

    public void initialize() {
        names.add("Hugo");
        names.add("Kitana");
        names.add("Selina");
        names.add("Trutor");
    }

    public String createName() {

        System.out.println("We have " + names.size() + " names.");
        int x = (int) (Math.random() * names.size());
        return names.get(x);
    }

    List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
