package characterGen.races;

import characterGen.Alignment;
import characterGen.Psionics;
import characterGen.Race;
import characterGen.Würfel;
import characterGen.attributes.Attribute;
import characterGen.attributes.AttributeName;
import characterGen.attributes.SpecialAttributeName;

import java.util.List;

public class Dwarf extends Race {

    public Dwarf(String name, List<Attribute> attributes, List<Attribute> extraAttributes) {
        super(name, attributes, extraAttributes);
    }

    public Dwarf() {
        name = "Zwerg";
        attributes.add(new Attribute(AttributeName.INTELLIGENCE, new Würfel(3, 6, 0)));
        attributes.add(new Attribute(AttributeName.MENTAL_STRENGTH, new Würfel(2, 6, 0)));
        attributes.add(new Attribute(AttributeName.CHARISMA, new Würfel(2, 6, 0)));
        attributes.add(new Attribute(AttributeName.STRENGTH, new Würfel(4, 6, 6)));
        attributes.add(new Attribute(AttributeName.DEXTERITY, new Würfel(3, 6, 0)));
        attributes.add(new Attribute(AttributeName.CONSTITUTION, new Würfel(4, 6, 0)));
        attributes.add(new Attribute(AttributeName.BEAUTY, new Würfel(2, 6, 2)));
        attributes.add(new Attribute(AttributeName.SPEED, new Würfel(3, 6, 0)));
        attributes.add(new Attribute(AttributeName.PERCEPTION, new Würfel(2, 6)));

        extraAttributes.add(new Attribute(SpecialAttributeName.DIG, new Würfel(1, 6, 0)));

        alignmentDistribution.put(Alignment.PRINCIPLED,30);
        alignmentDistribution.put(Alignment.SCRUPULOUS,20);
        alignmentDistribution.put(Alignment.UNPRINCIPLED,10);
        alignmentDistribution.put(Alignment.ANARCHIST,5);
        alignmentDistribution.put(Alignment.MISCREANT,5);
        alignmentDistribution.put(Alignment.ABERRANT,20);
        alignmentDistribution.put(Alignment.DIABOLIC,10);

        psionicDistribution.put(Psionics.NONE,75);
        psionicDistribution.put(Psionics.MINOR,15);
        psionicDistribution.put(Psionics.MAYOR,10);
    }


}
