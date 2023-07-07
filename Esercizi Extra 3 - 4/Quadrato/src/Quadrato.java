public class Quadrato {
    private double lato;
    private double area;
    private double perimetro;
    private double diagonale;

    public Quadrato() {
        // Costruttore vuoto
    }

    // Getter
    public double getLato() {
        return lato;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getDiagonale() {
        return diagonale;
    }

    // Setter
    public void setLato(double lato) {
        this.lato = lato;
        calcolaPartendoDaLato();
    }

    public void setArea(double area) {
        this.area = area;
        calcolaPartendoDaArea();
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
        calcolaPartendoDaPerimetro();
    }

    public void setDiagonale(double diagonale) {
        this.diagonale = diagonale;
        calcolaPartendoDaDiagonale();
    }

    // Metodi
    private void calcolaPartendoDaLato() {
        area = lato * lato;
        perimetro = 4 * lato;
        diagonale = Math.sqrt(2) * lato;
    }

    private void calcolaPartendoDaArea() {
        lato = Math.sqrt(area);
        perimetro = 4 * lato;
        diagonale = Math.sqrt(2) * lato;
    }

    private void calcolaPartendoDaPerimetro() {
        lato = perimetro / 4;
        area = lato * lato;
        diagonale = Math.sqrt(2) * lato;
    }

    private void calcolaPartendoDaDiagonale() {
        lato = diagonale / Math.sqrt(2);
        area = lato * lato;
        perimetro = 4 * lato;
    }

    @Override
    public String toString() {
        return "Quadrato: \n" +
                "Lato = " + lato + "\n" +
                "Area = " + area + "\n" +
                "Perimetro = " + perimetro + "\n" +
                "Diagonale = " + diagonale;
    }
}