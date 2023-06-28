public class NumeriPari {
    public static void main(String[] args) {
        int cnt = 0; // Contatore

        for (int i = 0;; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                cnt++;
            }
//Arrivati a 5 numeri usciamo dal ciclo
            if (cnt == 5)
                break;

            continue;
        }
    }
}