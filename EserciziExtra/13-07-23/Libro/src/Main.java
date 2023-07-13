public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();

        libro1.setTitolo( "Pinocchio");
        libro1.setAutore( "Collodi");
        libro1.setNumPagine(288);
        libro1.setPrezzo(9.02);

        Libro libro2 = new Libro(libro1);

        Libro libro3 = new Libro("Divina Commedia","Dante", 576,6.65 );

        System.out.println("Libro 1: " + libro1 + "\n Libro 2: "+ libro2 + "\n Libro 3: " + libro3);

        Libro divinaCommedia = libro3;

        libro1.setPrezzo(7.43);

        libro2.setTitolo("Pinocchio versione illustrata");

        System.out.println("Libro 1: " + libro1 + "\n Libro 2: "+ libro2 + "\n Libro 3: " + libro3 + "\n Libro 4: " + divinaCommedia);

        libro3.setAutore("Dante Alighieri");


        System.out.println("Libro 1: " + libro1 + "\n Libro 2: "+ libro2 + "\n Libro 3: " + libro3 + "\n Libro 4: " + divinaCommedia);

    }
}