public class Main {
    public static void main(String[] args) {
        Persona pers = new Persona();
        pers.setNome("Pippo");
        System.out.println(pers.getNome());

        Impiegato imp = new Impiegato();
        imp.setDati("Pluto", 01234);
        System.out.println(imp.dammiDettagli());
    }
}