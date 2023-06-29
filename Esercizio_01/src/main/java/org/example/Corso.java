package org.example;

import java.util.ArrayList;
import java.util.List;

public class Corso {
    private String nomeCorso;
    private Docente docente;
    private List<Studente> studenti;

    public Corso(String nomeCorso, Docente docente) {
        this.nomeCorso = nomeCorso;
        this.docente = docente;
        this.studenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void stampaCorso() {
        System.out.println("===== CORSO =====");
        System.out.println("Nome corso: " + nomeCorso);
        System.out.println("Docente: " + docente.getNome() + " " + docente.getCognome());
        System.out.println("Studenti iscritti:");
        for (Studente studente : studenti) {
            studente.stampaStudente();
        }
        System.out.println("=================");
        System.out.println();
    }
}
