public class Pilota {
    private String nome;
    public Pilota(String nome){
        //impostare il nome (setter)
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
