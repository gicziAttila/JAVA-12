public class Halak extends Allatok{
    String milyenHal;

    public String getMilyenHal() {
        return milyenHal;
    }

    public void setMilyenHal(String milyenHal) {
        this.milyenHal = milyenHal;
    }

    public Halak(int year, String name, String location, String type){
        this.eletttartam = year;
        this.neve = name;
        this.milyenHal = type;
        this.szarmazasiHely = location;
    }
    public String toString(){
        return  "Neve: " + this.neve + "\n" + "Fajtája: " + this.milyenHal + "\n" + "Származási helye: " + this.szarmazasiHely + "\n" + "Élettartama: " + this.eletttartam + "\n";
    }
}
