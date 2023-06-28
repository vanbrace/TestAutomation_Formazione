public class Esercizio4CArray {
    public static void main(String[] args) {
        int i, j;
        int matrice[][] = new int[10][10];

        for(i=0;i<10;i++) {
            for (j = 0; j < 10; j++) {
                matrice[i][j] = (i + 1) * (j + 1);
            System.out.println(matrice[i][j]);
        }
        }
        }

}