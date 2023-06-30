public class Potenza {
    int base;

    //costruttore che prende in input un numero a e lo salva in base
    public Potenza(int a) {
        this.base = a;
    }

    //metodo pow() che stampa a video la potenza di base (base*base)
    public int pow() {
        return (base * base);
    }

    // metodo cambioBase() che permette di cambiare il campo base. Nel main setto la base a 2 e poi la cambio
    // prima con 3 e poi cn 4, stampandone ogni volta la potenza

    public void cambioBase(int a) {

        this.base = a;

    }
}
