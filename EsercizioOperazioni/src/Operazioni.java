//Classe operazioni dotata di un costruttore vuoto e uno che prende due numeri a e b in input ( a e b sono due attributi)
// e quattro metodi che simulano le 4 operazioni
//di ognuno dei 4 metodi ne fai uno che ritorna un intero e uno void che fa l'operazione e printa in output il risultato
//ciascuno dei metodi prende in ingresso due valori
//i metodi sono somma, sottrazione, prodotto, divisione
//in ciascuno dei metodi fai il check se a e b sono > 10 se non lo sono devi togliere 1 al risultato

public class Operazioni {
    private int a;
    private int b;

    public Operazioni() {
        this.a = 0;
        this.b = 0;
    }

    public Operazioni(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addizione1(int a, int b) {
        int somma;
        if (a > 10 && b > 10) {
            somma = a + b;
        } else
            somma = a + b - 1;

        return somma;
    }

    public void addizione2(int a, int b) {
        int somma;
        if (a > 10 && b > 10) {
            somma = a + b;
        } else
            somma = a + b - 1;
        System.out.println(somma);
    }

    public int sottrazione1(int a, int b) {
        int sottrazione;
        if (a > 10 && b > 10) {
            sottrazione = a - b;
        } else
            sottrazione = a - b - 1;
        return (sottrazione);
    }

    public void sottrazione2(int a, int b) {
        int sottrazione;
        if (a > 10 && b > 10) {
            sottrazione = a - b;
        } else
            sottrazione = a - b - 1;
        System.out.println(sottrazione);
    }

    public int prodotto1(int a, int b) {
        int prodotto;
        if (a > 10 && b > 10) {
            prodotto = a * b;
        } else
            prodotto = a * b - 1;
        return prodotto;
    }

    public void prodotto2(int a, int b) {
        int prodotto;
        if (a > 10 && b > 10) {
            prodotto = a * b;
        } else
            prodotto = a * b - 1;
        System.out.println(prodotto);
    }

    public double divisione1(int a, int b) {
        double divisione=0;
        if(checkDenominatore(b)){

        if (a > 10 && b > 10) {
            divisione = ((double) (a / b));
        } else {
            divisione = (double) (a / b - 1);
        }
        }
        return divisione;
    }

    public void divisione2(int a, int b) {
        double divisione=0;
        if(checkDenominatore(b)) {

            if (checkValore(a, b)) {
                divisione = ((double) (a / b));
            } else {
                divisione = (double) (a / b - 1);
            }
        }
        System.out.println(divisione);
    }

    public boolean checkValore(int a, int b) {
        if (a > 10 && b > 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkDenominatore(int denominatore) {
        if (denominatore == 0) {
            System.out.println("Denominatore nullo, cambia valore");
            return false;
        } else
            return true;
    }

}