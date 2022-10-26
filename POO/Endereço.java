public class Endereço {
    String rua;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
    String cep;

    void endereço(String rua,String numero,String complemento, String bairro,String cidade,String uf,String cep){
        System.out.println("a rua é" + this.rua);
        System.out.println("o numero é "+ this.numero);
        System.out.println("o complemento é "+this.complemento);
        System.out.println("o bairro é "+ this.bairro);
        System.out.println("a cidade é "+this.cidade);
        System.out.println("a UF é "+this.uf);
        System.out.println("o cep é "+this.cep);

    }


    
}
