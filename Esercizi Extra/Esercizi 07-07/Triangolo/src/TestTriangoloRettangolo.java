import java.util.Scanner;

public class TestTriangoloRettangolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TriangoloRettangolo triangolo1 = new TriangoloRettangolo();
        System.out.println("Triangolo 1 (Costruttore vuoto):");
        System.out.println(triangolo1.toString());
        System.out.println();

        System.out.println("Inserisci la lunghezza del Cateto 1 per il Triangolo 2:");
        double cateto1 = scanner.nextDouble();
        System.out.println("Inserisci la lunghezza del Cateto 2 per il Triangolo 2:");
        double cateto2 = scanner.nextDouble();

        TriangoloRettangolo triangolo2 = new TriangoloRettangolo(cateto1, cateto2);
        System.out.println("Triangolo 2 (Costruttore con parametri inseriti):");
        System.out.println(triangolo2.toString());
        System.out.println();

        double area1 = triangolo1.calcoloArea();
        double area2 = triangolo2.calcoloArea();

        if (area1 > area2) {
            System.out.println("Il Triangolo 1 ha un'area maggiore.");
        } else if (area2 > area1) {
            System.out.println("Il Triangolo 2 ha un'area maggiore.");
        } else {
            System.out.println("Il Triangolo 1 e il Triangolo 2 hanno la stessa area.");
        }

        scanner.close();
    }
}