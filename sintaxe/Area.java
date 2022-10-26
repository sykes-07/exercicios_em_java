import java.util.Scanner;

class Area{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("diga o valor do raio");
        double r = s.nextDouble();
        double area = (22*r*r)/7 ;
        System.out.println("a area do circulo  é " + area);
        s.close();

    }
}   