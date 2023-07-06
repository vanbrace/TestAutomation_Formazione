public class Giocatore {
    private String nome;
    private boolean capitano;
    private int goal;
    private int goalNazionale;

    // Costruttore
    public Giocatore() {
        nome = "";
        capitano = false;
        goal = 0;
        goalNazionale = 0;
    }

    // Costruttore parametri
    public Giocatore(String nome, boolean capitano, int goal, int goalNazionale) {
        this.nome = nome;
        this.capitano = capitano;
        this.goal = goal;
        this.goalNazionale = goalNazionale;
    }

    // Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Capitano
    public boolean isCapitano() {
        return capitano;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    // Goal
    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    // Goal in Nazionale
    public int getGoalNazionale() {
        return goalNazionale;
    }

    public void setGoalNazionale(int goalNazionale) {
        this.goalNazionale = goalNazionale;
    }

    // Goal fatti
    public int calcolaGoalTotali() {
        return goal + goalNazionale;
    }

    // Stampa statistiche Giocatore
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Capitano: " + capitano + "\n" +
                "Goal (Club): " + goal + "\n" +
                "Goal (Nazionale): " + goalNazionale;
    }
}