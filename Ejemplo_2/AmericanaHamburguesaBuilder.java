
public class AmericanaHamburguesaBuilder extends HamburguesaBuilder{
     public AmericanaHamburguesaBuilder(){}
    
    @Override
    public void escogerPan(){
        hamburguesa.setPan("Pan Blanco");
    }
    public void prepararCarne(){
        hamburguesa.setTipoCarne("Carne de res");
    }
    public void ponerCoberturas(){
        String cobertura[]= new String[4];
        cobertura[0] = new String( "Queso" );
	cobertura[1] = new String( "Tomate" );
	cobertura[2] = new String( "Cebolla" );
	cobertura[3] = new String( "tocineta" );
        hamburguesa.setCoberturas(cobertura);
    }
    
}
