import java.util.Scanner;

public class Automobile {
    private String marca;
    private String modello;
    private int cavalli;
    private boolean cabrio;

    public Automobile(){
    }

    public Automobile(String marca, String modello, int cavalli, boolean cabrio){
        this.marca = marca;
        this.modello = modello;
        this.cavalli = cavalli;
        this.cabrio = cabrio;
    }

    // Costruttore di copia
    public Automobile(Automobile auto) {
        this.marca = auto.getMarca();
        this.modello = auto.getModello();
        this.cavalli = auto.getCavalli();
        this.cabrio = auto.isCabrio();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCavalli() {
        return cavalli;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public boolean isCabrio() {
        return cabrio;
    }

    public void setCabrio(boolean cabrio) {
        this.cabrio = cabrio;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", cavalli=" + cavalli +
                ", cabrio=" + cabrio +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void inserisciDati(){

        System.out.print("Inserisci la marca: ");
        Scanner input1 = new Scanner(System.in);
        String marca = input1.nextLine();
        setMarca(marca);

        System.out.print("Inserisci il modello: ");
        Scanner input2 = new Scanner(System.in);
        String modello = input2.nextLine();
        setModello(modello);

        System.out.print("Inserisci il numero di cavalli: ");
        Scanner input3 = new Scanner(System.in);
        int cavalli = Integer.parseInt(input3.nextLine());
        setCavalli(cavalli);

        System.out.print("è cabrio? ");
        Scanner input4 = new Scanner(System.in);
        boolean cabrio = Boolean.parseBoolean(input4.nextLine());
        setCabrio(cabrio);

    }

}
