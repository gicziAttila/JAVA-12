import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        String[] novenyek = {"Orchidea", "Fekete", "15", "true"};
        Noveny elsoVirag = new Noveny(novenyek);
        System.out.println(elsoVirag);


        RandomAccessFile raf;
        String sor;
        try {
            raf = new RandomAccessFile("novenyek.txt", "r");
            sor = raf.readLine();
            Noveny masodikVirag = new Noveny(sor.split(", "));
            System.out.println(masodikVirag);
            raf.close();

        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
    }
}