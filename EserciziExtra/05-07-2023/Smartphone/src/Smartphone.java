public class Smartphone {
    private String marca;
    private String modello;
    private int prezzoDiLancio;
    private double numPollici;
    private int ram;
    private boolean touchScreen;
    private String fasciaPrezzo;
    private String dimensioni;

    public Smartphone(){
    }

    public Smartphone(String marca, String modello, int prezzoDiLancio, double numPollici, int ram, boolean touchScreen){
        this.marca = marca;
        this.modello = modello;
        this.prezzoDiLancio = prezzoDiLancio;
        this.numPollici = numPollici;
        this.ram = ram;
        this.touchScreen = touchScreen;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    public void setPrezzoDiLancio(int prezzoDiLancio) {
        this.prezzoDiLancio = prezzoDiLancio;
    }

    public int getPrezzoDiLancio() {
        return prezzoDiLancio;
    }

    public void setNumPollici(double numPollici) {
        this.numPollici = numPollici;
    }

    public double getNumPollici() {
        return numPollici;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

     public boolean getTouchScreen(){
        return touchScreen;
     }

     public String ottieniFasciaDiPrezzo(){
        if(getPrezzoDiLancio() > 500) {
            fasciaPrezzo = "fascia ALTA";
        } else if (getPrezzoDiLancio() >= 200 && getPrezzoDiLancio() <= 500) {
            fasciaPrezzo = "fascia MEDIA";
        } else if (getPrezzoDiLancio() < 200 ) {
            fasciaPrezzo = "fascia BASSA";
        }
         return fasciaPrezzo;
     }

     public String ottieniTipologiaSmartphone(){
         if(getNumPollici() > 7) {
             dimensioni = "Maxi";
         } else if (getNumPollici() >= 5 && getNumPollici() <= 7) {
             dimensioni = "Normal";
         } else if (getNumPollici() < 5 ) {
             dimensioni = "Mini";
         }
        return dimensioni;
     }


    public String toString() {
        return getMarca() + " " + getModello() + " " + getPrezzoDiLancio() + " " + getNumPollici() + " " + getRam() +
                " " + getTouchScreen() + " " + ottieniFasciaDiPrezzo() + " " + ottieniTipologiaSmartphone();
    }
}
