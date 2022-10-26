import java.util.Scanner;

public class NumInteiro {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("primeiro numero");
        int num1 = input.nextInt();
        System.out.println("segundo numero");
        int num2 = input.nextInt();
        System.out.println("os numeros entre são");

        for(int i = num1+1; i < num2; i++){
            System.out.println(i);
        }

        input.close();  


    }
    
}
