package Ex1;

public class Rectangle implements IFrom_Geometrique{
    private Double log;
    private Double lar;

    public Rectangle(Double log, Double lar) {
        this.log = log;
        this.lar = lar;
    }

    @Override
    public double perimitre() {
        return 2*(log+lar);
    }

    @Override
    public double surface() {
        return log*lar;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "log=" + log +
                ", lar=" + lar +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rec =new Rectangle(5.0,2.0);
        System.out.println(rec);
        System.out.println("perimitre :"+rec.perimitre());
        System.out.println("surface :"+rec.surface());
    }
}
