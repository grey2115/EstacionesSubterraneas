import java.util.*;
public class EstacionesSubterraneas {
	public static void main(String[] args) {
		String [] estaciones =  new String [] {"las heras","Santa Fe","Córdoba","Corrientes","Once - 30 de Diciembre","Venezuela","Humberto I","Inclán","Caseros","Parque Patricios","Hospitales"};
       String estacion1 = "";
       String estacion2 = "";
       
		for(int i=0;i<estaciones.length;i++){
			System.out.println(i +" - " + estaciones  [i]);
		}
       Scanner reader = new Scanner (System.in);  
	   System.out.println("Estacion Ingreso ");
	  int ei= reader.nextInt();

      
	   System.out.println("Estacion Destino ");
	  int ed= reader.nextInt();
	  
	  if(ei<=ed){
		  for (int i=ei;i<ed+1;i++){
			  System.out.println("Estacion Actual " + i +" - " + estaciones [i]);
			  System.out.println("Abrir Puertas ");
				 if (i==ed) {
				  	  System.out.println("fin de recorrido, estacion " + estaciones  [i]);
				 }
				 else {
					  System.out.println("proxima estacion " + (i+1) +" - " + estaciones  [i+1]);
				 }
		
		 	  System.out.println("(1- Ingresaste/permaneces en vagón / 2- bajaste del vagón) ");
			  int ingreso= reader.nextInt();
			  if (ingreso==2){
			  	  System.out.println("bajaste en estacion " + i +" - " + estaciones  [i]);
			  	  i=ed+1;
			  }
			  else {
				 if (i==ed+1) {
				  	  System.out.println("fin de recorrido, estacion " + estaciones  [i]);
				 }
			  }
			  
			  }
			  
	}
	  else {
		  for (int i=ei;i>ed-1;i--){
			  System.out.println("Estacion Actual " + i +" - " + estaciones [i]);
			  System.out.println("Abrir Puertas ");
				 if (i==ed) {
				  	  System.out.println("fin de recorrido, estacion " + estaciones  [i]);
				 }
				 else {
					  System.out.println("proxima estacion " + (i-1) +" - " + estaciones  [i-1]);
				 }
		
		 	  System.out.println("(1- Ingresaste/permaneces en vagón / 2- bajaste del vagón) ");
			  int ingreso= reader.nextInt();
			  if (ingreso==2){
			  	  System.out.println("bajaste en estacion " + i +" - " + estaciones  [i]);
			  	  i=ed-1;
			  }
			  else {
				 if (i==ed-1) {
				  	  System.out.println("fin de recorrido, estacion " + estaciones  [i]);
				 }
			  }
		  }
	   }
	}	
}						
							
			
			


