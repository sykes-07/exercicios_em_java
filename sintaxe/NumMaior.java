import java.util.Scanner;

public class NumMaior {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Primeiro numero ");
        n1 = input.nextInt();

        System.out.println("Segundo numero ");
        n2 = input.nextInt();

        System.out.println("Terceiro numero ");
        n3 = input.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.printf("O maior numero é " + n1);
        }

        else if (n2 > n1 && n2 > n3){
            System.out.printf("O maior numero é " + n2);
        }

        else if (n3 > n1 && n3 > n2){
            System.out.printf("o maior numero " + n3);
        }

        input.close();
    }
}
