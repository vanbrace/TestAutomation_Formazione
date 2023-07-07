import java.util.Scanner;

public class TestQuadrato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Creazione Quadrato:");
            System.out.println("Inserire un dato:");
            System.out.println("1. Lato");
            System.out.println("2. Area");
            System.out.println("3. Perimetro");
            System.out.println("4. Diagonale");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();

            if(scelta == 0) {
                break;
            }

            Quadrato quadrato = new Quadrato();

            switch (scelta) {
                case 1:
                    System.out.print("Inserire valore lato: ");
                    double lato = scanner.nextDouble();
                    quadrato.setLato(lato);
                    break;
                case 2:
                    System.out.print("Inserire valore area: ");
                    double area = scanner.nextDouble();
                    quadrato.setArea(area);
                    break;
                case 3:
                    System.out.print("Inserire valore perimetro: ");
                    double perimetro = scanner.nextDouble();
                    quadrato.setPerimetro(perimetro);
                    break;
                case 4:
                    System.out.print("Inserire valore diagonale: ");
                    double diagonale = scanner.nextDouble();
                    quadrato.setDiagonale(diagonale);
                    break;
                default:
                    System.out.println("Non valido. Riprova!");
                    continue;
            }

            System.out.println("Quadrato creato:");
            System.out.println(quadrato.toString());
            System.out.println();
        }

        scanner.close();
    }
}