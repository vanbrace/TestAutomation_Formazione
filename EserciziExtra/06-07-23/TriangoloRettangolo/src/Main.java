public class Main {
    public static void main(String[] args) {
         String maggiore;

        TriangoloRettangolo tria1 = new TriangoloRettangolo();
        tria1.setCateto1(10);
        tria1.setCateto2(12.5);
        tria1.calcolaIpotenusa(tria1.getCateto1(), tria1.getCateto2());
        tria1.calcoloPerimetro(tria1.getCateto1(), tria1.getCateto2());
        tria1.calcoloArea(tria1.getCateto1(), tria1.getCateto2());
        System.out.println("I volori di ipotenusa, area e perimetro sono, rispettivamente: " + tria1);
        double area1 = tria1.calcoloArea(tria1.getCateto1(), tria1.getCateto2());

        TriangoloRettangolo tria2 = new TriangoloRettangolo(16,12);
        tria1.calcolaIpotenusa(tria2.getCateto1(), tria2.getCateto2());
        tria1.calcoloPerimetro(tria2.getCateto1(), tria2.getCateto2());
        tria1.calcoloArea(tria2.getCateto1(), tria2.getCateto2());
        System.out.println("I volori di ipotenusa, area e perimetro sono, rispettivamente: " + tria2);
        double area2 = tria1.calcoloArea(tria2.getCateto1(), tria2.getCateto2());


        if (area1 > area2) {
            maggiore = "Primo triangolo inserito";
        }
        else if (area1 < area2){
            maggiore = "Secondo triangolo inserito";
        }
        else
        {maggiore = "I triangolo inseriti hanno la stessa area";}


        System.out.println("Il triangolo maggiore è: " + maggiore);
    }
}