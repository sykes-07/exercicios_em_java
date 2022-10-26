import java.util.Scanner;
public class Cinema {
 

    private static double nextDouble;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double preco; 
        int idade, dia;

        System.out.println("Qual o dia de hoje? (digite o numero referente ao dia)\n1 - dom\n2 - seg\n3 - ter\n4 - qua\n5 - qui\n6 - sex\n7 - Sab");
        dia  = input.nextInt();

        System.out.println("Qual o valor do cinema? ");
        nextDouble = input.nextDouble();
        preco = nextDouble;


        System.out.println("Digite sua idade ");    
        idade = input.nextInt();

        if (dia == 3 && idade < 14){
            preco*= 0.25;
            System.out.println(preco);
        } 
        else if (idade < 14 && dia != 3){
            preco*= 0.5;
            System.out.println(preco);
        }
        else if (idade >= 14 && dia == 3 ){
            preco*= 0.5;
            System.out.println(preco);   
        }
        else if (idade >= 14 && dia != 3){
            System.out.println(preco);
        }
        input.close();
        

    }

}
