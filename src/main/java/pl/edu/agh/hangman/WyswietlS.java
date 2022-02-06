package pl.edu.agh.hangman;

import java.util.ArrayList;

public class WyswietlS {
    ArrayList <String > litery = new ArrayList<>();
    //String [] litera = new String[4];
    String slowo = "java";
    //char literyWSlowie[]=slowo.toCharArray();

    public void WyswietlSlowo(){

        int dlugoscSlowa = slowo.length();

        String starsLine = "";
        for (int i = 0; i < dlugoscSlowa; i++) {
            starsLine += "-";
        }


        System.out.println(starsLine);
    }

}
