public class Main {
    public static void main(String[] args) {
        Potenza potenza = new Potenza(2);
        potenza.pow();

        potenza.cambioBase(3);
        potenza.pow();

        potenza.cambioBase(4);
        potenza.pow();
    }
}