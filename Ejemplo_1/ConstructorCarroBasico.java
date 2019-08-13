
//Por cada tipo de objeto se crea una clase constructora
public class ConstructorCarroBasico extends CarroBuilder {
    public ConstructorCarroBasico(){
    }
    @Override
    public void construirMotor() {
        this.carro.setMotor("Motor de potencia mínima");
    }
    @Override
    public void construirCarroceria() {
         this.carro.setCarroceria( "Carrocería de baja protección" );
    }
    @Override
    public void construirAireAcond() {
         this.carro.setAireAcond( false );
    }
    @Override
    public void construirElevalunas() {
        this.carro.setElevalunasElec( false );
    }
}
