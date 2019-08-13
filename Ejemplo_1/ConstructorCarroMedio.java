
public class ConstructorCarroMedio extends CarroBuilder{
    

    public ConstructorCarroMedio(){
    }
    @Override
    public void construirMotor() {
        this.carro.setMotor("Motor de potencia media");
    }
    @Override
    public void construirCarroceria() {
         this.carro.setCarroceria( "Carrocería de protección media" );
    }
    @Override
    public void construirAireAcond() {
         this.carro.setAireAcond( false );
    }
    @Override
    public void construirElevalunas() {
        this.carro.setElevalunasElec( true );
    }
}


