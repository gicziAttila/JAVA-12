public class Main {
    // Globális változó az osztályon belül:
    static int globalisValtozo = 10;
    public static void main(String[] args) {
        // lokális változó a  main metódusban
        int mainValtozo = 5;

        System.out.println("A mainValtozo értéke a main metódusban: " + mainValtozo);
        metodus1();
        System.out.println(globalisValtozo);
    }
    //Main vége


    public static void metodus1(){
        // lokális változó metodus1-ben
        int metodusValtozo = 20;
        System.out.println("A metodusValtozo értéke a metodus1-ben: " + metodusValtozo);
        System.out.println("A globalisValtozo értéke a metodus1-ben: " + globalisValtozo);
        metodus2();
    }
    public static void metodus2(){
        int metodus2Valtozo = 12;
        System.out.println(metodus2Valtozo);
    }
}