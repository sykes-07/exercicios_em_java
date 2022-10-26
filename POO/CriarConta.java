public class CriarConta {
    public int numconta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("__________________________________________________");
        System.out.println("conta: "+ getNumconta());
        System.out.println("tipo: " + gettipo());
        System.out.println("nome: "+ getnome());
        System.out.println("saldo: "+getsaldo());
        System.out.println("status: "+getstatus());
    }

    public  CriarConta(){
        this.setsaldo(0);
        this.setstatus(false);

    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public int getNumconta() {
        return numconta;
    }

    public void settipo(String tipo){
        this.tipo = tipo;
    }

    public String gettipo(){
        return tipo;
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


    public void abrirConta(String t){
        this.settipo(t);
        this.setstatus(true);
        if (t == "CC"){
            this.setsaldo(50);

        }
        else if (t == "CP"){
            this.setsaldo(150);
        }

        System.out.println("conta aberta  com suscesso");

    }
    public void fecharConta(){

        if (getsaldo()>0){
            System.out.println("conta com dinheiro, não pode fechar ");
        }

        else if(getsaldo()<0){
            System.out.println("conta esta em divida, não pode fechar ");

        }

        else{
            this.setstatus(false);
            System.out.println("conta fechada copm sucesso");
        }

    }

    public void depositar(float v){
        if (this.getstatus()){
            this.setsaldo(this.getsaldo()+v);
            System.out.println("deposito realizado");
        }
        else{
            System.out.println("conta não existe");
        }


    }

    public void sacar(float v){
        if(this.getstatus()){
            if(this.getsaldo()>=v){
                this.setsaldo(getsaldo()-v);
                System.out.println("saque realizado");
            }
            else{
                System.out.println("saque não pode ser realizado");
            }
        }
        else{
            System.out.println("conta não existe");
        }

    }

    public void pagarMensal(){
        int v = 0;
        if (this.gettipo() == "CC"){
            v = 12;

        }
        else if (this.gettipo() == "CP"){
            v= 20;
        }

        if(getstatus()){
            if(this.getsaldo()>v){
                this.setsaldo(getsaldo()-v);
                
            }
            else{
                System.out.println("saldo insuficiente ");
            }
        }
        else{
            System.out.println("conta não existe");
        }

    }




    
}
