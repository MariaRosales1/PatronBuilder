
public class ConstructorCarroFull extends CarroBuilder{
    
    public ConstructorCarroFull(){
    }
    @Override
    public void construirMotor() {
        this.carro.setMotor("Motor de potencia alta");
    }
    @Override
    public void construirCarroceria() {
         this.carro.setCarroceria( "Carrocería de protección alta" );
    }
    @Override
    public void construirAireAcond() {
         this.carro.setAireAcond( true);
    }
    @Override
    public void construirElevalunas() {
        this.carro.setElevalunasElec( true );
    }
}
