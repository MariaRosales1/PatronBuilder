
public class ChefDirector {
    
  public ChefDirector(){}
  public void prepararHamburguesa(HamburguesaBuilder tipoHamburguesa){
      tipoHamburguesa.crearNuevaHamburguesa();
      tipoHamburguesa.escogerPan();
      tipoHamburguesa.ponerCoberturas();
      tipoHamburguesa.prepararCarne();
  }
}
