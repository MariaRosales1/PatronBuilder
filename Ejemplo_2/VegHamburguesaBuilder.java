
public class VegHamburguesaBuilder extends HamburguesaBuilder {
    public VegHamburguesaBuilder(){}
    
    @Override
    public void escogerPan(){
        hamburguesa.setPan("Pan frances");
    }
    public void prepararCarne(){
        hamburguesa.setTipoCarne("halloumi");
    }
    public void ponerCoberturas(){
        String cobertura[]= new String[4];
        cobertura[0] = new String( "Queso" );
	cobertura[1] = new String( "Tomate" );
	cobertura[2] = new String( "Lechuga" );
	cobertura[3] = new String( "Pepino" );
        hamburguesa.setCoberturas(cobertura);
    }
}
