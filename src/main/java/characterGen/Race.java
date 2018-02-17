package characterGen;

import characterGen.attributes.Attribute;

import java.util.ArrayList;
import java.util.List;

public class Race {
    
    private String name;
    private List<Attribute> attributes = new ArrayList<>();
    private List<Attribute> extraAttributes;

    public Race(String name, List<Attribute> attributes, List<Attribute> extraAttributes) {
        this.name = name;
        this.attributes = attributes;
        this.extraAttributes = extraAttributes;
    }

    public String getName() {
        return name;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<Attribute> getExtraAttributes() {
        return extraAttributes;
    }
}
