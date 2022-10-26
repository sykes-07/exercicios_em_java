import java.util.Scanner;

public class NumUsuario{

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double num; 
    System.out.printf("Digite um numero ");
    num = Double.parseDouble(ler.nextLine());
    System.out.println("Numero escrito pelo usuario: " + num);
    ler.close();
    }
}