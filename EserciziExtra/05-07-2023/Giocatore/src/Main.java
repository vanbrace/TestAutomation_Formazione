import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Giocatore totti = new Giocatore();
        totti.setNome("Totti");
        totti.setCapitano(true);
        totti.setGoal(4);
        totti.setGoalNazionale(57);

        System.out.println(totti.getGoalNazionale());
        System.out.println(totti.getGoal());

        System.out.println("Giocatore numero 1: " + totti + " " + totti.calcolaGoalTotali());

        Giocatore zanetti = new Giocatore("Zanetti", false, 2, 31);

        System.out.println("Giocatore numero 1: " + zanetti + " " + zanetti.calcolaGoalTotali());

        Giocatore delPiero = new Giocatore();
        System.out.print("Inserire il nome per il giocatore: ");
        Scanner input = new Scanner(System.in); // creo uno scanner, che legge da riga di comando
        String nome = input.nextLine();

        System.out.print("Inserire se il giocatore è capitano: ");
        boolean capitano = Boolean.parseBoolean(input.nextLine());

        System.out.print("Inserire numero di goal del giocatore: ");
        int goal = Integer.parseInt(input.nextLine());

        System.out.print("Inserire numero di goalNazionale per il giocatore: ");
        int goalNazionale = Integer.parseInt(input.nextLine());

        delPiero.setNome(nome);
        delPiero.setCapitano(capitano);
        delPiero.setGoal(goal);
        delPiero.setGoalNazionale(goalNazionale);



        System.out.println("Giocatore numero 3: " + delPiero + " " + delPiero.calcolaGoalTotali());


    }
}