public class Impiegato extends Persona{
    // concetto di ereditarietà perché Impiegato è la sottoclasse che estende la classe Persona,
    // quindi, ne eredita metodi e variabili, per cui c'è anche il concetto del riuso

    private int matricola;
    //private-> incapsulamento, infatti, posso accedere a tale variabile solo tramite getMatricola e setMatricola.

    public void setDati(String nome, int matricola){
        //concetto di incapsulamento e riuso dovuto all'uso di setDati e getDati.
        setNome(nome); // nome e setNome vengono ereditate dalla classe Persona -> ereditarietà e riuso.
        setMatricola(matricola); //incapsulamento -> matricola viene identificata tramite il modificatore di accesso
        // private, quindi, è modificabile solo tramite il metodo setMatricola.
    }

    public void setMatricola(int matricola) {
        //incapsulamento-> matricola è private, per cui devo implementare un setter che mi permetta di settarla.
        this.matricola = matricola;
    }

    public int getMatricola() {
        //incapsulamento-> matricola è private, per cui devo implementare un getter che mi permetta di accedere al suo valore.
        return matricola;
    }

    public String dammiDettagli(){
        //ereditarietà, riuso ed incapsulamento: questo metodo fa uso dell'incapsulamento perché richiama il metodo
        // getMatricola (ma anche getNome), dell' ereditarietà perché richiama il metodo getNome che era stato
        // implementato nella superclasse. Il riuso di codice è evidente.
        return getNome() + ", matricola: " + getMatricola();
    }
}
