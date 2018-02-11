package characterGen;

import java.util.HashMap;
import java.util.Map;

public class Character {

    String name;
    Race race;

    /*
     * Eine Map hat einen Schlüssel und einen Wert (key,value).
     */
    public static Map<String, Integer> attributeMap = new HashMap<>();


    public Character() {
    }

    public Character(String name, Race race) {
        this.name = name;
        this.race = race;
        for (Attribute attribute : race.getAttributes()) {
            /*
             * Mit attributeMap.put(key, value) fügt man einen value/Wert hinzu.
             */
            attributeMap.put(attribute.getName(), attribute.getDice().roll());
        }
    }


    public static void main(String[] args) {

        Character tim = new Character();
        NameGenerator nameMaker = new NameGenerator();
//        nameMaker.getNames().add("Legolas");
        tim.name = nameMaker.createName();
        tim.print();
    }


    public void print() {
        System.out.println("Name: " + name);
        for(String attribute: CharacterGenerator.attributeNames){
            /*
             * Mit attributeMap.get(key) holt man den Wert heraus:
             */
            System.out.println(attribute + ": "+ attributeMap.get(attribute));
        }
    }
    
}
