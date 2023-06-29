package org.example;

public class Docente {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCorso() {
        return corso;
    }

    public void setCorso(String corso) {
        this.corso = corso;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void stampaDocente() {
        System.out.println("===== DOCENTE =====");
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Corso: " + corso);
        System.out.println("Matricola: " + matricola);
        System.out.println("===================");
        System.out.println();
    }
}
