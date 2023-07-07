import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

/** Main di classe Studente che prende in input due studenti e ne stampa i dettagli */
public class Main {
    public static void main(String[] args) {
        Studente stud1 = new Studente();

        System.out.print("Inserire il nome dello studente 1: ");
        Scanner input1 = new Scanner(System.in);
        String nome1 = input1.nextLine();

        System.out.print(("Inserire l'anno di nascita nel formato gg-mm-aa"));
        String dataDiNascita1 = input1.nextLine();
        String data1[] = dataDiNascita1.split("-");
        Date d1 = new Date(Integer.parseInt(data1[2]), Integer.parseInt(data1[1]), Integer.parseInt(data1[0]));

        stud1.setNome(nome1);
        stud1.setDataDiNascita(d1);

        System.out.println(stud1);

        //studente numero 2
        System.out.print("Inserire il nome dello studente 2: ");
        Scanner input2 = new Scanner(System.in);
        String nome2 = input2.nextLine();

        System.out.print(("Inserire l'anno di nascita nel formato gg-mm-aa"));
        String dataDiNascita2 = input2.nextLine();
        String data2[] = dataDiNascita2.split("-");
        Date d2 = new Date(Integer.parseInt(data2[2]), Integer.parseInt(data2[1]), Integer.parseInt(data2[0]));

        Studente stud2 = new Studente(nome2, d2);
        System.out.println(stud2);

        if(d1.compareTo(d2)<0){
            System.out.println("Lo studente 1 è più vecchio dello studente 2");
        } else if (d1.compareTo(d2)==0){
            System.out.println("Gli studenti sono nati lo stesso giorno");

        } else
            System.out.println("Lo studente 1 è più giovane dello studente 2");


    }
}