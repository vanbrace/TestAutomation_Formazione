import java.util.ArrayList;

public class Universita {
    private String nome;
    private String sede;
    private ArrayList<Studente> studenti;
    private ArrayList<Corso> corsi;
    private ArrayList<Docente> docenti;

    public Universita(String nome, String sede) {
        this.nome = nome;
        this.sede = sede;
        this.studenti = new ArrayList<>();
        this.corsi = new ArrayList<>();
        this.docenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public void aggiungiCorso(Corso corso) {
        corsi.add(corso);
    }

    public void aggiungiDocente(Docente docente) {
        docenti.add(docente);
    }

    public String getNome() {
        return nome;
    }

    public boolean studenteAppartieneUniversita(Studente studente) {
        return studenti.contains(studente);
    }

    public boolean corsoTenutoUniversita(Corso corso) {
        return corsi.contains(corso);
    }


    public void stampaUniversita() {
        System.out.println("Università: " + nome);
        System.out.println("Sede: " + sede);
        System.out.println("Studenti: ");
        for (Studente studente : studenti) {
            studente.stampaStudente();
        }
        System.out.println("Docenti: ");
        for (Docente docente : docenti) {
            docente.stampaDocente();
        }
        System.out.println("Corsi: ");
        for (Corso corso : corsi) {
            corso.stampaCorso();
        }
    }
}