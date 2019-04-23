package projeto_video;
public class Contacto {
    
    private String nome;
    private int telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String obterInfo(){
        
        return "Nome = "+ nome +";"+
               "Telefone = "+ telefone +";"+
               "Email = "+ email;
                
    }    
    
}