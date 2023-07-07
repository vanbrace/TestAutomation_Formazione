import java.util.Scanner;

/** Creo due oggetti di tipo libro, ne stampo i valori a video e stabilisco quale dei due oggetti possiede un numero maggiore di pagine*/
public class Main {
    public static void main(String[] args) {
        String maggiore;
        Libro libro1 = new Libro();

        System.out.print("Inserire il titolo del primo libro");
        Scanner input1 = new Scanner(System.in);
        String titolo1 = input1.nextLine();

        System.out.print("Inserire l'autore");
        String autore1 = input1.nextLine();

        System.out.print("Inserire il numero di pagine");
        int pagine1 = Integer.parseInt(input1.nextLine());

        System.out.print("Inserire la versione (cartacea o digitale)");
        String versione1 = input1.nextLine();

        System.out.print("Digitale il prezzo di lancio");
        double prezzoDiLancio1 = Double.parseDouble(input1.nextLine());

        System.out.print("Digitale il prezzo attuale");
        double prezzoAttuale1 = Double.parseDouble(input1.nextLine());

        System.out.print("Digitale la percentuale di sconto desiderata");
        int percentuale1 = Integer.parseInt(input1.nextLine());

        libro1.setTitolo(titolo1);
        libro1.setAutore(autore1);
        libro1.setPagine(pagine1);
        libro1.setVersione(versione1);
        libro1.setPrezzoDiLancio(prezzoDiLancio1);
        libro1.setPrezzoAttuale(prezzoAttuale1);
        //libro1.setPercentuale(percentuale1);
        libro1.applicaSconto10(prezzoAttuale1);
        libro1.applicaSconto(prezzoAttuale1, percentuale1);

        System.out.println(libro1);

        //secondo libro
        System.out.print("Inserisci il titolo del secondo libro");
        Scanner input2 = new Scanner(System.in);
        String titolo2 = input2.nextLine();

        System.out.print("Inserire l'autore");
        String autore2 = input2.nextLine();

        System.out.print("Inserire il numero di pagine");
        int pagine2 = Integer.parseInt(input2.nextLine());

        System.out.print("Inserire la versione (cartacea o digitale)");
        String versione2 = input2.nextLine();

        System.out.print("Digitale il prezzo di lancio");
        double prezzoDiLancio2 = Double.parseDouble(input2.nextLine());

        System.out.print("Digitale il prezzo attuale");
        double prezzoAttuale2 = Double.parseDouble(input2.nextLine());

        System.out.print("Digitale la percentuale di sconto desiderata");
        int percentuale2 = Integer.parseInt(input1.nextLine());

        Libro libro2 = new Libro(titolo2, autore2, pagine2, versione2, prezzoDiLancio2, prezzoAttuale2);
        libro2.applicaSconto10(prezzoAttuale2);
        libro2.applicaSconto(prezzoAttuale2, percentuale2);

        System.out.println(libro2);

        if (pagine1 > pagine2) {
            maggiore = "Primo libro";
        }
        else if (pagine1 < pagine2){
            maggiore = "Secondo libro";
        }
        else
        {maggiore = "I libri hanno lo stesso numero di pagine";}


        System.out.println("Quale libro ha il numero maggiore di pagine? " + maggiore);


    }
}