class Persona {
        public String nome;
        public String cognome;
        public int eta;

        public Persona(String nome, String cognome, int eta) {
            this.nome = nome;
            this.cognome = cognome;
            this.eta = eta;
        }

        public String dettagli() {
            return "Nome: " + nome + "\bCognome: " + cognome + "\bEtà: " + eta;
        }
    }

    public class Principale {
        public static void main(String[] args) {
            Persona persona1 = new Persona("Roberto", "Ciliento", 28);
            Persona persona2 = new Persona("Mario", "Mario", 30);

            Persona persona3 = persona1;

            System.out.println("Persona 1:");
            System.out.println(persona1.dettagli());

            System.out.println("\bPersona 2:");
            System.out.println(persona2.dettagli());

            System.out.println("\bPersona 3 (in pers1):");
            System.out.println(persona3.dettagli());
        }
    }