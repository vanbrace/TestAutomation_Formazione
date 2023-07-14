import java.util.ArrayList;

public class Libreria {
    private String nome;
    private String indirizzo;
    private ArrayList<Libro> libri;

    public Libreria(){
        libri = new ArrayList<>();
    }

    public Libreria(String nome, String indirizzo, ArrayList<Libro> libri){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.libri = libri;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }

    public void setLibri(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", libri=" + libri +
                '}';
    }

    public double calcolaMediaPrezzo(ArrayList<Double> vectPrezzi){

        int dimensione = vectPrezzi.size();
        System.out.println("Dimensione: " + dimensione);
        if (dimensione == 0){
            return 0;
        }
        double somma = 0;
        double media = 0;
        for (int j = 0; j < dimensione; j++) {
             somma += vectPrezzi.get(j);
        }
        media = somma / vectPrezzi.size();

        return media;
    }

}
