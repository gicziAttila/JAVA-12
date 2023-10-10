public class geometricShape {
    private double alakzatTerulet;
    private String alakzatNeve;

    public double getAlakzatTerulet() {
        return alakzatTerulet;
    }

    public void setAlakzatTerulet(double alakzatTerulet) {
        this.alakzatTerulet = alakzatTerulet;
    }

    public String getAlakzatNeve() {
        return alakzatNeve;
    }

    public void setAlakzatNeve(String alakzatNeve) {
        this.alakzatNeve = alakzatNeve;
    }
    public geometricShape(double area, String name){
        this.alakzatNeve = name;
        this.alakzatTerulet = area;
    }
    public void displayInfo(){
        System.out.println("Alakzat neve: " + getAlakzatNeve() + "\n" + "Alakzat Területe: " + getAlakzatTerulet() + " négyzetegység");
    }

}
