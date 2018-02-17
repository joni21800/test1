package characterGen;

import java.util.ArrayList;
import java.util.List;

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


    public Race getHuman() {
        List<Attribute> humanAttributes = new ArrayList<>();

       /*Schleife über die attributes: nehme immer das nächste Element des Arrays, stecke es in das lokale Feld attribute,
          und mache etwas damit:*/

        for (String attribute : attributeNames) {
            humanAttributes.add(new Attribute(attribute, new Würfel(3, 6, 0)));
        }

        return new Race("Human", humanAttributes);
    }
    
    

    public static void main(String[] args) {


        //Character max = new Character("Max", human);
        //max.print();

        // TODO: elf in eigene Methode
        List<Attribute> elvenAttributes = new ArrayList<>();

        elvenAttributes.add(new Attribute("Intelligenz", new Würfel(3, 6, 1)));
        elvenAttributes.add(new Attribute("Geisteskraft", new Würfel(2, 6, 0)));
        elvenAttributes.add(new Attribute("Charisma", new Würfel(2, 6, 0)));
        elvenAttributes.add(new Attribute("Stärke", new Würfel(3, 6, 0)));
        elvenAttributes.add(new Attribute("Gewandheit", new Würfel(4, 6, 0)));
        elvenAttributes.add(new Attribute("Belastbarkeit", new Würfel(3, 6, 0)));
        elvenAttributes.add(new Attribute("Schönheit", new Würfel(5, 6, 0)));
        elvenAttributes.add(new Attribute("Geschwindigkeit", new Würfel(3, 6, 0)));

        Race elv = new Race("Elv", elvenAttributes);

        PlayerCharacter Legolas = new PlayerCharacter("Legolas", elv);
        Legolas.print();

        System.out.println("\n");

        // TODO: Zwerg in eigene Methode
        List<Attribute> dwarvenAttributes = new ArrayList<>();

        dwarvenAttributes.add(new Attribute("Intelligenz", new Würfel(3, 6, 0)));
        dwarvenAttributes.add(new Attribute("Geisteskraft", new Würfel(2, 6, 0)));
        dwarvenAttributes.add(new Attribute("Charisma", new Würfel(2, 6, 0)));
        dwarvenAttributes.add(new Attribute("Stärke", new Würfel(4, 6, 6)));
        dwarvenAttributes.add(new Attribute("Gewandheit", new Würfel(3, 6, 0)));
        dwarvenAttributes.add(new Attribute("Belastbarkeit", new Würfel(4, 6, 0)));
        dwarvenAttributes.add(new Attribute("Schönheit", new Würfel(2, 6, 2)));
        dwarvenAttributes.add(new Attribute("Geschwindigkeit", new Würfel(3, 6, 0)));

        Race dwarf = new Race("Dwarf", dwarvenAttributes);

        PlayerCharacter Gimli = new PlayerCharacter("Gimli", dwarf);
        Gimli.print();
    }

}
