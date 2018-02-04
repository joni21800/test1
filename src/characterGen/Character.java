package characterGen;

public class Character {
    
    String name;

    public static void main(String[] args) {

        Character tim = new Character();
        NameGenerator nameMaker = new NameGenerator();
//        nameMaker.getNames().add("Legolas");
        tim.name = nameMaker.createName();
        tim.print();
    }


    public void print() {
        System.out.println("Name: " + name);
    }
}
