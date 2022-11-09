public class ContaCorrente extends Conta {
 
    public ContaCorrente(){
        super.setsaldo(1000);
        super.gerarNumConta();
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

}
