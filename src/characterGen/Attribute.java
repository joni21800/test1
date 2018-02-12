package characterGen;

public class Attribute {
    
    /*
     * private: dieses Feld kann von außen nur über eine Methode erreicht werden (wenn es eine dafür gibt).
     * D.h., für Attribute-Objekte einer Rasse ist es nachher nicht möglich, diese (aus Versehen / absichtlich) von außen zu verändern.
     * Jeder, der auf Würfel dieser Klasse zugreifen will, um sie zu lesen, muß getDice() aufrufen.
     * 
     */
    private String name;
    private Würfel dice;

    public Attribute(String name, Würfel dice) {
        this.name = name;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public Würfel getDice() {
        return dice;
    }

    @Override
    public String toString() {
        return name + ": " +dice;
    }
}
