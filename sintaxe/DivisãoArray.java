public class DivisãoArray {
    public static void main(String[] args){

        int  maior = Integer.MIN_VALUE;
        int[] array = {1,2,3,4,5,6,7,8,9,10,40,83,22,45,2,78,4,};
        for(int i = 0; i < array.length; i++){
            if(array[i] > maior){
                maior = array[i];
            }


        }
        for(int i = 0; i < array.length; i++){
            double divisão = array[i]/maior;
            System.out.println(divisão);

        }   

        }


    }

