import java.util.Scanner;
public class Libreria {
    private String nome;
    private String indirizzo;
    private Libro[] libri;

    // Costruttore di default
    public Libreria() {
    }

    // Costruttore personalizzato
    public Libreria(String nome, String indirizzo, int numLibri) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.libri = new Libro[numLibri];
        inserisciLibri();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    // Metodo per inserire i libri nella libreria
    private void inserisciLibri() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < libri.length; i++) {
            System.out.println("Inserisci i dati del libro " + (i + 1) + ":");
            System.out.print("Titolo: ");
            String titolo = scanner.nextLine();
            System.out.print("Autore: ");
            String autore = scanner.nextLine();
            System.out.print("Numero pagine: ");
            int numPagine = scanner.nextInt();
            System.out.print("Prezzo: ");
            double prezzo = scanner.nextDouble();
            System.out.print("Numero copie: ");
            int numCopie = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline residuo dopo nextInt()

            // Creazione del primo libro
            libri[i] = new Libro(titolo, autore, numPagine, prezzo);

            // Creazione delle copie successive del libro
            for (int j = 1; j < numCopie; j++) {
                libri[++i] = new Libro(libri[i - 1]); // Costruttore di copia
            }
        }
    }

    // Metodo per calcolare la media dei prezzi dei libri nella libreria
    public double calcolaMediaPrezzo() {
        double sommaPrezzi = 0;
        for (Libro libro : libri) {
            sommaPrezzi += libro.getPrezzo();
        }
        return sommaPrezzi / libri.length;
    }

    // Metodo toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome libreria: ").append(nome).append("\n");
        sb.append("Indirizzo: ").append(indirizzo).append("\n");
        sb.append("Libri presenti:\n");
        for (int i = 0; i < libri.length; i++) {
            sb.append("Libro ").append(i + 1).append(":\n").append(libri[i]).append("\n");
        }
        return sb.toString();
    }
}