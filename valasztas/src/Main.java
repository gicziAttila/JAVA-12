import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Eredmeny> jeloltek = new ArrayList<>();
        try {
            RandomAccessFile raf = new RandomAccessFile("szavazatok.txt", "r");
            String sor = raf.readLine();
            while ( sor != null) {
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
        System.out.println("A helyhatósági választáson " + jeloltek.size() + " képviselőjelölt indult.");
        //Kérje be majd adja ki
        Scanner scr = new Scanner(System.in);
        System.out.println("Adja meg a képviselő vezetéknevét: ");
        String vezeteknev = scr.nextLine();
        System.out.println("Adja meg a képviselő keresztnevét: ");
        String keresztnev = scr.nextLine();
    }
}