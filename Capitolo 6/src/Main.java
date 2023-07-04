public class Main {
    public static void main(String[] args) {
        //provo la classe Persona:
        Persona persona1 = new Persona();
        persona1.setNome("Topolino");
        System.out.println(persona1.getNome());

        //provo la classe Impiegato che estende la superclasse Persona:
        Impiegato impiegato1 = new Impiegato();
        impiegato1.setDati("Pluto", 54321);
        System.out.println(impiegato1.dammiDettagli());
    }
}