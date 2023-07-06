import java.util.Scanner;

public class TestGiocatore {
    public static void main(String[] args) {
        // Creazione Totti
        Giocatore totti = new Giocatore();
        totti.setNome("Francesco Totti");
        totti.setCapitano(true);
        totti.setGoal(250);
        totti.setGoalNazionale(30);

        // Creazione Zanetti
        Giocatore zanetti = new Giocatore("Javier Zanetti", true, 50, 10);

        // Creazione Del Piero
        Giocatore delPiero = new Giocatore();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome di Alessandro Del Piero: ");
        String nomeDelPiero = scanner.nextLine();
        delPiero.setNome(nomeDelPiero);

        System.out.print("Inserisci il numero di goal di Del Piero nel club: ");
        int goalDelPiero = scanner.nextInt();
        delPiero.setGoal(goalDelPiero);

        System.out.print("Inserisci il numero di goal di Del Piero nella nazionale: ");
        int goalNazionaleDelPiero = scanner.nextInt();
        delPiero.setGoalNazionale(goalNazionaleDelPiero);

        scanner.close();

        // Stampa dei giocatori
        System.out.println("Dettagli di Totti:\n" + totti);
        System.out.println("\nDettagli di Zanetti:\n" + zanetti);
        System.out.println("\nDettagli di Del Piero:\n" + delPiero);

        // Calcolo e stampa del totale dei goal di ogni giocatore
        System.out.println("\nTotale goal di Totti: " + totti.calcolaGoalTotali());
        System.out.println("Totale goal di Zanetti: " + zanetti.calcolaGoalTotali());
        System.out.println("Totale goal di Del Piero: " + delPiero.calcolaGoalTotali());
    }
}