package characterGen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterGenerator {
    
    // Feld "races" in CharacterGenerator ist eine Liste von Race-Objekten.
    // Der genaue Typ ist: ArrayList für "Race" Objekte.
    // <> ist eine Kurzform für "nimm den gleichen Typ wie vorne in der Feld-Definition" - man könnte also auch ArrayList<Race>() schreiben. 
    public List<Race> races = new ArrayList<>();

    // ein Array (festgelegte Liste) von Strings (Zeichenketten).
    // siehe auch: http://schabby.de/java-arrays/
    // static: von überall im Programm über CharacterGenerator.attributeNames zu erreichen.
    // final: dieses Feld kann nicht verändert werden.
    public static final String[] attributeNames = {"Intelligenz", "Geisteskraft", "Charisma", "Stärke", "Gewandheit", "Belastbarkeit", "Schönheit", "Geschwindigkeit"};



    
    public static void main(String[] args) {
        List<Attribute> humanAttributes = new ArrayList<>();
        
        /*
         * Schleife über die attributes: nehme immer das nächste Element des Arrays, stecke es in das lokale Feld attribute,
         * und mache etwas damit:
         */
        for(String attribute : attributeNames){
            humanAttributes.add(new Attribute(attribute, new Würfel(3,6,0)));
        }
        
        Race human = new Race("Human", humanAttributes);
        
        Character max = new Character("Max", human);
        max.print();
        
    }
    
}
