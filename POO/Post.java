public class Post {
    String texto;
    String link;
    int numCurtidas;
    int numCompart;


    Post(String texto, String link){

    }

    void curtir(int curtidas){
        this.numCurtidas = this.numCurtidas + curtidas;
        System.out.println(this.numCurtidas);

    }

    void compartilhamento(int compart){
        this.numCompart = this.numCompart + compart;
        System.out.println(this.numCompart);

    }
    
}
