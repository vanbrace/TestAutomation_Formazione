public class Smartphone {
    private String marca;
    private String modello;
    private double prezzoDiLancio;
    private double numPollici;
    private int ram;
    private boolean touchScreen;

    // Costruttore
    public Smartphone() {
        marca = "";
        modello = "";
        prezzoDiLancio = 0.0;
        numPollici = 0.0;
        ram = 0;
        touchScreen = false;
    }

    // Costruttore con parametri
    public Smartphone(String marca, String modello, double prezzoDiLancio, double numPollici, int ram, boolean touchScreen) {
        this.marca = marca;
        this.modello = modello;
        this.prezzoDiLancio = prezzoDiLancio;
        this.numPollici = numPollici;
        this.ram = ram;
        this.touchScreen = touchScreen;
    }

    // attributo marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // attributo modello
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    // attributo prezzo di lancio
    public double getPrezzoDiLancio() {
        return prezzoDiLancio;
    }

    public void setPrezzoDiLancio(double prezzoDiLancio) {
        this.prezzoDiLancio = prezzoDiLancio;
    }

    // attributo pollici
    public double getNumPollici() {
        return numPollici;
    }

    public void setNumPollici(double numPollici) {
        this.numPollici = numPollici;
    }

    // attributo RAM
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    // attributo touchscreen
    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    // Metodo per ottenere la fascia di prezzo del telefono
    public String ottieniFasciaDiPrezzo() {
        if (prezzoDiLancio > 500) {
            return "fascia ALTA";
        } else if (prezzoDiLancio >= 200 && prezzoDiLancio <= 500) {
            return "fascia MEDIA";
        } else {
            return "fascia BASSA";
        }
    }

    // Metodo per ottenere la tipologia di smartphone
    public String ottieniTipologiaSmartphone() {
        if (numPollici < 5) {
            return "Mini";
        } else if (numPollici >= 5 && numPollici <= 7) {
            return "Normal";
        } else {
            return "Maxi";
        }
    }

    // Metodo toString per ottenere una rappresentazione testuale dell'oggetto Smartphone
    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
                "Modello: " + modello + "\n" +
                "Prezzo di Lancio: " + prezzoDiLancio + "\n" +
                "Numero di Pollici: " + numPollici + "\n" +
                "RAM: " + ram + "GB" + "\n" +
                "Touch Screen: " + touchScreen + "\n" +
                "Fascia di Prezzo: " + ottieniFasciaDiPrezzo() + "\n" +
                "Tipologia di Smartphone: " + ottieniTipologiaSmartphone();
    }
}