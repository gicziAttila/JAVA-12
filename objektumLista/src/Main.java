import javax.xml.stream.util.EventReaderDelegate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Eredmeny geza = new Eredmeny("Géza", "LOL", "2", 972);
        Eredmeny gizi = new Eredmeny("Gizi", "WOW", "3", 987);
        Eredmeny gaspar = new Eredmeny("Gáspár", "FCK", "4", 1024);

        ArrayList<Eredmeny> eredmenyek = new ArrayList<>();
        eredmenyek.add(geza);
        eredmenyek.add(gizi);
        eredmenyek.add(gaspar);

        //Hány jelölt van
        System.out.println("Jelöltek száma: " + eredmenyek.size());
        //Hányan szavaztak
        int szavazatMax = 0;
        for (int i = 0; i < eredmenyek.size(); i++) {
            ;
            szavazatMax += eredmenyek.get(i).getSzavazatSzam();
        }
        System.out.println("Összes szavazat száma: " + szavazatMax);
        //Hány jelöltre érkezett 1000-nél több
        int ezerTobbSzavazat = 0;
        for (int i = 0; i < eredmenyek.size(); i++) {
            if (eredmenyek.get(i).getSzavazatSzam() > 1000) {
                ezerTobbSzavazat++;
            }
        }
        System.out.println("Hány jelöltnek érkezett 1000-nél több szavazat: " + ezerTobbSzavazat);
        //Ki a WOW párt jelöltje
        String wowPart = "";
        for (int i = 0; i < eredmenyek.size(); i++) {
            if (eredmenyek.get(i).getPart() == "WOW") {
                wowPart = eredmenyek.get(i).getNev();
            }
        }
        System.out.println("A WOW párt jelöltje: " + wowPart);

        //Kik kaptak átlag alatti szavazatot
        System.out.println("Átlag alattinak számított pártok jelöltjei: ");
        int atlag = 0;
        for (int i = 0; i < eredmenyek.size(); i++) {
            atlag = szavazatMax / eredmenyek.size();
            if(eredmenyek.get(i).getSzavazatSzam() < atlag){
                System.out.println(eredmenyek.get(i).getNev());
            }
        }
        System.out.println("\n");
        //Kiknek a neve végződik "a"-val
        System.out.println("Kiknek a nevük végződik a betűvel: ");
        for (int i = 0; i < eredmenyek.size(); i++) {
            if(eredmenyek.get(i).getNev().endsWith("a")){
                System.out.println(eredmenyek.get(i).getNev());
            }
        }
    }
}