public class Pitagora {
    public static void main(String[] args) {

        for (int r = 1; r <= 10; r++) {
            for (int c = 1; c <= 10; c++) {
                int prodotto = r * c;
                System.out.print(prodotto + "\t");
            }
            System.out.println();
        }
    }
}