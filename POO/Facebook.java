public class Facebook{
    public static void main(String[] args) {
        Post post = new Post(null, null);
        post.link = "https://www.youtube.com/watch?v=0f5wWNU_nns&list=PLGxZ4Rq3BOBq0KXHsp5J3PxyFaBIXVs3r&index=47";
        post.texto =  "teste do codigo";


        post.curtir(3);
        post.compartilhamento(7);


    }

}