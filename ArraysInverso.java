import java.util.Scanner;

public class ArraysInverso{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] lista = new int[10];

        for(int i = 0; i< 10; i++){
            System.out.println("digite o  numero");
            lista[i] = input.nextInt();
        }
        System.out.println("--------------");
        for (int i = lista.length -1 ; i >=0; i--){
           
            System.out.println(lista[i]);

        }
    input.close();



    }
}       