package joni;

public class Dog {

    static String bellen = "wuff";

    String name;
    String laut;

    public Dog(String name, Boolean laut) {
        this.name = name;
        if(laut){
           this.laut = bellen.toUpperCase();
        }
        else{
            this.laut= bellen;
        }


    }

    public void talk() {
        System.out.println(laut);
    }


}
