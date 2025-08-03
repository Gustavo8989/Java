public class Cliente {
    private String nome;
    private double cep;
    private String Email;
    private int telefone;
    public Cliente(String nome, double cep, String Email, int telefone){
        this.nome = nome;
        this.cep = cep;
        this.Email = Email;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public double getcep(){
        return cep;
    }
    public String getEmail(){
        return Email;
    }
    public int getTelefone(){
        return telefone;
    }
}
