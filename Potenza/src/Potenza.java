public class Potenza {
    private int base;

    public Potenza(int x) {
        base = x;
    }

    public void pow() {
        int potenza = base * base;
        System.out.println("Potenza: " + potenza);
    }

    public void cambioBase(int nuovaBase) {
        base = nuovaBase;
    }

    public static void main(String[] args) {
        Potenza potenza = new Potenza(2);
        potenza.pow();

        potenza.cambioBase(3);
        potenza.pow();

        potenza.cambioBase(4);
        potenza.pow();
    }
}