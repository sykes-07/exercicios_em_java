import java.util.Scanner;
public class NotaCiclo {

    public static void main (String[] args){
        Scanner  input = new Scanner(System.in);
        boolean teste = true;
        int num;

        while(teste){
            System.out.print("Digite um número entre 0 e 10: ");
            num = input.nextInt();

            if (num >10 || num < 0 ){
                System.out.println("num invalido ");

            }
            else if (num <= 10 || num >= 0 ){
                teste = false;
            }

        }

        input.close();
        





    }

    
}
