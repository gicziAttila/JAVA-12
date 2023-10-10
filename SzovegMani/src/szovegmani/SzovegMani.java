/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package szovegmani;

import java.util.Scanner;

/**
 *
 * @author gicziattila
 */
public class SzovegMani {

    public static int karakterSzamolas(String sentence){
        int karakterek = 0;
        for (int i = 0; i<sentence.length(); i++){
            karakterek++;
        }
        return karakterek;
    }
    public static String szovegForditasa(String sentence){
        StringBuilder forditott = new StringBuilder(sentence);
        StringBuilder forditottString = forditott.reverse();
        return forditottString.toString();
    }
    public static boolean isPalindroma(String sentence){
        StringBuilder forditott = new StringBuilder(sentence);
        StringBuilder forditottString = forditott.reverse();
        return sentence.equals(forditottString.toString());
    }
    public static boolean szovegOsszehasonlitas(String sentence, String sentence2){
        return sentence.equals(sentence2);
    }
    public static String szovegCsere(String sentence, char karakter1, char karakter2){
        String switchedSentence = null;
        for(int i=0; i<sentence.length(); i++){
             switchedSentence =  sentence.replace(karakter1, karakter2);
            }
        return switchedSentence;
        }
    public static int szoSzamolas(String sentence){
        int szavakSzama = 1;
        for (int i = 0; i<sentence.length();i++){
            if(sentence.charAt(i) == ' '){
                szavakSzama++;
            }
        }
        return szavakSzama;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy szöveget: ");
        String szoveg = scanner.nextLine();

        // 1. metódus: Számolja meg, hány karakterből áll a szöveg.
        int karakterSzam = karakterSzamolas(szoveg);
        System.out.println("A szöveg " + karakterSzam + " karakterből áll.");

        // 2. metódus: Fordítsa meg a szöveget.
        String fordítottSzoveg = szovegForditasa(szoveg);
        System.out.println("A szöveg fordítva: " + fordítottSzoveg);

        // 3. metódus: Ellenőrizze, hogy a szöveg palindróma-e.
        boolean palindroma = isPalindroma(szoveg);
        if (palindroma) {
            System.out.println("A szöveg palindróma.");
        } else {
            System.out.println("A szöveg nem palindróma.");
        }

        // 4. metódus: Szöveg összehasonlítás
        String masikSzoveg = "Ez egy masik szoveg";
        boolean azonos = szovegOsszehasonlitas(szoveg, masikSzoveg);
        if (azonos) {
            System.out.println("A két szöveg azonos.");
        } else {
            System.out.println("A két szöveg nem azonos.");
        }

        // 5. metódus: Szöveg cseréje
        char csereKarakter = 'e';
        char ujKarakter = 'X';
        String csereltSzoveg = szovegCsere(szoveg, csereKarakter, ujKarakter);
        System.out.println("A szöveg cserélve: " + csereltSzoveg);

        // 6. metódus: Szószámoló
        int szoSzam = szoSzamolas(szoveg);
        System.out.println("A szövegben " + szoSzam + " szó található.");
    }

  
}
