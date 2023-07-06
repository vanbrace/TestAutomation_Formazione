public class Quadrato {
    private double lato;
    private double area;
    private double perimetro;
    private double diagonale;

    public Quadrato(){
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setDiagonale(double diagonale) {
        this.diagonale = diagonale;
    }

    public double getDiagonale() {
        return diagonale;
    }

    public void calcolaPartendoDaLato(double lato){
        setLato(lato);
        setArea(calcoloArea(lato));
        setPerimetro(calcoloPerimetro(lato));
        setDiagonale(calcoloDiagonale(lato));
    }

    public void calcolaPartendoDaArea(double area){
        lato = Math.sqrt(area);
        setLato(lato);
        setPerimetro(calcoloPerimetro(lato));
        setDiagonale(calcoloDiagonale(lato));
    }

    public void calcolaPartendoDaPerimetro(double perimetro){
        lato = perimetro/4;
        setLato(lato);
        setArea(calcoloArea(lato));
        setDiagonale(calcoloDiagonale(lato));
    }

    public void calcolaPartendoDaDiagonale(double diagonale){
        lato = diagonale / Math.sqrt(2);
        setLato(lato);
        setPerimetro(calcoloPerimetro(lato));
        setArea(calcoloArea(lato));
    }

    public String toString(){
        return getLato() + " " + getPerimetro() + " " + getArea() + " " + getDiagonale();
    }


    public double calcoloArea(double lato){
        return (lato*lato);
    }

    public double calcoloPerimetro(double lato){
        return (lato*4);
    }

    public double calcoloDiagonale(double lato){
        return (lato*Math.sqrt(2));
    }

    public void setValore(String dato, double valore) {
        switch (dato) {
            case "lato": {
                calcolaPartendoDaLato(valore);
                break;
            }

            case "perimetro": {
                perimetro = valore;
                calcolaPartendoDaPerimetro(valore);
                break;
            }

            case "area": {
                area = valore;
                calcolaPartendoDaArea(valore);
                break;
            }

            case "diagonale": {
                diagonale = valore;
                calcolaPartendoDaDiagonale(valore);
                break;
            }
        }
    }
}
