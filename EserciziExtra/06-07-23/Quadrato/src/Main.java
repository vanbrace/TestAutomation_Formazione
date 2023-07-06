import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quadrato quad1 = new Quadrato();

        System.out.print("Cosa vuoi inserire tra lato, perimetro, area e diagonale? ");
        Scanner input = new Scanner(System.in); // creo uno scanner, che legge da riga di comando
        String dato = input.nextLine();


        System.out.print("Inserire il valore di " + dato);
        double valore = Double.parseDouble(input.nextLine());

        quad1.setValore(dato, valore);


        System.out.println("I valori di lato, perimetro, area e diagonale sono: " + quad1);
    }
}