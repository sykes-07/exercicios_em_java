import java.util.Scanner;

public class Qacademico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.println("nome do aluno ");
        String nome = input.nextLine();

        System.out.println("nome do aluno ");
        String cpf = input.nextLine();

        System.out.println("nota da unidade 1 ");
        double uni1 = input.nextDouble();

        System.out.println("nota da unidade 2 ");
        double uni2 = input.nextDouble();

        System.out.println("nota da unidade 3 ");
        double uni3 = input.nextDouble();

        System.out.println("nota da unidade 4 ");
        double uni4 = input.nextDouble();

        Aluno aluno = new Aluno(nome, cpf);


        aluno.mediaAluno(uni1, uni2, uni3, uni4);




        


    }
    
}
