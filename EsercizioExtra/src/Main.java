import java.util.ArrayList;

class Universita {
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

class Studente {
    private String nome;
    private String cognome;
    private String corso;
    private String matricola;

    public Studente(String nome, String cognome, String corso, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;
        this.matricola = matricola;
    }

    public void stampaStudente() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Corso: " + corso);
        System.out.println("Matricola: " + matricola);
        System.out.println();
    }
}

class Docente {
    private String nome;
    private String cognome;
    private String corso;
    private String matricola;

    public Docente(String nome, String cognome, String corso, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;
        this.matricola = matricola;
    }


    public void stampaDocente() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Corso: " + corso);
        System.out.println("Matricola: " + matricola);
        System.out.println();
    }
}

class Corso {
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

public class Main {
    public static void main(String[] args) {
        Universita universita = new Universita("Federico II", "Napoli Via Claudio");

        // Creazione studenti
        Studente studente1 = new Studente("Roberto", "Ciliento", "Informatica", "12345");
        Studente studente2 = new Studente("Iolanda", "Maiorino", "Matematica", "54321");
        Studente studente3 = new Studente("Francesco", "Marruccelli", "Ingegneria", "98765");
        Studente studente4 = new Studente("Mario", "Mario", "Lettere", "56789");
        Studente studente5 = new Studente("Giorgia", "Soleri", "Medicina", "32145");

        // Creazione docenti
        Docente docente1 = new Docente("Paolo", "Rossi", "Ingegneria", "D001");
        Docente docente2 = new Docente("Emma", "Zecca", "Economia", "D002");
        Docente docente3 = new Docente("Marco", "Motta", "Informatica", "D003");
        Docente docente4 = new Docente("Giovanna", "D'Arco", "Lettere", "D004");
        Docente docente5 = new Docente("Antonio", "Cassano", "Medicina", "D005");

        // Aggiungi studenti e docenti
        universita.aggiungiStudente(studente1);
        universita.aggiungiStudente(studente2);
        universita.aggiungiStudente(studente3);
        universita.aggiungiStudente(studente4);
        universita.aggiungiStudente(studente5);

        universita.aggiungiDocente(docente1);
        universita.aggiungiDocente(docente2);
        universita.aggiungiDocente(docente3);
        universita.aggiungiDocente(docente4);
        universita.aggiungiDocente(docente5);

        // Creazione corsi
        Corso corso1 = new Corso("Linga Inglese", docente1);
        Corso corso2 = new Corso("Economia Aziendale", docente2);
        Corso corso3 = new Corso("Programmazione Java", docente3);
        Corso corso4 = new Corso("Letteratura Italiana", docente4);
        Corso corso5 = new Corso("Anatropologia", docente5);

        // Aggiunta dei corsi
        universita.aggiungiCorso(corso1);
        universita.aggiungiCorso(corso2);
        universita.aggiungiCorso(corso3);
        universita.aggiungiCorso(corso4);
        universita.aggiungiCorso(corso5);

        // Stampa università
        universita.stampaUniversita();

        // Creazione nuovo studente e corso
        Studente nuovoStudente = new Studente("Gigiolone", "Pescheria", "Medicina", "67890");
        Corso nuovoCorso = new Corso("Medicina Chirurgia", docente4);

        // Verifiche
        System.out.println("Il nuovo studente si è iscritto all'università: " + universita.studenteAppartieneUniversita(nuovoStudente));
        System.out.println("Il nuovo corso è tenuto all'università: " + universita.corsoTenutoUniversita(nuovoCorso));
    }
}

