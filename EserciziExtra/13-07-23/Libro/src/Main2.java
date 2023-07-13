import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Quanti libri vuoi inserire nella tua libreria?");
        Scanner input1 = new Scanner(System.in);
        int numero = Integer.parseInt(input1.nextLine());

        Libreria libreria1 = new Libreria();

        System.out.print("Inserire il nome della libreria");
        Scanner input2 = new Scanner(System.in);
        String nomeLib = input2.nextLine();

        System.out.print("Inserire l'indirizzo della libreria");
        Scanner input3 = new Scanner(System.in);
        String indirLib = input3.nextLine();

        libreria1.setNome(nomeLib);
        libreria1.setIndirizzo(indirLib);

        ArrayList<Double> vectPrezzi = new ArrayList<>();

        // Input dei dati per ciascun libro
        for (int i = 0; i < numero; i++) {
            System.out.println("Inserimento dati libro " + (i + 1) + ":");

            System.out.print("Titolo: ");
            Scanner input4 = new Scanner(System.in);
            String titolo = input4.nextLine();

            System.out.print("Autore: ");
            Scanner input5 = new Scanner(System.in);
            String autore= input5.nextLine();

            System.out.print("Numero di pagine: ");
            Scanner input6 = new Scanner(System.in);
            int numPagine = Integer.parseInt(input6.nextLine());

            System.out.print("Prezzo: ");
            Scanner input7 = new Scanner(System.in);
            double prezzo = Double.parseDouble(input7.nextLine());
            vectPrezzi.add(prezzo);



            System.out.print("Numero di copie: ");
            Scanner input8 = new Scanner(System.in);
            int numCopie = Integer.parseInt(input8.nextLine());


            for (int j = 0; j < numCopie; j++) {
                Libro libro = new Libro(titolo, autore, numPagine, prezzo);
                libreria1.getLibri().add(libro);
            }
        }

        System.out.println("Libreria : " + libreria1);
        System.out.println(vectPrezzi);

        double mediaPrezzo = libreria1.calcolaMediaPrezzo(vectPrezzi);
        System.out.println("Prezzo Medio dei Libri è: " + mediaPrezzo);
    }
}
