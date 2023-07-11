public class Libro {
    private String titolo;
    private String autore;
    private int numeroPagine;
    private String versione;
    private double prezzoLancio;
    private double prezzoAttuale;

    public Libro() {
        // Costruttore di default
    }

    public Libro(String titolo, String autore, int numeroPagine, String versione, double prezzoLancio, double prezzoAttuale) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
        this.versione = versione;
        this.prezzoLancio = prezzoLancio;
        this.prezzoAttuale = prezzoAttuale;
    }

    // Metodi get e set
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

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public String getVersione() {
        return versione;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public double getPrezzoLancio() {
        return prezzoLancio;
    }

    public void setPrezzoLancio(double prezzoLancio) {
        this.prezzoLancio = prezzoLancio;
    }

    public double getPrezzoAttuale() {
        return prezzoAttuale;
    }

    public void setPrezzoAttuale(double prezzoAttuale) {
        this.prezzoAttuale = prezzoAttuale;
    }

    // Applicare sconto del 10%
    public void applicaSconto10() {
        double sconto = prezzoAttuale * 0.1;
        prezzoAttuale -= sconto;
    }

    // Sconto percentuale
    public void applicaSconto(int percentualeSconto) {
        double sconto = prezzoAttuale * (percentualeSconto / 100.0);
        prezzoAttuale -= sconto;
    }

    // Rappresentare l'oggetto come stringa
    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numeroPagine=" + numeroPagine +
                ", versione='" + versione + '\'' +
                ", prezzoLancio=" + prezzoLancio +
                ", prezzoAttuale=" + prezzoAttuale +
                '}';
    }
}