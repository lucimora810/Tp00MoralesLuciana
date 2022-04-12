package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp00MoralesLucianaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00MoralesLucianaApplication.class, args);
	}

	
}

paquete  ar . educación _ unju _ educación _ aplicación ;

importar  ar . educación _ unju _ edm . modelo _ calculadora ;
//importar ar.edu.unju.edm.modelo.Estudiante;

importar  organización . estructura de resorte . bota _ Aplicación Primavera ;
importar  organización . estructura de resorte . bota _ autoconfigurar _ Aplicación SpringBoot ;

@SpringBootApplication _
public  class  Tpn00QuinterosmarcosApplication {

	public  static  void  main ( String [] args ) {
		
		SpringAplicattion.run(Tp00MoralesLucianaAplicattion.class, args);

	     Calculadora unCalculadora = new Calculadora  ( ); 
	    DesCalculadora . conjuntoNúmero1 ( 10 );
	    DesCalculadora . conjuntoNumero2 ( 2 );
	    sistema _ fuera _ println ( "El resultado de la Suma es: " + unCalculadora . ResolverSuma ());
	    sistema _ fuera _ println ( "El resultado de la Resta es: " + unCalculadora . ResolverResta ());
	    sistema _ fuera _ println ( "El resultado de la Multiplicacion es: " + unCalculadora . ResolverMulti ());
	    sistema _ fuera _ println ( "El resultado de la Division es: " + unCalculadora . ResolverDivision ());
	    sistema _ fuera _ println ( "El resultado de la Potencia es: " + unCalculadora . ResolverPotencia ());
	    sistema _ fuera _ println ( "El resultado de la Division es: " + unCalculadora . ResolverRaiz ());

	
	}


}
