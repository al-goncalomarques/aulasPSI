package projeto_video;
import java.util.*;
public class Projeto_Video {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner (System.in);
        Contacto[] contatos = new Contacto[3];
        
        System.out.println("Insira o nome da conta");
        String nome=sc.next();
        agenda.setNome(nome);
        
        for(int i=0;i<3;i++){
            
            System.out.println("Insira as informações do contacto Nº"+ (i+1) +"");
            Contacto c = new Contacto();
            
            System.out.println("Nome: ");
            nome=sc.next();
            c.setNome(nome);
            
            System.out.println("Telefone: ");
            int telefone=sc.nextInt();
            c.setTelefone(telefone);
            
            System.out.println("Email: ");
            String email=sc.next();
            c.setEmail(email);
            
            contatos[i]=c;
        }
        
        agenda.setContactos(contatos);
        
        if(agenda!=null){
            System.out.println(agenda.obterInfo());
        }
             
    }
}