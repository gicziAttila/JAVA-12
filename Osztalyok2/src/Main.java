import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kutya buksiKutya = new Kutya("Buksi", "Németjuhász", "Fekete", 15);
        Kutya bodriKutya = new Kutya("Bodri", "Tacskó", "Barna", 3);
        System.out.println(buksiKutya.toString());
        System.out.println(bodriKutya.toString());



        RandomAccessFile raf;
        String sor;
        try {
            raf = new RandomAccessFile("kutyak.txt", "r");
            sor = raf.readLine();
            String[] dogsSplit1;
            dogsSplit1 = sor.split(", ");
            Kutya cezarKutya = new Kutya(dogsSplit1[0], dogsSplit1[1], dogsSplit1[2], Integer.parseInt(dogsSplit1[3]));
            sor = raf.readLine();
            dogsSplit1 = sor.split(", ");
            Kutya fickoKutya = new Kutya(dogsSplit1[0], dogsSplit1[1], dogsSplit1[2], Integer.parseInt(dogsSplit1[3]));
            System.out.println(cezarKutya.toString());
            System.out.println(fickoKutya.toString());
            raf.close();
        }
        catch( IOException e) {
            System.err.println("HIBA");
        }
    }
}