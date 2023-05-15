public class Abobora extends Vegetal {

    private boolean comprida; 


    public boolean get_comprida(){
        return this.comprida; 
    }

    @Override
    public void pegarSol(){
        if (this.cor.equals("Vermelha")){
            this.tamanho = this.tamanho + 0.3f; 

        } else if (this.cor.equals("Amarelo")){
            this.tamanho = this.tamanho + 0.07f; 

        } 

        super.pegarSol(); // esta pegando  perSol da abobora e não da classe Vegetal
    }

    public Abobora (boolean comprida, String cor){
        
        super(cor); // chama o construtor da classe pai (Vegetal)
        this.comprida = comprida; 

        
    }
    
}
