import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Inserire il numero di canzoni che si vogliono aggiungere");
        Scanner input1 = new Scanner(System.in);
        int numero1 = Integer.parseInt(input1.nextLine());

        List<Canzone> x = new ArrayList<>();


        String spazio = " - ";
        for(int i=0; i<numero1; i++) {
            Canzone song1 = new Canzone();

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

            x.add(song1);
        }
        Playlist play1 = new Playlist(x);



        System.out.print("Vuoi cambiare uno dei parametri della playlist? Inserisci 0 per la canzone, 1 per " +
                "l'autore e 2 per la durata");
        Scanner input5 = new Scanner(System.in);
        int par = Integer.parseInt(input5.nextLine());



        if(par == 0){
            System.out.print("Inserire il titolo della canzone che si desidera cambiare");
            String tit = input5.nextLine();
            System.out.println("Inserire il nuovo titolo");
            String newTit = input5.nextLine();
            int index= play1.getPosizione(tit,0);
            play1.modificaTitolo(index, newTit);
        }

        else if(par == 1){
            System.out.print("Inserire l'autore della canzone che si desidera cambiare");
            String aut = input5.nextLine();
            System.out.println("Inserire il nuovo autore");
            String newAut = input5.nextLine();
            int index= play1.getPosizione(aut,1);
            play1.modificaCantante(index, newAut);
        }

        else if(par == 2){
            System.out.print("Inserisci la canzone di cui si desidera cambiare la durata");
            String tit = input5.nextLine();
            System.out.println("Inserire la nuova durata");
            double newD = Double.parseDouble(input5.nextLine());
            int index= play1.getPosizione(tit,2);
            play1.modificaDurata(index, newD);
        }

        System.out.println("La nuova playlist: " + play1.getPlaylist().toString());
    }
}
