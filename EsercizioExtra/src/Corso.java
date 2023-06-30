import java.util.ArrayList;

public class Corso {
    private String nomeCorso;
    private Docente docente;
    private ArrayList<Studente> studenti;

    public Corso(String nomeCorso, Docente docente) {
        this.nomeCorso = nomeCorso;
        this.docente = docente;
        this.studenti = new ArrayList<>();
    }

    // Metodi getter e setter

    public void stampaCorso() {
        System.out.println("Nome corso: " + nomeCorso);
        System.out.println("Docente: ");
        docente.stampaDocente();
        System.out.println("Studenti: ");
        for (Studente studente : studenti) {
            studente.stampaStudente();
        }
        System.out.println();
    }
}
