public class Aluno {
    String nome;
    String cpf;
    double nota;
  

    Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;

    }

    void mediaAluno( double uni1, double uni2, double uni3, double uni4){
        System.out.println("aluno " + this.nome + " cpf "+ this.cpf);
        this.nota = (uni1+uni2+uni3+uni4)/4;
        System.out.println("A media do aluno é "+this.nota);

    }

}
