import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       PuntoCartesiano punto1 = new PuntoCartesiano();
       punto1.setX(3);
       punto1.setY(5);

       PuntoCartesiano punto2 = new PuntoCartesiano(-2,5);

       PuntoCartesiano punto3 = new PuntoCartesiano();
       punto3.inserisciDati(scanner);

        System.out.println("Primo punto:" + punto1);
        System.out.println("Secondo punto:" + punto2);
        System.out.println("Terzo punto:" + punto3);

        System.out.println("La distanza tra punti 1 e 2 è :" + punto1.distanza(punto2));
        System.out.println("La distanza tra punti 2 e 3 è :" + punto2.distanza(punto3));
        System.out.println("La distanza tra punti 1 e 3 è :" + punto1.distanza(punto3));

        System.out.println("La retta passante tra punti 1 e 2 è :" + punto1.rettaPassantePerDuePunti(punto2));
        System.out.println("La retta passante tra punti 2 e 3 è :" + punto2.rettaPassantePerDuePunti(punto3));
        System.out.println("La retta passante tra punti 1 e 3 è :" + punto1.rettaPassantePerDuePunti(punto3));
    }
}