import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int crime = 0;
        int resposta1, resposta2, resposta3, resposta4, resposta5;

        System.out.println("Telefonou para a vitima? (escreva 1 para sim ou 2 para não) ");
        resposta1 = input.nextInt();
        if (resposta1 == 1){
            crime++;
        }

        System.out.println("Esteve no local do crime? (escreva 1 para sim ou 2 para não) ");
        resposta5 = input.nextInt();
        if (resposta5 == 1){
            crime++;
        }

        System.out.println("Mora perto da vítima? (escreva 1 para sim ou 2 para não) ");
        resposta2 = input.nextInt();

        if (resposta2 == 1){
            crime++;
        }

        System.out.println("Devia para a vítima? (escreva 1 para sim ou 2 para não) ");
        resposta3 = input.nextInt();
        if (resposta3 == 1){
            crime++;
        }

        System.out.println("Já trabalhou com a vítima? (escreva 1 para sim ou 2 para não) ");
        resposta4 = input.nextInt();
        if (resposta4 == 1){
            crime++;
        }

        input.close();
        
        if (crime <= 1 ){
            System.out.println("inocente");

        }

        else if (crime <= 2 ){
            System.out.println("suspeito");

        }

        else if (crime <= 4){
            System.out.println("cumplice");

        }

        else if (crime <= 5){
            System.out.print("culpado");
        }

        

    }
}
