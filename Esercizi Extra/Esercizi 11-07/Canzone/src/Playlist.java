public class Playlist {
        private Canzone[] playlist;

        public Playlist(Canzone[] playlist) {
            this.playlist = playlist;
        }

        public void modificaTitolo(int pos, String tit) {
            if (pos >= 0 && pos < playlist.length) {
                playlist[pos].setTitolo(tit);
            } else {
                System.out.println("Posizione non valida.");
            }
        }

        public void modificaCantante(int pos, String can) {
            if (pos >= 0 && pos < playlist.length) {
                playlist[pos].setCantante(can);
            } else {
                System.out.println("Posizione non valida.");
            }
        }

        public void modificaDurata(int pos, int dur) {
            if (pos >= 0 && pos < playlist.length) {
                playlist[pos].setDurata(dur);
            } else {
                System.out.println("Posizione non valida.");
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Canzone canzone : playlist) {
                sb.append(canzone.toString()).append("\n");
            }
            return sb.toString();
        }
    }
