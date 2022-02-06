package pl.edu.agh.hangman;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class LosujSlowo {

    public static void main (String[] args) {

        File plik = new File ("C:\\Users\\Zioło\\Desktop\\java-hangman\\src\\main\\java\\pl\\edu\\agh\\hangman\\slowa.txt");


        Scanner textScanner = null;
        try {
            textScanner = new Scanner (plik);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace ();
        }
        Scanner input = new Scanner (System.in);

        ArrayList<String> words = new ArrayList<> ();
        while (textScanner.hasNextLine ()) {
            words.add (textScanner.nextLine ());

        }
        String hidden_text = words.get ((int) (Math.random () * words.size ()));
        char[] textArray = hidden_text.toCharArray ();

        System.out.println (textArray);

        }
    }
}
