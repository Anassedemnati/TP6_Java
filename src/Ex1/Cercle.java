package Ex1;

public class Cercle implements IFrom_Geometrique{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimitre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public double surface() {
        return Math.PI*Math.pow(rayon,2);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }

    public static void main(String[] args) {
        Cercle c1 =new  Cercle(4);
        System.out.println(c1);
        System.out.println("perimitre :"+c1.perimitre());
        System.out.println("surface :"+c1.surface());
    }
}
