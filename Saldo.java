import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo, credito, debito, resultado;

        System.out.println("Qual o saldo no seu banco? ");
        saldo = Double.parseDouble(input.nextLine());

        System.out.println("Qual o seu credito no mes? ");
        credito = Double.parseDouble(input.nextLine());

        System.out.println("Qual o debito do mes? ");
        debito = Double.parseDouble(input.nextLine());

        resultado = saldo + credito - debito;

        if (resultado < 0){
            System.out.println("Saldo Negativo em " + resultado);
        }
        else if (resultado > 0 ){
            System.out.println("Saldo Positivo em " + resultado);
        }
        else if (resultado == 0){
            System.out.println("Seu saldo é " + resultado);
        }

        input.close();
        
    }
}
