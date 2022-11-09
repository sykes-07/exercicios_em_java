import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Contato {
    String nome;
    int numMsg;
    String mensagem;
    String r;
    
 
    


    ArrayList<String> mensagenscontato = new ArrayList<>();
    ArrayList<String> minhasmensagns = new ArrayList<>();
    Scanner input = new Scanner(System.in);




    public void setMenssagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getMenssagem() {
        return mensagem;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNumMsg(int numMsg) {
        this.numMsg = numMsg;
    }
    public int getNumMsg() {
        return numMsg;
    }

    public void setr(String r){
        this.r = r;
    }

    public String getr(){
        return r;
    }


    public void  enviarMsg(){
        while(true){
            System.out.println("digite /quit para sair");
            System.out.print("eu: ");
            setr(input.nextLine());

            minhasmensagns.add(getr());

            mensagenscontato.clear();
            


            if(r.equals("/quit")){
                break;
            }
        }

    }


    public void receberMsgContato(){
        setNumMsg(0);
        while(true){
            System.out.println("digite /quit para sair");
            System.out.print(getNome()+":");
            setr(input.nextLine());
            mensagenscontato.add(getr());
            setNumMsg(numMsg++);
    
    
            if(r.equals("/quit")){
                break;
                
            }
        }
    }

                          
    public void mostrarMensagem(){
        
        for(int i = 0; i<=mensagenscontato.size();i++){
            System.out.print(getNome()+": "+mensagenscontato[i]);
        }
    }
    public void lerMsg(){
        setNumMsg(0);

    }

    public void msgNlida(){
        System.out.println("mensagns não lida "+mensagenscontato.size());

    }


    
}
