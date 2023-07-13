public class Main {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile();
        auto1.inserisciDati();

        Automobile auto2 = new Automobile();
        auto2.inserisciDati();

        System.out.println("Auto 1: " + auto1 + "\n Auto 2: " + auto2);
        if(auto1.equals(auto2)) {
            System.out.println("Le due auto inserite coincidono");
        }
        else
        {System.out.println("Hai inserito due auto differenti");}
    }
}