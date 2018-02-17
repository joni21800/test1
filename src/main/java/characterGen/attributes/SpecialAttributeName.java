package characterGen.attributes;

public enum SpecialAttributeName {

    DIG("buddeln");

    private String name;

    SpecialAttributeName(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
