public class Main {
    public static void main(String[] args) {
        Potenza potenza1 = new Potenza(2);
        System.out.println(potenza1.pow());
        potenza1.cambioBase(3);
        System.out.println(potenza1.pow());
        potenza1.cambioBase(4);
        System.out.println(potenza1.pow());
    }
}