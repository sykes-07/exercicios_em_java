public class ContaPoupança extends Conta{
    float juros;
    public ContaPoupança(){
        super.setsaldo(4000);
        super.gerarNumConta();
    }
    float[] array = new float[10];
 
    public float getjuros(){
        return juros;
    }

    public void setjuros(float juros){
        this.juros = juros;
    }

    public void sacar(float v){
        if(super.getsaldo()>=v){
            super.setsaldo(getsaldo()-v);
            System.out.println("saque realizado");
            System.out.println("saldo: " + super.getsaldo());
        }
        else{
            System.out.println("saque não pode ser realizado");
        }
    }

    public void depositar(float v){
        System.out.println("realizar deposito: "+v );
        super.setsaldo(this.getsaldo()+v);
        System.out.println("deposito realizado");
        System.out.println("saldo: " + super.getsaldo());

    }

    
    public void jurosMensais(){
        this.juros = super.getsaldo()*0.05f;
        super.setsaldo(super.getsaldo()+this.juros);
        System.out.println("os juros mensal é:" + getjuros());
        System.out.println("o valor com o juros somado é: "+ getsaldo());

        
    }

    public void adcionararray(int posição, float valor){
        array[posição] = valor;
        for(int i = 0; i < 10; i++){
            System.out.println(array[i]);
        }
        

    }
    



}