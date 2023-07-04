public class Operazioni {
    private int a;
    private int b;

    public Operazioni() {
        // Vuoto
    }

    public Operazioni(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int somma(int a, int b) {
        int risultato = a + b;
        if (a <= 10 && b <= 10) {
            risultato -= 1;
        }
        return risultato;
    }

    public void sommaVoid(int a, int b) {
        int risultato = somma(a, b);
        System.out.println("Somma: " + risultato);
    }

    public int sottrazione(int a, int b) {
        int risultato = a - b;
        if (a <= 10 && b <= 10) {
            risultato -= 1;
        }
        return risultato;
    }

    public void sottrazioneVoid(int a, int b) {
        int risultato = sottrazione(a, b);
        System.out.println("Sottrazione: " + risultato);
    }

    public int prodotto(int a, int b) {
        int risultato = a * b;
        if (a <= 10 && b <= 10) {
            risultato -= 1;
        }
        return risultato;
    }

    public void prodottoVoid(int a, int b) {
        int risultato = prodotto(a, b);
        System.out.println("Prodotto: " + risultato);
    }

    public int divisione(int a, int b) {
        int risultato = a / b;
        if (a <= 10 && b <= 10) {
            risultato -= 1;
        }
        return risultato;
    }

    public void divisioneVoid(int a, int b) {
        int risultato = divisione(a, b);
        System.out.println("Divisione: " + risultato);
    }

}