/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.pkg18matrix;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gicziattila
 */
public class Main {

    public static void fillMatrix(int[][] szamok, int number1, int number2, Arraylist<Integer> numbers) {
        int i;
        int j;
        for (i=0;i<number1;i++) {
            for (j=0;j<number2;j++) {
              szamok[i][j]= numbers;
            }
        }
    }
    public static void writeMatrix(int[][] szamok) {
        for(int i=0;i<szamok.length;i++) {
            for(int j=0;j<szamok[0].length;j++) {
                System.out.print(szamok[i][j]+"\t");
            }
            System.out.print("\n");
        }
     }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Adja meg a mátrix sorát: ");
       String szam1 = sc.nextLine();
       System.out.println("Adja meg a mátrix oszlopát: ");
       String szam2 = sc.nextLine();
        System.out.println("--------------------------");
       int[][] numbers = new int[Integer.parseInt(szam1)][Integer.parseInt(szam2)];
       ArrayList<Integer> szamok = new ArrayList<>();
       System.out.println("Adja meg a mátrix számát: ");
       for (int i = 0; i<Integer.parseInt(szam1)*Integer.parseInt(szam2); i++) {
           szamok.add(Integer.parseInt(sc.nextLine()));
       }
       fillMatrix(numbers, Integer.parseInt(szam1), Integer.parseInt(szam2), szamok);
       writeMatrix(numbers);
    }
    
}
