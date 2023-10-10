/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filmes;

import java.util.ArrayList;
import java.util.Scanner;
class Film {
    private String cim;
    private String rendezo;
    private int kiadas;
    private int ertekeles;
    
    public Film(String cim, String rendezo, int kiadas, int ertekeles) {
        this.cim = cim;
        this.rendezo = rendezo;
        this.kiadas = kiadas;
        this.ertekeles = ertekeles;
    }

    public String getCim() {
        return cim;
    }

    public String getRendezo() {
        return rendezo;
    }

    public int getKiadas() {
        return kiadas;
    }

    public int getErtekeles() {
        return ertekeles;
    }

}

public class Filmes {
    public static void main(String[] args) {
        String newline = System.getProperty("line.separator");
        boolean Continue = true;
        ArrayList<Film> filmek = new ArrayList<Film>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Kérem, adja meg a film címét: ");
            String name = sc.nextLine();
            System.out.print("Kérem, adja meg a rendező nevét: ");
            String person = sc.nextLine();
            System.out.print("Kérem, adja meg a film kiadási évét: ");
            String year = sc.nextLine();
            System.out.print("Kérem, adja meg ön milyenre értékeli a filmet (1-10): ");
            String points = sc.nextLine();
            filmek.add(new Film(name, person, Integer.parseInt(year), Integer.parseInt(points)));
            System.out.print("Szeretne még filmet megadni(igen/nem): ");
            String answer = sc.nextLine();
            if (!answer.equals("igen")){
                Continue = false;
            }
        } while (Continue == true);
    for(int i=0;i<filmek.size();i++){
        System.out.println(newline+"Film címe: "+filmek.get(i).getCim()+newline+"Film rendezője: "+filmek.get(i).getRendezo()+newline+"Film kiadási éve: "+filmek.get(i).getKiadas()+newline+"Film értékelése: "+filmek.get(i).getErtekeles()+newline);
    }

        }
    }
