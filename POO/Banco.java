public class Banco {
    public static void main(String[] args) {
        CriarConta p1 = new CriarConta();
        p1.abrirConta("CC");
        p1.setNumconta(2346);
        p1.setnome("diana");
        p1.depositar(80);
        p1.fecharConta();
        p1.sacar(130);
        p1.fecharConta();
        p1.estadoAtual();

        
        
    }
}
