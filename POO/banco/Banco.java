public class Banco {
    public static void main(String[] args) {

        Conta contaTesouroDireto = new ContaTesouroDireto();
        Conta contacorrente = new ContaCorrente();
        Conta contapoupança = new ContaPoupança();
        System.out.println("saldo: " + contacorrente.getsaldo());
        System.out.println("numero da conta: "+ contacorrente.getNumconta());
        contacorrente.depositar(100);
        contacorrente.sacar (200);
        System.out.println("-----------------------------------------------------------");
        System.out.println("saldo: " + contapoupança.getsaldo());
        System.out.println("numero da conta: "+contapoupança.getNumconta());
        contapoupança.depositar(100);
        contapoupança.sacar (200);
        contapoupança.jurosMensais();
        System.out.println("-----------------------------------------------------------");
        contapoupança.adcionararray(1,contaTesouroDireto.getsaldo());
        System.out.println("-----------------------------------------------------------");
        contapoupança.adcionararray(0, 500);

        
       
    }
}
