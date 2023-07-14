public class Main {
    public static void main(String[] args) {
        // Creazione dell'oggetto libro1 con valori iniziali
        Libro libro1 = new Libro("Pinocchio", "Collodi", 288, 9.02);

        // Creazione dell'oggetto libro2 come copia di libro1
        Libro libro2 = new Libro(libro1);

        // Creazione dell'oggetto libro3 con valori iniziali
        Libro libro3 = new Libro("Divina Commedia", "Dante", 576, 6.65);

        // Alias per libro3
        Libro divinaCommedia = libro3;

        // Modifica oggetti
        libro1.setPrezzo(7.43);
        libro2.setTitolo("Pinocchio versione illustrata");
        libro3.setAutore("Dante Alighieri");
        divinaCommedia.setNumPagine(621);

        // Stampa
        System.out.println("libro1: " + libro1);
        System.out.println("libro2: " + libro2);
        System.out.println("libro3: " + libro3);
        System.out.println("divinaCommedia: " + divinaCommedia);
    }
}

