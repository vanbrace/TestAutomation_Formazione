// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class OpAritmetiche {
    public static void main(String[] args) {
        // Divisione
        int a = 3;
        int b = 2;
        double r1 = (double) a / b;
        System.out.printf("Risultato della divisione: %.2f\n", r1);

        // Moltiplicazione
        char c = 'a';
        short s = 7000;
        int r2 = c * s;
        System.out.printf("Risultato della moltiplicazione: %d\n", r2);

        // Somma
        int i = 5;
        float E = 5.22F;
        float r3 = i + E;
        System.out.printf("Risultato della somma: %.2f\n", r3);

        // Sottrazione: r1, r2 e r3
        double r4 = r1 - (double) r2 - r3;
        System.out.printf("Risultato della sottrazione: %.2f\n", r4);
    }
}