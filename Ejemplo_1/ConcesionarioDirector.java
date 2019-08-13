//Clase que controla los pasos de la creación de carros
//Entrega un carro construido completamente
public class ConcesionarioDirector {
    public ConcesionarioDirector(){
}
    public void construir(CarroBuilder carroBuilder)
    {
        carroBuilder.crearNuevoCarro();
        
        carroBuilder.construirCarroceria();
        carroBuilder.construirMotor();
        carroBuilder.construirElevalunas();
        carroBuilder.construirAireAcond();
    }
}
