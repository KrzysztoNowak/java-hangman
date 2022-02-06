import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LosujSlowo {


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\Zioło\\Desktop\\java-hangman\\src\\main\\java\\pl\\edu\\agh\\hangman\\slowa.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println (line);

        }

    }
}
