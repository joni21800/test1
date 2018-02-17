package joni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog hund1 = new Dog("wau", false);
        hund1.talk();
        System.out.println("Dieser Hund heißt " + hund1.name + "!");
        Dog hund2 = new Dog("ben", true);
        hund2.talk();
        Dog.bellen = "miau";
        hund1.talk();
        Dog fakeDog = new Dog("Garfield", false);
        fakeDog.talk();
        /*
          System.out.println(hund2.name);
         */
//        Integer i = null;
//        Dog d = null;
//        if(d==null){
//
//        }

        for(int i=0; i<5; i++){
            hund1.talk();
        }

        System.out.println("Wie heisst der Hund?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine()  ;
        if(name.trim().equals("")){
            System.out.println("Hund braucht Namen!!!");
        }
        else {
            Dog hund3 = new Dog(name, false);
            hund3.talk();
        }

    }
}
