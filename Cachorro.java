public class Cachorro implements Animal {
    //tanto cachorro qaunto gato tem que chamar os metodos 
    // na interface precisa ter todos os metodos em todas as classes, escrever todos os atributos em todas as classes 
    // na herança não precisa reescrever, se tem o atributo na classe pai nao precisa escrever novamete na classe fiho 

    int tamanho; 
    String cor; 

    public float get_tamanho(){
        return this.tamanho; 

    } 

    public void set_tamanho(float y){
        this.tamanho = y; 

    }

    public String get_cor(){
        return this.cor; 

    } 

    public void set_cor(String y){
        this.cor = y; 

    }

    public void imprimirSom(){
        System.out.println("Au Au");

    }
    
}
