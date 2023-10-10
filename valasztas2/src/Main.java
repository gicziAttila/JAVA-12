import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Eredmeny> jeloltek = new ArrayList<>();
        int hanySor = 0;
        try {
            RandomAccessFile raf = new RandomAccessFile("szavazatok.txt", "r");
            String sor = raf.readLine();
            hanySor = Integer.parseInt(sor);
            sor = raf.readLine();
            while (sor != null) {
                Eredmeny egyJelolt = new Eredmeny (sor.split(" "));
                jeloltek.add(egyJelolt);
                sor = raf.readLine();
            }
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
        //Hány képviselő indult
        System.out.println("A helyhatósági választáson " + hanySor + " képviselőjelölt indult.");
    }
}