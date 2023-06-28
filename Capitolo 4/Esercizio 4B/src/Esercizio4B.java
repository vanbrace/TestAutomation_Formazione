public class Esercizio4B {
    public static void main(String[] args) {
        char lettera = 'a';
        int j = 0;

        for(j = 0; j<26; j++){
            System.out.println(lettera);
            lettera = (char) (lettera + 1);
        }
    }
}