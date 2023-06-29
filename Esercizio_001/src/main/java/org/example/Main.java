package org.example;

import org.example.Corso;
import org.example.Docente;
import org.example.Studente;
import org.example.Universita;


public class Main {
    public static void main(String[] args) {
        Universita universita = new Universita("Federico II", "Napoli Via Claudio");

        Studente s1 = new Studente("Mario", "Rossi", "Ingegneria", "12345");
        Studente s2 = new Studente("Laura", "Verdi", "Medicina", "67890");
        Studente s3 = new Studente("Luigi", "Bianchi", "Informatica", "54321");
        Studente s4 = new Studente("Giovanna", "Gialli", "Architettura", "09876");
        Studente s5 = new Studente("Paola", "Neri", "Lettere", "13579");

        Docente d1 = new Docente("Prof. Giovanni", "Bianchi", "Informatica", "10001");
        Docente d2 = new Docente("Prof. Maria", "Verdi", "Medicina", "20002");
        Docente d3 = new Docente("Prof. Luigi", "Rossi", "Ingegneria", "30003");
        Docente d4 = new Docente("Prof. Laura", "Neri", "Lettere", "40004");
        Docente d5 = new Docente("Prof. Giuseppe", "Gialli", "Architettura", "50005");

        universita.aggiungiStudente(s1);
        universita.aggiungiStudente(s2);
        universita.aggiungiStudente(s3);
        universita.aggiungiStudente(s4);
        universita.aggiungiStudente(s5);

        universita.aggiungiDocente(d1);
        universita.aggiungiDocente(d2);
        universita.aggiungiDocente(d3);
        universita.aggiungiDocente(d4);
        universita.aggiungiDocente(d5);

        Corso c1 = new Corso("Programmazione", d1);
        Corso c2 = new Corso("Anatomia", d2);
        Corso c3 = new Corso("Strutture Dati", d3);
        Corso c4 = new Corso("Storia dell'arte", d4);
        Corso c5 = new Corso("Progettazione Architettonica", d5);

        c1.aggiungiStudente(s1);
        c2.aggiungiStudente(s2);
        c3.aggiungiStudente(s3);
        c4.aggiungiStudente(s4);
        c5.aggiungiStudente(s5);

        universita.aggiungiCorso(c1);
        universita.aggiungiCorso(c2);
        universita.aggiungiCorso(c3);
        universita.aggiungiCorso(c4);
        universita.aggiungiCorso(c5);

        System.out.println("Oggetti Studente:");
        s1.stampaStudente();
        s2.stampaStudente();
        s3.stampaStudente();
        s4.stampaStudente();
        s5.stampaStudente();

        System.out.println("Oggetti Docente:");
        d1.stampaDocente();
        d2.stampaDocente();
        d3.stampaDocente();
        d4.stampaDocente();
        d5.stampaDocente();

        System.out.println("Oggetti Corso:");
        c1.stampaCorso();
        c2.stampaCorso();
        c3.stampaCorso();
        c4.stampaCorso();
        c5.stampaCorso();

        System.out.println("Università con tutti i valori:");
        universita.stampaUniversita();

        // Verifica se uno studente e un corso non appartengono all'università
        Studente nuovoStudente = new Studente("Giuseppe", "Verdi", "Giurisprudenza", "24680");
        Corso nuovoCorso = new Corso("Economia", d1);

        System.out.println("Verifica se uno studente appartiene all'università:");
        System.out.println(universita.contieneStudente(nuovoStudente));

        System.out.println("Verifica se un corso è tenuto nell'università:");
        System.out.println(universita.contieneCorso(nuovoCorso));
    }
}
