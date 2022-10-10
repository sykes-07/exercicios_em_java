import java.util.Scanner;

public class Emissora {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é a emissora de TV que você deseja assistir? ");
        int emissora = input.nextInt();
        switch (emissora) {
        case 2:
            System.out.println("SBT");
            break;
        
        case 4:
            System.out.println("BAND");
            break;
        
        case 6:
            System.out.println("REDETV");
            break;

        case 13:
            System.out.println("GLOBO");
            break;
        
        default:
            System.out.println("canal invalido");
            break;
        }

        input.close();
    }
    
}
