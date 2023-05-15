import java.util.ArrayList;

public class Controller {

     public static void main(String[] args) {

        ArrayList<Vegetal> vegetais = new ArrayList<>();

        Vegetal minha_alface = new Alface(false, null);
        Vegetal minha_abobora = new Abobora(false, null); 

        vegetais.add( minha_alface);
        vegetais.add(minha_abobora);

        
}

}
