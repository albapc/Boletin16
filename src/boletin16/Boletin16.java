package boletin16;

public class Boletin16 {

    public static void main(String[] args) {
//        Persoa p1 = new Persoa();
//        Canario c1 = new Canario();
//
//        p1.cantar();
//        c1.cantar();

         IPodeCantar obx = new Persoa();
         obx.cantar();

         Tenor ten = new Tenor();
         ten.cantar();
        
    }
}
