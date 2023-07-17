import java.util.ArrayList;

public class SensoreTemperatura {
    private double latitudine;
    private double longitudine;
    private double temperatura;

    public SensoreTemperatura(){
    }

    public SensoreTemperatura(double latitudine, double longitudine, double temperatura){
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.temperatura = temperatura;
    }

    public double getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(double latitudine) {
        this.latitudine = latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(double longitudine) {
        this.longitudine = longitudine;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double calcolaDistanza(SensoreTemperatura altroSensore) {
        double latDiff = this.latitudine - altroSensore.getLatitudine();
        double lonDiff = this.longitudine - altroSensore.getLongitudine();
        double distQuadra = Math.pow(latDiff,2) + Math.pow(lonDiff,2);
        return Math.sqrt(distQuadra);
    }

    public ArrayList<Double> calcolaPuntoMedio(SensoreTemperatura altroSensore) {
        double latMedia = (this.latitudine + altroSensore.getLatitudine()) / 2.0;
        double lonMedia = (this.longitudine + altroSensore.getLongitudine()) / 2.0;
        ArrayList<Double> coppia= new ArrayList ();
        coppia.add(latMedia);
        coppia.add(lonMedia);
        return coppia;
    }

    public boolean segnalaRischioIncendio(SensoreTemperatura altroSensore) {
        double distanza = calcolaDistanza(altroSensore);
        if (distanza <= 15 && this.temperatura > 60 && altroSensore.temperatura > 60) {
            return true; // Rischio di incendio
        } else {
            return false; // Nessun rischio di incendio
        }
    }
}
