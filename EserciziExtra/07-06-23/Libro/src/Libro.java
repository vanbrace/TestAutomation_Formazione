/** Classe libro: prende in input: vari parametri che successivamente ristamperemo, dopo aver effettuato alcune operazioni*/
public class Libro {
    private String titolo;
    private String autore;
    private int pagine;
    private String versione;
    private double prezzoDiLancio;
    private double prezzoAttuale;
    private int percentuale;

    /** Definisco il costruttore di default*/
    public Libro(){
    }

    /** Definisco il costruttore parametrizzato con tutti gli attributi*/
    public Libro(String titolo, String autore, int pagine, String versione, double prezzoDiLancio, double prezzoAttuale){
        this.titolo = titolo;
        this.autore = autore;
        this.pagine = pagine;
        this.versione = versione;
        this.prezzoDiLancio = prezzoDiLancio;
        this.prezzoAttuale = prezzoAttuale;
    }

    /** Definisco getter e setter*/
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

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    public String getVersione() {
        return versione;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public double getPrezzoDiLancio() {
        return prezzoDiLancio;
    }

    public void setPrezzoDiLancio(double prezzoDiLancio) {
        this.prezzoDiLancio = prezzoDiLancio;
    }

    public double getPrezzoAttuale() {
        return prezzoAttuale;
    }

    public void setPrezzoAttuale(double prezzoAttuale) {
        this.prezzoAttuale = prezzoAttuale;
    }


    /** Definisco un metodo che applichi uno sconto del 10% al prezzo attuale inserito*/
    public double applicaSconto10(double prezzoAttuale){
        return (prezzoAttuale * 0.90);
    }

    /** Definisco un metodo che applichi uno sconto della percentuale desiderata inserita da tastiera al prezzo attuale*/
    public double applicaSconto(double prezzoAttuale, int percentuale){
        this.percentuale = percentuale;
        double prezzoNuovo = ((prezzoAttuale * (100-percentuale))/100);
        return prezzoNuovo;
    }

    /** Effettuo un override del metodo toString della classe Object al fine di stampare a video i valori di interesse*/
    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", pagine=" + pagine +
                ", versione='" + versione + '\'' +
                ", prezzoDiLancio=" + prezzoDiLancio +
                ", prezzoAttuale=" + prezzoAttuale +
                ", PrezzoScontatodel10% =" + applicaSconto10(prezzoAttuale) +
                ", PrezzoScontatodellaPercentualeDesiderata =" + applicaSconto(prezzoAttuale, percentuale) +
                '}';
    }
}
