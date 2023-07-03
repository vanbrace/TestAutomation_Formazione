public class Main {
    public static void main(String[] args) {
        Operazioni oggetto1 = new Operazioni();
        System.out.println(oggetto1.addizione1(7,8));
        oggetto1.addizione2(12,13);
        System.out.println(oggetto1.sottrazione1(9,8));
        oggetto1.sottrazione2(12,13);
        System.out.println(oggetto1.prodotto1(7,8));
        oggetto1.prodotto2(7,8);
        System.out.println(oggetto1.divisione1(12,0));
        oggetto1.divisione2(12,13);


        Operazioni oggetto2 = new Operazioni(15,20);
        System.out.println(oggetto2.addizione1(7,8));
        oggetto1.addizione2(12,13);
        System.out.println(oggetto2.sottrazione1(7,8));
        oggetto1.sottrazione2(12,13);
        System.out.println(oggetto2.prodotto1(7,8));
        oggetto1.prodotto2(7,8);
        System.out.println(oggetto2.divisione1(12,13));
        oggetto1.divisione2(12,0);
    }
}