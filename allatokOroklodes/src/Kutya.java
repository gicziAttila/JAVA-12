public class Kutya extends Allatok{
    String szin;

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public Kutya(int year, String name, String location, String color){
        this.eletttartam = year;
        this.neve = name;
        this.szin = color;
        this.szarmazasiHely = location;
    }
    public String toString(){
        return  "Neve: " + this.neve + "\n" + "Színe: " + this.szin + "\n" + "Származási helye: " + this.szarmazasiHely + "\n" + "Élettartama: " + this.eletttartam + "\n";
    }
}
