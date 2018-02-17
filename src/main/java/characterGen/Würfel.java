package characterGen;

public class Würfel {
    
    private int count;
    private int sides;
    private int bonus;

    public Würfel(int count, int sides, int bonus) {
        this.count = count;
        this.sides = sides;
        this.bonus = bonus;
    }
    
    public Würfel(int count, int sides){
        this.count = count;
        this.sides = sides;
        this.bonus = 0;
    }
    
    public int roll(){
        return (count * (int) (Math.random() * sides + 1)) + bonus;
    }

    public static void main(String[] args) {
        Würfel sixSixSix = new Würfel(3,6,0);
        
        /*
         * Schleife über Zahl x, die wiederholt wird, solange x kleiner als 20 ist, wobei x bei jedem Durchgang um einen
         * Zähler erhöht wird. (x++ ist Kurzform für x = x+1)
         */
        for(int x = 0; x < 20; x++){
            System.out.println(sixSixSix.roll());
        }
        
    }
}
