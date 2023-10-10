public class Eredmeny {
    private String nev, part, korzet;
    private int szavazatSzam;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getKorzet() {
        return korzet;
    }

    public void setKorzet(String korzet) {
        this.korzet = korzet;
    }

    public int getSzavazatSzam() {
        return szavazatSzam;
    }

    public void setSzavazatSzam(int szavazatSzam) {
        this.szavazatSzam = szavazatSzam;
    }

    public Eredmeny(String name, String party, String district, int partyNumber){
        this.nev = name;
        this.part = party;
        this.korzet = district;
        this.szavazatSzam = partyNumber;
    }
    public String toString(){
        return "Név: " + this.nev + "\n" + "Párt: " + this.part + "\n" + "Körzet: " + this.korzet + "\n" + "Szavazat szám: " + this.szavazatSzam + "\n";
    }
}
