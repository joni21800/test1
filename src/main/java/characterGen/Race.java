package characterGen;

import characterGen.attributes.Attribute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {
    
    protected String name;
    protected List<Attribute> attributes = new ArrayList<>();
    protected List<Attribute> extraAttributes = new ArrayList<>();
    protected Map<Alignment,Integer> alignmentDistribution = new HashMap<>();
    protected Map<Psionics, Integer> psionicDistribution =new HashMap<>();

    public Race() {
    }

    public Race(String name, List<Attribute> attributes, List<Attribute> extraAttributes) {
        this.name = name;
        this.attributes = attributes;
        this.extraAttributes = extraAttributes;
    }

    public String getName() {
        return name;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<Attribute> getExtraAttributes() {
        return extraAttributes;
    }

    public String getAlignment(){
        int currentMax = 1;
        List<Distribution> distributional = new ArrayList<>();
        for(Map.Entry<Alignment,Integer> alignmentChance : alignmentDistribution.entrySet()){
            String name = alignmentChance.getKey().getName();
            int chance = alignmentChance.getValue();
            distributional.add(new Distribution(name,currentMax,currentMax+chance-1));
            currentMax += chance;
        }
        int diceRoll = new Würfel(1,currentMax-1).roll();
        for(Distribution distribution : distributional){
            if(diceRoll >= distribution.min && diceRoll <= distribution.max){
                return distribution.name;
            }
        }
        throw new IllegalStateException("Kein Alignment gefunden für %"+diceRoll);
    }
    
    class Distribution{
        String name;
        int min;
        int max;

        public Distribution(String name, int min, int max) {
            this.name = name;
            this.min = min;
            this.max = max;
        }
    }
    public String getPsionics() {
        int currentMax = 1;
        List<Distribution> distributionps=new ArrayList<>();
        for(Map.Entry<Psionics,Integer> psionicChance : psionicDistribution.entrySet()){
            String name = psionicChance.getKey().getName();
            int chance = psionicChance.getValue();
            distributionps.add(new Distribution(name,currentMax,currentMax+chance-1));
            currentMax += chance;
        }
        int diceRoll = new Würfel(1,currentMax-1).roll();
        for(Distribution distribution : distributionps){
            if(diceRoll >= distribution.min && diceRoll <= distribution.max){
                return distribution.name;
            }
        }
        throw new IllegalStateException(" Psionic Fehler im Algorythmus %"+diceRoll);

    }
}
