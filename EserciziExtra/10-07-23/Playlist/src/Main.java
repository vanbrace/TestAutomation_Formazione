import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Inserire il numero di canzoni che si vogliono aggiungere");
        Scanner input1 = new Scanner(System.in);
        int numero1 = Integer.parseInt(input1.nextLine());

        Canzone song1 = new Canzone();

        String spazio = " - ";
        for(int i=0; i<numero1; i++) {
            System.out.print("Inserire il titolo della canzone che si vuole aggiungere");
            Scanner input2 = new Scanner(System.in);
            String canz1 = input2.nextLine();
            song1.setNome(canz1);

            System.out.print("Inserire l'autore della canzone");
            Scanner input3 = new Scanner(System.in);
            String aut1 = input3.nextLine();
            song1.setCantante(aut1);

            System.out.print("Inserire la durata della canzone");
            Scanner input4 = new Scanner(System.in);
            double dur1 = Integer.parseInt(input4.nextLine());
            song1.setDurata(dur1);

            song1.playlist(numero1, canz1, aut1, dur1, spazio);
            song1.setCanzoneMax();

        }


        System.out.println(song1.toString1());
        System.out.println("La canzone più lunga è: " + song1.getCanzoneMax());
        System.out.println("La durata media delle canzoni è di: " + song1.durataMedia());
        }

}