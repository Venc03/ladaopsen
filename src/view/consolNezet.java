package view;

import java.util.Scanner;

public class consolNezet {
    private static final Scanner scr = new Scanner(System.in);
    
    public void megjelenites(String szoveg){
        System.out.println(szoveg);
    }
    
    public int bekeres() {
        System.out.println("Melyikben van a kincs?");
        return scr.nextInt()-1;
    }
}
