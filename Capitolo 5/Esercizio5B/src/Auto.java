public class Auto {
    private String scuderia;
    private Pilota pilota;
    public Auto(String scuderia, Pilota pilota){
        // impostare scuderia e pilota
        setPilota(pilota);
        setScuderia(scuderia);
    }

    public void setPilota(String pilota){
       this.pilota = pilota;
    }

    public String getPilota(){
        return pilota;
    }

    public void setScuderia(String scuderia){
       this.scuderia = scuderia;
    }

    public String getScuderia(){
        return scuderia;
    }

    public String dammiDettagli(){
        //restituisce una stringa descrittiva dell'oggetto
        return (getPilota().getNome() + "\n" + getScuderia());
    }

}
