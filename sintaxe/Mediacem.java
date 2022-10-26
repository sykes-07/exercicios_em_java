import java.util.Scanner;

public class Mediacem {
    public static void main(String[] args){
        double dividendo = 0, soma = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 100; i++){
            System.out.printf("digite o numero ");
            int num  = input.nextInt();
            soma += num;
            dividendo++;
        }

        double somatudo = soma/dividendo;
        
        System.out.print(somatudo);
        input.close();

    }
}