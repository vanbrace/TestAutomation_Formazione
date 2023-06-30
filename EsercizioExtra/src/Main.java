import java.util.ArrayList;

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

