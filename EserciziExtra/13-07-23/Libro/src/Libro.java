public class Libro {
    private String titolo;
    private String autore;
    private int numPagine;
    private double prezzo;

    public Libro(){
    }

    public Libro(String titolo, String autore, int numPagine, double prezzo){
        this.titolo = titolo;
        this.autore = autore;
        this.numPagine = numPagine;
        this.prezzo = prezzo;
    }

    // Costruttore di copia
    public Libro(Libro libro) {
        this.titolo = libro.getTitolo();
        this.autore = libro.getAutore();
        this.numPagine = libro.getNumPagine();
        this.prezzo = libro.getPrezzo();

    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

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
