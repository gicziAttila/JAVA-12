import java.util.Arrays;

public class Noveny {
    private String neve, szine;
    private int magassaga;
    private boolean eveloE;

    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }

    public String getSzine() {
        return szine;
    }

    public void setSzine(String szine) {
        this.szine = szine;
    }

    public int getMagassaga() {
        return magassaga;
    }

    public void setMagassaga(int magassaga) {
        this.magassaga = magassaga;
    }

    public boolean isEveloE() {
        return eveloE;
    }

    public void setEveloE(boolean eveloE) {
        this.eveloE = eveloE;
    }

    public Noveny(String[] novenyek) {
        this.neve = novenyek[0];
        this.szine = novenyek[1];
        this.magassaga = Integer.parseInt(novenyek[2]);
        this.eveloE = Boolean.parseBoolean(novenyek[3]);
    }
    public String toString() {
        return "Neve: " + neve + "\n" + "Színe: " + szine + "\n" + "Magassága: " + magassaga + "\n" +  "Évelő-e: " + eveloE + "\n";
    }
}
