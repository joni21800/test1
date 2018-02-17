package characterGen;

import characterGen.attributes.Attribute;
import characterGen.attributes.AttributeName;
import characterGen.attributes.SpecialAttributeName;

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
    public static final String[] attributeNames = {"Intelligenz", "Geisteskraft", "Charisma", "Stärke", "Gewandheit", "Belastbarkeit", "Schönheit", "Geschwindigkeit","Wahrnehmung"};


    public static Race getHuman() {
        List<Attribute> humanAttributes = new ArrayList<>();

       /*Schleife über die attributes: nehme immer das nächste Element des Arrays, stecke es in das lokale Feld attribute,
          und mache etwas damit:*/

        for (AttributeName attribute : AttributeName.values()) {
            humanAttributes.add(new Attribute(attribute, new Würfel(3, 6, 0)));
        }

        return new Race("Human", humanAttributes, new ArrayList<>());
    }

    public static Race getElf() {
        List<Attribute> elvenAttributes = new ArrayList<>();

        elvenAttributes.add(new Attribute(AttributeName.INTELLIGENCE, new Würfel(3, 6, 1)));
        elvenAttributes.add(new Attribute(AttributeName.MENTAL_STRENGTH, new Würfel(2, 6, 0)));
        elvenAttributes.add(new Attribute(AttributeName.CHARISMA, new Würfel(2, 6)));
        elvenAttributes.add(new Attribute(AttributeName.STRENGTH, new Würfel(3, 6, 0)));
        elvenAttributes.add(new Attribute(AttributeName.DEXTERITY, new Würfel(4, 6, 0)));
        elvenAttributes.add(new Attribute(AttributeName.CONSTITUTION, new Würfel(3, 6, 0)));
        elvenAttributes.add(new Attribute(AttributeName.BEAUTY, new Würfel(5, 6, 0)));
        elvenAttributes.add(new Attribute(AttributeName.SPEED, new Würfel(3, 6, 0)));
        elvenAttributes.add(new Attribute(AttributeName.PERCEPTION, new Würfel(4, 6)));


        return new Race("Elv", elvenAttributes, new ArrayList<>());
    }

    public static Race getDwarf() {
        List<Attribute> dwarvenAttributes = new ArrayList<>();

        dwarvenAttributes.add(new Attribute(AttributeName.INTELLIGENCE, new Würfel(3, 6, 0)));
        dwarvenAttributes.add(new Attribute(AttributeName.MENTAL_STRENGTH, new Würfel(2, 6, 0)));
        dwarvenAttributes.add(new Attribute(AttributeName.CHARISMA, new Würfel(2, 6, 0)));
        dwarvenAttributes.add(new Attribute(AttributeName.STRENGTH, new Würfel(4, 6, 6)));
        dwarvenAttributes.add(new Attribute(AttributeName.DEXTERITY, new Würfel(3, 6, 0)));
        dwarvenAttributes.add(new Attribute(AttributeName.CONSTITUTION, new Würfel(4, 6, 0)));
        dwarvenAttributes.add(new Attribute(AttributeName.BEAUTY, new Würfel(2, 6, 2)));
        dwarvenAttributes.add(new Attribute(AttributeName.SPEED, new Würfel(3, 6, 0)));
        dwarvenAttributes.add(new Attribute(AttributeName.PERCEPTION, new Würfel(2, 6)));
        List<Attribute> dwarvenSpecials = new ArrayList<>();
        dwarvenSpecials.add(new Attribute(SpecialAttributeName.DIG, new Würfel(1, 6, 0)));
        return new Race("Dwarf", dwarvenAttributes, dwarvenSpecials);
    }

    public static void main(String[] args) {


        //Character max = new Character("Max", human);
        //max.print();


        PlayerCharacter Legolas = new PlayerCharacter("Legolas", getElf());
        Legolas.print();

        System.out.println("\n");


        PlayerCharacter Gimli = new PlayerCharacter("Gimli", getDwarf());
        Gimli.print();
    }

}
