import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //inserimento valori tramite tastiera e uso costruttore 1
        Smartphone smartphone1 = new Smartphone();
        System.out.print("Inserire la marca: ");
        Scanner input = new Scanner(System.in);
        String marca1 = input.nextLine();

        System.out.print("Inserire il modello: ");
        String modello1 = input.nextLine();

        System.out.print("Inserire il prezzo di lancio: ");
        int prezzoDiLancio1 = Integer.parseInt(input.nextLine());

        System.out.print("Inserire il numero di pollici: ");
        double numeroPollici1 = Double.parseDouble(input.nextLine());

        System.out.print("Inserire la RAM: ");
        int ram1 = Integer.parseInt(input.nextLine());

        System.out.print("Possiede il touch screen? ");
        boolean touchScreen1 = Boolean.parseBoolean(input.nextLine());

        smartphone1.setMarca(marca1);
        smartphone1.setModello(modello1);
        smartphone1.setPrezzoDiLancio(prezzoDiLancio1);
        smartphone1.setNumPollici(numeroPollici1);
        smartphone1.setRam(ram1);
        smartphone1.setTouchScreen(touchScreen1);

        System.out.println(smartphone1);

        System.out.print("Inserire la marca: ");
        Scanner input2 = new Scanner(System.in);
        String marca2 = input2.nextLine();

        System.out.print("Inserire il modello: ");
        String modello2 = input2.nextLine();

        System.out.print("Inserire il prezzo di lancio: ");
        int prezzoDiLancio2 = Integer.parseInt(input2.nextLine());

        System.out.print("Inserire il numero di pollici: ");
        double numeroPollici2 = Double.parseDouble(input2.nextLine());

        System.out.print("Inserire la RAM: ");
        int ram2 = Integer.parseInt(input2.nextLine());

        System.out.print("Possiede il touch screen? ");
        boolean touchScreen2 = Boolean.parseBoolean(input2.nextLine());

        Smartphone smartphone2 = new Smartphone(marca2, modello2,prezzoDiLancio2,numeroPollici2,ram2,touchScreen2);
        System.out.println("Smartphone2: " + smartphone2);
    }
}