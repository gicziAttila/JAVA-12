public class Eredmeny {
    private String nev1, nev2, part, korzet;
    private int szavazatSzam;

    public String getNev1() {
        return nev1;
    }

    public void setNev1(String nev1) {
        this.nev1 = nev1;
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

    public String getNev2() {
        return nev2;
    }

    public void setNev2(String nev2) {
        this.nev2 = nev2;
    }

    public Eredmeny(String[] adat){
        this.korzet = adat[0];
        this.szavazatSzam = Integer.parseInt(adat[1]);
        this.part = adat[2];
        this.nev2 = adat[3];
        this.nev1 = adat[4];
    }
}
