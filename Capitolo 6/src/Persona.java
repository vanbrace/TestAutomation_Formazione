public class Persona {
    private String nome;
    //private-> incapsulamento, infatti, posso accedere a tale variabile solo tramite getNome e setNome.

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    //getter e setter -> incapsulamento e riuso, inoltre vengono ereditati automaticamente anche dalla sottoclasse e,
    // quindi, c'è anche ereditarietà nella classe figlia.
}
