import java.util.Random;;
public abstract class Conta {
    private int numconta;
    private String nome;
    private float saldo;
    private boolean status;

    Random gerador = new Random();




    public Conta(){
        this.setsaldo(0);
        this.setstatus(false);

    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setnome(String nome){
        this.nome = nome;

    }
    public String getnome(){
        return nome;
    }

    public void setsaldo(float saldo){
        this.saldo = saldo;
    }
    public float getsaldo(){
        return saldo;
    }

    public void setstatus(boolean status){
        this.status = status;
    }
    public boolean getstatus(){
        return status;
    }

    public void depositar(float v){
    }

    public void sacar(float v){ 

    }

    public void jurosMensais(){
        
    }

    public void adcionararray(int posição, float valor){

    }
    public void gerarNumConta(){
        this.setNumconta(gerador.nextInt(100000)+1);
        

    }

    


}