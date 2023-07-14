public class Libro {
    private String titolo;
    private String autore;
    private int numPagine;
    private double prezzo;

    // Costruttore di default
    public Libro() {
    }

    // Costruttore parametrizzato
    public Libro(String titolo, String autore, int numPagine, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.numPagine = numPagine;
        this.prezzo = prezzo;
    }

    // Costruttore di copia
    public Libro(Libro altroLibro) {
        this.titolo = altroLibro.titolo;
        this.autore = altroLibro.autore;
        this.numPagine = altroLibro.numPagine;
        this.prezzo = altroLibro.prezzo;
    }

    // Get
    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public double getPrezzo() {
        return prezzo;
    }

    // Set
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    // toString
    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numPagine=" + numPagine +
                ", prezzo=" + prezzo +
                '}';
    }
}