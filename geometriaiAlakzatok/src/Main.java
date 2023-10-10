public class Main {
    public static void main(String[] args) {
        Circle kor1 = new Circle(78,"Kör", 5.0);
        kor1.displayInfo();
        kor1.setSugar(7.0);
        System.out.println("----------");
        kor1.displayInfo();
    }
}