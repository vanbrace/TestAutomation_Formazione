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

}