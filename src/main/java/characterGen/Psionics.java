package characterGen;

public enum Psionics {

    NONE("Keine"),
    MINOR("Gering"),
    MAYOR("Gewaltig");

    private String name;

    Psionics(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
