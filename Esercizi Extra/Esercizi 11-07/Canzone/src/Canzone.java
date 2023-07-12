public class Canzone {
    private String titolo;
    private String cantante;
    private int durata;

    // Costruttore di default
    public Canzone() {
    }

    // Costruttore parametrizzato
    public Canzone(String titolo, String cantante, int durata) {
        this.titolo = titolo;
        this.cantante = cantante;
        this.durata = durata;
    }

    // Metodi get e set
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Canzone{" +
                "titolo='" + titolo + '\'' +
                ", cantante='" + cantante + '\'' +
                ", durata=" + durata +
                '}';
    }
}