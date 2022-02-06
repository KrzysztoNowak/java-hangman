package pl.edu.agh.hangman;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int liczbaSpalonych;
    public static ArrayList<String> litery = new ArrayList<String>();

    public static void main(String[] args) {

        System.out.println("Witaj w grze Hangman");
        System.out.println("Odgadnij litere");

      for (;;) {

        String litera;
        litera = rozpocznijGre();
                if (litera.equals("1")) break;
        litery.add(litera);
        String slowo = "Java";
        boolean flag;

        flag = sprawdzCzyLiteraJestWSlowie(slowo, litera);
        if (flag == false) liczbaSpalonych++;
        System.out.println(flag);
    }

    }


    public static String rozpocznijGre () {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("You entered " + s);
        return s;
    }

    public static boolean sprawdzCzyLiteraJestWSlowie (String slowo, String litera ){
        for (int i =0; i<slowo.length() ; i++){

            if (litera.charAt(0) == slowo.charAt(i))
                return true;
        }

        return false;
    }

}
