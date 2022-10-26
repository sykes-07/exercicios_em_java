import java.util.Scanner;

public class Notas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double n1, n2, n3, n4, media;
        
        System.out.println("Digite a primeira nota ");
        n1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a segunda nota ");
        n2 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a terceira nota ");
        n3 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a quarta nota ");
        n4 = Double.parseDouble(input.nextLine());

        media = (n1 + n2 + n3 + n4)/ 4;

        System.out.println(" o Valor da media é: " + media);

        input.close();

    }
}
