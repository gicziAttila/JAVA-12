public class Kutya {
    private String nev,fajta, szin;
    private int ttomeg;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }
    public int getTtomeg() {
        return ttomeg;
    }

    public void setTtomeg(int ttomeg) {
        this.ttomeg = ttomeg;
    }
    public String getName(){
        return nev;
    }

    public Kutya(String name, String type, String color, int weight){
        this.nev = name;
        this.fajta = type;
        this.szin = color;
        this.ttomeg = weight;
    }

    public String toString(){
        return "Neve: " + this.nev + "\n" +
                "Fajtája: " + this.fajta + "\n" +
                "Színe: " + this.szin + "\n" +
                "Tömege: " + this.ttomeg + "\n";
    }

    public void ugat(){
        System.out.println("Vau Vau");
    }
}
