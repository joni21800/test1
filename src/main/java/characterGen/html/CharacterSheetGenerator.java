package characterGen.html;

import characterGen.*;
import characterGen.PlayerCharacter;
import characterGen.attributes.SpecialAttributeName;
import characterGen.races.Dwarf;
import characterGen.races.Elf;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class CharacterSheetGenerator {

    VelocityContext context;

    public CharacterSheetGenerator() {
        /* first, we init the runtime engine.  Defaults are fine. */

        Properties p = new Properties();
        p.setProperty("resource.loader", "class");
        p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init( p );

        /* lets make a Context and put data into it */

        context = new VelocityContext();


        
    }

    public void print(PlayerCharacter npc){
        /* lets render a template */
        StringWriter w = new StringWriter();

        // Variablen bereitstellen:
        context.put("npc", npc);
        context.put("attributeNames",CharacterGenerator.attributeNames);
        List<String> specialNames = Arrays.stream(SpecialAttributeName.values()).map(SpecialAttributeName::getName).collect(Collectors.toList());
        context.put("specialAttributeNames", specialNames);
        

        // verbinde die Character-Sheet Datei mit unserem Context (in dem der Charater gespeichert ist)
        Velocity.mergeTemplate("velocity/character-sheet.vm","UTF-8", context, w );
        System.out.println( w );
        File npcFile = new File("npcs", npc.getName()+".html");
        try {
            // um in eine Datei zu schreiben, brauchen wir einen FileOutputStream.
            FileOutputStream fos = new FileOutputStream(npcFile);
            fos.write(w.toString().getBytes());
            fos.close();
        }
        catch (IOException e){
            System.out.println("Konnte die Datei für Character "+npc.getName()+" nicht schreiben.");
        }
    }
    
    public static void main(String[] args) {
        CharacterSheetGenerator characterSheetGenerator = new CharacterSheetGenerator();

        List<Race> races = new ArrayList<Race>();
        races.add(new Dwarf());
        races.add(new Elf());

        int auswahl = (int) (Math.random() * races.size());
        Race race = races.get(auswahl);
        PlayerCharacter playerCharacter = new PlayerCharacter("derdessennAMENICHDAIST", race);




        characterSheetGenerator.print(playerCharacter);


    }
    
}
