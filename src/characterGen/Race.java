package characterGen;

import java.util.ArrayList;
import java.util.List;

public class Race {
    
    private String name;
    private List<Attribute> attributes = new ArrayList<>();

    public Race(String name, List<Attribute> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }
}
