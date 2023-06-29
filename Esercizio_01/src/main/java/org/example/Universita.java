package org.example;

import java.util.ArrayList;
import java.util.List;

public class Universita {
    private String nome;
    private String sede;
    private List<Studente> studenti;
    private List<Corso> corsi;
    private List<Docente> docenti;

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

    public boolean contieneStudente(Studente studente) {
        return studenti.contains(studente);
    }

    public boolean contieneCorso(Corso corso) {
        return corsi.contains(corso);
    }

    public void stampaUniversita() {
        System.out.println("===== UNIVERSITA' =====");
        System.out.println("Nome: " + nome);
        System.out.println("Sede: " + sede);
        System.out.println("Studenti:");
        for (Studente studente : studenti) {
            studente.stampaStudente();
        }
        System.out.println("Corsi:");
        for (Corso corso : corsi) {
            corso.stampaCorso();
        }
        System.out.println("Docenti:");
        for (Docente docente : docenti) {
            docente.stampaDocente();
        }
        System.out.println("=======================");
        System.out.println();
    }
}