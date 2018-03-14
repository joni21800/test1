package characterGen;

import characterGen.attributes.Attribute;
import characterGen.attributes.AttributeName;
import characterGen.attributes.SpecialAttributeName;

import java.util.HashMap;
import java.util.Map;

public class PlayerCharacter {

    String name;
    Race race;
    String alignment;
    String psionics;
    int hitpoints;

    /*
     * Eine Map hat einen Schlüssel und einen Wert (key,value).
     */
    public Map<String, Integer> attributeMap = new HashMap<>();
    public Map<String, Integer> specialAttributes = new HashMap<>();

    public PlayerCharacter() {
    }

    public PlayerCharacter(String name, Race race) {
        this.name = name;
        this.race = race;
        for (Attribute attribute : race.getAttributes()) {
            /*
             * Mit attributeMap.put(key, value) fügt man einen value/Wert hinzu.
             */
            attributeMap.put(attribute.getName(), attribute.getDice().roll());
        }
        for (Attribute attribute : race.getExtraAttributes()) {
            specialAttributes.put(attribute.getName(), attribute.getDice().roll());
        }
        this.alignment = race.getAlignment();
        this.psionics = race.getPsionics();
        hitpoints = attributeMap.get(AttributeName.CONSTITUTION.getName()) + new Würfel(1, 6).roll();
    }


    public static void main(String[] args) {

        PlayerCharacter tim = new PlayerCharacter();
        NameGenerator nameMaker = new NameGenerator();
//        nameMaker.getNames().add("Legolas");
        tim.name = nameMaker.createName();
        tim.print();
    }


    public void print() {
        System.out.println("Name: " + name);
        for (AttributeName attribute : AttributeName.values()) {
            /*
             * Mit attributeMap.get(key) holt man den Wert heraus:
             */
            System.out.println(attribute.getName() + ": " + attributeMap.get(attribute.getName()));
        }
        for (SpecialAttributeName specialName : SpecialAttributeName.values()) {
            if (specialAttributes.containsKey(specialName.getName())) {
                System.out.println(specialName.getName() + ": " + specialAttributes.get(specialName.getName()));
            }
        }
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Map<String, Integer> getAttributeMap() {
        return attributeMap;
    }

    public Map<String, Integer> getSpecialAttributes() {
        return specialAttributes;
    }

    public String getAlignment() {
        return alignment;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
