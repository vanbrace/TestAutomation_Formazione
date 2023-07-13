import java.util.ArrayList;

public class Canzone {
    private String nome;
    private String cantante;
    private double durata;
    private int numero;
    private String spazio;
    private String canzoneMax;
    private ArrayList <Double> playlistDur = new ArrayList();
    private ArrayList <String> playlistNome = new ArrayList();


    private ArrayList <String >playlistCanz = new ArrayList<>();

    public Canzone(){
    }

    public Canzone(String nome, String cantante, double durata){
        this.nome = nome;
        this.cantante = cantante;
        this.durata = durata;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;

    }


    public String getSpazio(){
        return spazio;
    }

    public void setSpazio(String spazio){
        getSpazio();
    }


    public String toString1() {
        String playlistC = String.valueOf(getPlaylistCanz());
        return playlistC;
    }

    @Override
    public String toString() {
        return "Canzone{" +
                "nome='" + nome + '\'' +
                ", cantante='" + cantante + '\'' +
                ", durata=" + durata +
                '}';
    }

    public void playlist(int numero, String nome, String cantante, double durata, String spazio){
        this.numero = numero;
        this.spazio = spazio;
        //ArrayList playlistCanz = new ArrayList();
        playlistCanz.add(getNome());
        playlistCanz.add(getCantante());
        String du = String.valueOf(getDurata());
        playlistCanz.add(du);
        playlistDur.add(getDurata());
        playlistNome.add(getNome());
        playlistCanz.add(spazio);
        setPlaylistCanz(playlistCanz);
    }

    public ArrayList getPlaylistCanz() {
        return playlistCanz;
    }

    public void setPlaylistCanz(ArrayList playlistCanz) {
        this.playlistCanz = playlistCanz;
    }

    public void setCanzoneMax(){
        int lungh = playlistDur.size();
        int indexCanz = 0;
        double durCanzoneMax = playlistDur.get(0);
         for(int k = 1; k < lungh; k++){
             if(playlistDur.get(k) > durCanzoneMax ){
                 durCanzoneMax = playlistDur.get(k);
                 indexCanz = k;
             }

         }
         canzoneMax = playlistNome.get(indexCanz);
    }

    public String getCanzoneMax(){
        return canzoneMax;

    }

    public double durataMedia(){
        int j =0;
        double totale=0;
        for(j= 0; j < playlistDur.size(); j++){
            totale = totale + playlistDur.get(j);
        }
        double media = totale/ playlistDur.size();
                return media;
    }

}
