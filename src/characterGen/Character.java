package characterGen;

public class Character {
    String name;

    public static void main(String[] args) {

        Character tim = new Character();
        tim.name = NameGenerator.createName();
        tim.print();
    }


    public void print() {
        System.out.println("Name: " + name);
    }
}
