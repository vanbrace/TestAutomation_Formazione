public class Studente {
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