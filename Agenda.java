package projeto_video;
public class Agenda {
    
    private String nome;
    private Contacto[] contactos;
    
    public Agenda(){
    }
    
    public Agenda(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
     public String obterInfo(){
        
        String info="Nome = "+nome+"\n";
        
        if (contactos!=null){
            
            for(Contacto c : contactos){
                
                info=info+c.obterInfo() + "\n";
                
            }
            
        }
                
        return info;
        
    }
    
}

