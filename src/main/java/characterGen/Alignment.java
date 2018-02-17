package characterGen;

public enum Alignment {
    
    PRINCIPLED("Prinzipientreu"),
    SCRUPULOUS("Gewissenhaft"),
    ANARCHIST("Anarchist"),
    UNPRINCIPLED("Prinzipienlos"),
    MISCREANT("Bösartig"),
    ABERRANT("Verdreht"),
    DIABOLIC("Teuflisch");
    
    private String name;

    Alignment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
