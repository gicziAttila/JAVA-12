public class Circle extends geometricShape{
    private double sugar;

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    public Circle(double area, String name, double sugar){
        super(area, name);
        this.sugar = sugar;
    }

    @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("A kör sugara: " + this.sugar + " egység" + "\n");

    }
}
