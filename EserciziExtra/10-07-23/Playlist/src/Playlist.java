import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Canzone> playlist;

    public Playlist(List<Canzone> playlist){
        this.playlist = playlist;
    }

    public void setPlaylist(List<Canzone> playlist) {
        this.playlist = playlist;
    }

    public List<Canzone> getPlaylist() {
        return playlist;
    }

    public String modificaTitolo(int pos, String tit){
        playlist.get(pos).setNome(tit);
        return playlist.get(pos).getNome();
    }

    public String modificaCantante(int pos, String can){
        playlist.get(pos).setCantante(can);
        return playlist.get(pos).getCantante();
    }

    public double modificaDurata(int pos, double dur) {
        playlist.get(pos).setDurata(dur);
        return playlist.get(pos).getDurata();
    }

    public int getPosizione(String nome, int ind){
        for(int j=0; j< playlist.size(); j++)
        {
            if(ind == 0 || ind == 2) {
                if (playlist.get(j).getNome().contains(nome)) {
                    return j;
                }
            }
            else if(ind == 1) {
                if (playlist.get(j).getCantante().contains(nome)) {
                    return j;
                }
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlist=" + playlist +
                '}';
    }
}
