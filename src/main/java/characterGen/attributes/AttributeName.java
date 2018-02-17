package characterGen.attributes;

public enum AttributeName {

    // enum = enumeration = Aufzählung
    INTELLIGENCE("Intelligenz"),
    MENTAL_STRENGTH("Geisteskraft"),
    CHARISMA("Charisma"),
    STRENGTH("Stärke"),
    DEXTERITY("Gewandheit"),
    CONSTITUTION("Belastbarkeit"),
    BEAUTY("Schönheit"),
    SPEED("Geschwindigkeit"),
    PERCEPTION("Wahrnehmung");

    private String name;

    AttributeName(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
