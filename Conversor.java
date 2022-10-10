import java.util.Scanner;

public class Conversor {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num, converter; 

        System.out.println("Digite um valor em metros ");
        num = Double.parseDouble(input.nextLine());

        converter = num * 100;

        System.out.printf("o valor é" + converter);
        
        input.close();

    }

}