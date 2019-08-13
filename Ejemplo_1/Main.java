public class Main {
    public static void main(String[] args) {
      //Crea el objeto ConcesionarioDirector
      //La encargada del proceso de construccion de los carros
       ConcesionarioDirector fabrica=new ConcesionarioDirector();
       
       //Se crean los constructores de los carros
       //dependiendo del equipamiento
       CarroBuilder EquipamientoBasico= new ConstructorCarroBasico();
       CarroBuilder EquipamientoMedio= new ConstructorCarroMedio();
       CarroBuilder EquipamientoFull= new ConstructorCarroFull();
       
       //Se mandan a construir el equipamento de los carros
       //a la clase ConcesionarioDirector
       
       //Para el equipamento Básico
       fabrica.construir(EquipamientoBasico);
       //Se obtiene el carro con el equipamiento Basico
       Carro carroBasico=EquipamientoBasico.getCarro();
       
        //Para el equipamento Medio
       fabrica.construir(EquipamientoMedio);
       //Se crea obtiene el carro con el equipamiento Medio
       Carro carroMedio=EquipamientoMedio.getCarro();
       
        //Para el equipamento Full
       fabrica.construir(EquipamientoFull);
       //Se crea obtiene el carro con el equipamiento Full
       Carro carroFull=EquipamientoFull.getCarro();
       
       //Imprimir caracteristicas de los carros
       caracteristicasCarros(carroBasico);
       caracteristicasCarros(carroMedio);
       caracteristicasCarros(carroFull);
    }
    public static void caracteristicasCarros(Carro carro){
        System.out.println( "Motor: " + carro.getMotor() );
        System.out.println( "Carrocería: " + carro.getCarroceria() );
        System.out.println( "Elevalunas eléctrico: " + carro.getElevalunasElec() );
        System.out.println( "Airea acondicionado: " + carro.getAireAcond() );
        System.out.println("**************************************************");
    }
}
