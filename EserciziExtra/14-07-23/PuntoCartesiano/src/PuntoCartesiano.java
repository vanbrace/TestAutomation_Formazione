import java.util.Scanner;

public class PuntoCartesiano {
    private double x;
    private double y;

    public PuntoCartesiano(){
    }

    public PuntoCartesiano(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String quadrante(){
        if(x == 0 && y == 0){
            return "Il punto si trova nell'origine";
        }
        else if(x == 0 && y != 0){
            return "Il punto si trova sull'asse delle x";
        }
        else if(x != 0 && y == 0){
            return "Il punto si trova sull'asse delle y";
        }
        else if(x>0 && y>0){
            return "Il punto si trova nel primo quadrante";
        }
        else if(x<0 && y>0){
            return "Il punto si trova nel secondo quadrante";
        }
        else if(x<0 && y<0){
            return "Il punto si trova nel terzo quadrante";
        }
        else
            return "Il punto si trova nel quarto quadrante";
    }

    public double distanza(PuntoCartesiano punto){
        double x1 = this.x; //Dove lo prendo?
        double y1 = this.y; //Dove lo prendo?
        double x2 = punto.getX();
        double y2 = punto.getY();
        double diff1 = x2-x1;
        double diff2 = y2-y1;
        double sum = (Math.pow(diff1,2)) + (Math.pow(diff2,2));
        double distanza = Math.sqrt(sum);
        return distanza;
    }

    public String rettaPassantePerDuePunti(PuntoCartesiano punto){
        double x1 = this.x;
        double y1 = this.y;
        double x2 = punto.getX();
        double y2 = punto.getY();
        double diff1 = x2-x1;
        double diff2 = y2-y1;
        double rapp = diff2/diff1;
        String retta = "La retta è: y = " + y1 + "+" + rapp + "*" + "x - " + x1;
        return retta;
    }

    @Override
    public String toString() {
        return "PuntoCartesiano{" +
                "x=" + x +
                ", y=" + y +
                ", Quadrante: " + quadrante() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void inserisciDati(Scanner dati){

        System.out.print("Inserisci i dati della x");
        Scanner input1 = new Scanner(System.in);
        x = Double.parseDouble(input1.nextLine());
        setX(x);

        System.out.print("Inserisci i dati della y");
        Scanner input2 = new Scanner(System.in);
        y = Double.parseDouble(input2.nextLine());
        setY(y);
    }
}
