import java.util.Scanner;

public class Academia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean teste = true;
        int codigo, codiPMaior = 0, codiPMenor = 0 , codiAMaior = 0 , codiAMenor = 0;
       

        double peso, altura , pesoMaior = 0 , alturaMaior =0 , pesoMenor = 0, alturaMenor = 0;

       

        while(teste){
            System.out.println("qual o codigo de aluno da academia");
            codigo = input.nextInt();
            if(codigo <= 0){
                teste = false;      

            }
            else{

                System.out.println("qual o peso? ");
                peso = input.nextInt();

                if (pesoMaior == 0 && pesoMenor == 0 ){
                    pesoMaior = peso;
                    pesoMenor = peso;
                    codiPMenor = codigo;
                    codiPMaior  = codigo;
                }

                else if(peso > pesoMaior){
                    pesoMaior = peso;
                    codiPMaior  = codigo;
                }
                
                else if (peso < pesoMenor){
                    pesoMenor = peso;
                    codiPMenor = codigo;
                }
                System.out.println("qual a altura ");
                altura = input.nextInt();

                if (alturaMaior == 0 && alturaMaior == 0){
                    alturaMaior = altura;
                    codiAMaior  = codigo;
                    alturaMenor = altura;
                    codiAMenor = codigo;
                }


                else if (altura > alturaMaior){
                    alturaMaior = altura;
                    codiAMaior  = codigo;
                }
                
                else if (altura < alturaMenor){
                    alturaMenor = altura;
                    codiAMenor = codigo;
                }

            }
        }
        System.out.println("o maior peso é " + pesoMaior +  "do aluno" + codiPMaior);
        System.out.println("o menor peso é " + pesoMenor +  "do aluno" + codiPMenor);
        System.out.println("a maior altura é " + alturaMaior +  "do aluno " + codiAMaior);
        System.out.println("a menor altura é " + alturaMenor +  "do aluno " + codiAMenor);
        
        input.close();
    }       
    
}
