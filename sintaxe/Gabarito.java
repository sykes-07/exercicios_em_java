
import java.util.Scanner;


public class Gabarito {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int nota = 0;
        
  
        String[] gabaritoOriginal  = { "a", "b", "c", "d", "e", "e", "d", "c", "b", "a"};
        
        
        for(int i = 0; i < 10; i++){
            System.out.println("digite o gabarito do aluno");
            String resposta = input.nextLine();
            String teste = gabaritoOriginal[i]; 
            if (resposta.equals(teste)){
                System.out.println("deu certo");
                nota++;    
            }
        }

        if(nota<= 5){
            System.out.printf("reprovado, sua nota foi %d%n", nota);
        }
        else {
            System.out.printf("aprovado, sua nota foi %d%n", nota);
        }
        input.close();
    }
            

}


        




