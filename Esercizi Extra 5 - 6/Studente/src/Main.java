public class Studente {
    private String nome;
    private int annoDiNascita;

    // Costruttore vuoto
    public Studente() {
    }

    // Costruttore compilato
    public Studente(String nome, int annoDiNascita) {
        this.nome = nome;
        this.annoDiNascita = annoDiNascita;
    }

    // Metodi get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnnoDiNascita() {
        return annoDiNascita;
    }

    public void setAnnoDiNascita(int annoDiNascita) {
        this.annoDiNascita = annoDiNascita;
    }

    // Stampa
    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", annoDiNascita=" + annoDiNascita +
                '}';
    }
}
