
public class Avião {
    double velocidade;
    double altitude; 
    boolean status;

    public Avião(){
        this.setaltitude(0);
        this.setvelovcidade(0);
        this.setstatus(false);

    }

    public void estadoAvião(){
        System.out.println("______________________________________________");
        System.out.println("velocidade do avião "+this.getvelocidade());
        System.out.println("altitude do avião "+this.getaltitude());
        System.out.println("status do avião "+ this.status);
        //System.out.println(null);
    }


    public void setvelovcidade(double velocidade ){
        this.velocidade = velocidade;
    }
    public double getvelocidade(){
        return velocidade;

    }

    public void setaltitude(double altitude){
        this.altitude = altitude;

    }
    public double getaltitude(){
        return altitude;
    }

    public void setstatus(boolean status){
        this.status = status;
    }

    public boolean getstatus(){
        return status;
    }

  
    // metodos 
    public void partida(float alt, float vel){
        this.setstatus(true);
        this.setaltitude(alt);
        this.setvelovcidade(vel);
        System.out.println("avião subuindo");

        

    }
    public void ajustarAltitude(double v){
        if(this.getstatus()){
            if(this.getaltitude()>0){
                this.setaltitude(getaltitude()+v);
            }
            if(this.getaltitude()>0){
                    System.out.println("a altitude do avião "+getaltitude());
            }

            else{
                this.setstatus(false);
                System.out.println("o avião esta no chão");
                }
            }
            
        else{
            System.out.println("o avião esta no chão");
        }
    }

    public void ajustarVelocidade(double v){

        if(getstatus()){
            if(getvelocidade()>0){
                this.setvelovcidade(getvelocidade()+v);
                System.out.println("a altitude do avião "+getvelocidade());
            }
            else if(getvelocidade()<0){
                System.out.println("o avião esta andando para tras");
            }
            
        }
        else{
            System.out.println("o avião esta no chão");
        }
    }

    


}
