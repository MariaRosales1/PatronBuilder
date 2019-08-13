public class Main {
    public static void main(String[] args) {
        
        //El chef controla y gestiona la creacion de la hamburguesa
        ChefDirector chef=new ChefDirector();
        //Creamos los constructores de hamburguesa, dependiendo de su tipo
        HamburguesaBuilder americana=new AmericanaHamburguesaBuilder();
        HamburguesaBuilder vegetariana=new VegHamburguesaBuilder();
        
        //Le decimos al chef que prepare el tipo de hamburguesa
        //Que se desea crear
        chef.prepararHamburguesa(americana);
        chef.prepararHamburguesa(vegetariana);
        
        //Se obtiene la hamburguesa preparada
        Hamburguesa hamburguesaAmericana=americana.getHamburguesa();
        Hamburguesa hamburguesaVegetariana=vegetariana.getHamburguesa();
        
        //Se imprime las caracteristicas de cada hamburguesa
        caracteristicasHamburguesas(hamburguesaAmericana);
        caracteristicasHamburguesas(hamburguesaVegetariana);
    }
     public static void caracteristicasHamburguesas(Hamburguesa hamburguesa){
        String coberturas[]=hamburguesa.getCoberturas();
        System.out.println( "Coberturas: ");
        for (int i=0; i<coberturas.length; i++){
            if( i!=coberturas.length-1){
               System.out.print( coberturas[i]+ ", "); 
            }
            else{
               System.out.println( coberturas[i]);
            }
        }
        System.out.println( "Tipo de carne: " + hamburguesa.getTipoCarne() );
        System.out.println( "Tipo de pan: " + hamburguesa.getPan());
        System.out.println("**************************************************");
    }
}
