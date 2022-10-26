import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EnqueteSistema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean a = true;
        int resposta;  
        List votos = new ArrayList<>();
        List windowsServe=  new ArrayList<>();
        List unix =  new ArrayList<>();
        List linux =  new ArrayList<>();
        List netware =  new ArrayList<>();
        List macOs=  new ArrayList<>();
        List outro=  new ArrayList<>();

        
        double porWin = 0,  porUn = 0, porLin = 0 , porNet = 0, porMac = 0, porOut = 0;
        while(a){
            System.out.println("Qual o melhor Sistema Operacional para uso em servidores? As possíveis respostas são: \n1- Windows Server\n2- Unix\n3- Linux\n4- Netware\n5- Mac OS\n0 - Para sair do sistema");
            resposta = input.nextInt();

            if(resposta <= 6 && resposta > 0){
            
                if (resposta == 1){
                    windowsServe.add(resposta);
                    votos.add(resposta);
                    
                    
                    
                    
                }
                else if (resposta == 2){
                    votos.add(resposta);
                    unix.add(resposta);
                    
                    
                    
                    

                }
                else if (resposta == 3){
                    votos.add(resposta);
                    linux.add(resposta);
                    
                    
                                     
                }
                else if(resposta == 4){
                    votos.add(resposta);
                    netware.add(resposta);
                    
                    
                    
                }
                else if (resposta == 5){
                    votos.add(resposta);
                    macOs.add(resposta);
                    
                    
                   
                }
                else if (resposta == 6){
                    votos.add(resposta);
                    outro.add(resposta);
                  
                }



            }

            else {
                a = false;
            }
        }


    porWin = windowsServe.size()*100/votos.size();
    porUn = unix.size()*100/votos.size();
    porLin = linux.size()*100/votos.size();
    porNet = netware.size()*100/votos.size();
    porMac = macOs.size()*100/votos.size();
    porOut = outro.size()*100/votos.size();


    
   
    

    System.out.println("Sistema Operacional           Votos   %");
    System.out.println("---------------------------   --------   ---");
    System.out.println("Windows Server               "+windowsServe.size()+"   "+ porWin);
    System.out.println("Unix                         " +unix.size()+"   "+ porUn);
    System.out.println("Linux                        "+linux.size()+"   "+porLin);
    System.out.println("Netware                      "+netware.size()+"   "+ porNet);
    System.out.println("Mac OS                       "+macOs.size()+"   "+ porMac);
    System.out.println("Outro                        "+outro.size()+"   "+porOut);
    System.out.println("-------------------               ---------");
    System.out.println("      Total                  "+votos.size());
   
    

    
    }
}