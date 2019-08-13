//Clase abstracta que contiene todos los metodos
//necesarios para construir un tipo de carro
public abstract class CarroBuilder {
   
    protected Carro carro;
    
    public Carro getCarro(){
        return this.carro;
    }
     public void crearNuevoCarro() {
        this.carro = new Carro();
    }
    //Metodos que deben implementar las
    //clases que heredan de CarroBuilder
     public abstract void construirMotor();
     public abstract void construirCarroceria();
     public abstract void construirAireAcond();
     public abstract void construirElevalunas();
}
