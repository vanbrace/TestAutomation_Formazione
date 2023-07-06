 public class TriangoloRettangolo {
     private double cateto1;
     private double cateto2;
     private double area1;
     private double area2;

     public TriangoloRettangolo() {
     }

     public TriangoloRettangolo(double cateto1, double cateto2) {
         this.cateto1 = cateto1;
         this.cateto2 = cateto2;
     }

     public void setCateto1(double cateto1) {
         this.cateto1 = cateto1;
     }

     public double getCateto1() {
         return cateto1;
     }

     public void setCateto2(double cateto2) {
         this.cateto2 = cateto2;
     }

     public double getCateto2() {
         return cateto2;
     }

     public double calcolaIpotenusa(double cateto1, double cateto2) {
         double ipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
         return ipotenusa;
     }

     public double calcoloArea(double cateto1, double cateto2) {
         double area = (cateto1 * cateto2) / 2;
         return area;
     }

     public double calcoloPerimetro(double cateto1, double cateto2) {
         double perimetro = cateto1 + cateto2 + calcolaIpotenusa(cateto1, cateto2);
         return perimetro;
     }

     public String toString() {
         return "L'ipotenusa e l'area valgono, rispettivamente: " + calcolaIpotenusa(cateto1, cateto2) + " " +
                 calcoloArea(cateto1, cateto2) + " " + calcoloPerimetro(cateto1, cateto2);
     }

     public void setArea1(double area1) {
         this.area1 = area1;
     }

     public double getArea1(){
         return area1;
     }

     public void setArea2(double area2) {
         this.area2 = area2;
     }

     public double getArea2() {
         return area2;
     }

 }