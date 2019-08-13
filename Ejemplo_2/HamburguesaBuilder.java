
//Constructor de las hamburguesas
public abstract class HamburguesaBuilder {
    protected Hamburguesa hamburguesa;
    
    //Regresar el producto Hamburguesa una
    //vez este construido
    public Hamburguesa getHamburguesa(){
        return hamburguesa;
    }
    public void crearNuevaHamburguesa(){
        hamburguesa=new Hamburguesa();
    }
    //Metodos que deben implementar las
    //clases que heredan HambuguesaBuilder
     public abstract void escogerPan();
     public abstract void prepararCarne();
     public abstract void ponerCoberturas();
}
