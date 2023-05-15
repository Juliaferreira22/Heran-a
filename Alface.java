public class Alface extends Vegetal{

    private boolean crespa; 

    public boolean get_crespa(){
        return this.crespa; 

    }

    public Alface(boolean crespa, String cor){

        super(cor); 
        this.crespa = crespa; 
        
        

    }
    
}
