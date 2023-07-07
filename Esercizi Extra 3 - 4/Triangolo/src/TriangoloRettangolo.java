public class TriangoloRettangolo {
    private double cateto1;
    private double cateto2;

    public TriangoloRettangolo() {
        // Costruttore vuoto
    }

    public TriangoloRettangolo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    public double calcolaIpotenusa() {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    public double calcoloArea() {
        return (cateto1 * cateto2) / 2;
    }

    public double calcolaPerimetro() {
        double ipotenusa = calcolaIpotenusa();
        return cateto1 + cateto2 + ipotenusa;
    }

    @Override
    public String toString() {
        return "Triangolo:\n" +
                "Cateto 1 = " + cateto1 + "\n" +
                "Cateto 2 = " + cateto2 + "\n" +
                "Ipotenusa = " + calcolaIpotenusa() + "\n" +
                "Area = " + calcoloArea() + "\n" +
                "Perimetro = " + calcolaPerimetro();
    }
}