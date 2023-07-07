import java.util.Date;

public class Studente {
    private String nome;
    private Date dataDiNascita;

    /** Costruttore di default */
    public Studente(){
    }

    /** Costruttore parametrizzato */
    public Studente(String nome, Date dataDiNascita){
        this.nome = nome;
        this.dataDiNascita = dataDiNascita;
    }

    /** Definisco getter e setter */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    /** Override del metodo toString della classe Object, che stampa i dettagli dei miei oggetti */
    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", dataDiNascita='" + dataDiNascita.getDate() + "-" + dataDiNascita.getMonth() + "-" + dataDiNascita.getYear() + '\'' +
                '}';
    }
}
