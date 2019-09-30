import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util. Iterator;


/**
 * Cette classe test les performances de ArrayList, LinkedList, et array.
 */
public class ArraysTest {

	public static void main(String[] args) {
		
		final int CAPACITE = 19099900;         //nombre d'éléments pour peupler arrayList, linkedList, et array
		final int ITERATION = 2;               //nombre d'itérations pour repeupler arrayList, linkedList, et array
		
		ArrayList<Float> arrayList;            //instance de ArrayList<Float>
	    LinkedList<Float> linkedList;          //instance de LinkedList<Float>
	    float[] array;                         //instance de float[]
		Random rand;                           //pour générer des float aléatoire de 0.0 à 9.0
		
		double début;
		double fin;
		double tempsEcoulé;                            
		double durée;                          //durée moyenne pour peupler arrayList, linkedList, ou array
		
		arrayList = new ArrayList<Float>();
		linkedList = new LinkedList<Float>();
		array = new float[CAPACITE];
		rand = new Random();
		
		
		
		
		
		//******************** peupler arrayList, linkedList, et array ********************
		System.out.println("**********************************************************");
		System.out.println("Peupler arrayList, linkedList, et array");
	    System.out.println("**********************************************************");
		
		//arrayList
		début = 0 ; fin = 0 ; tempsEcoulé = 0 ; durée = 0;
		
		for(int j=0 ;j<ITERATION; j++) {
			
			arrayList.clear();
			
			début = System.currentTimeMillis();
			
			//ajoute des float de 0.0 à 9.0  dans arrayList
			for(int i=0; i<CAPACITE; i++) {
				arrayList.add(10 * rand.nextFloat());
				}
			
			fin = System.currentTimeMillis();
			
			tempsEcoulé += fin - début;
			
		}
		
		durée = tempsEcoulé / ITERATION;
		
		System.out.println("La durée moyenne pour peupler la arrayList avec "+CAPACITE+
				           " éléments est de "+ durée/1000 +" secondes");
		
		
		
		//linkedList
		début = 0 ; fin = 0 ; tempsEcoulé = 0 ; durée = 0;
		
		for(int j=0; j<ITERATION; j++) {
			
			linkedList.clear();
			
			début = System.currentTimeMillis();
			
			//ajoute des float de 0.0 à 9.0 dans linkedList
			for(int i=0; i<CAPACITE; i++) {
				linkedList.add(10 * rand.nextFloat());
				}
			
			fin = System.currentTimeMillis();
			
			tempsEcoulé += fin - début;
		}
		
		durée = tempsEcoulé / ITERATION;
		System.out.println("La durée moyenne pour peupler la linkedList avec "+CAPACITE+
				           " éléments est de "+ durée/1000 +" secondes");
		
		
		
		//array
	    début = 0 ; fin = 0 ; tempsEcoulé = 0 ; durée = 0;
	    
	    for(int j=0; j<ITERATION; j++) {
	    	
			début = System.currentTimeMillis();
	    	
	    	//ajoute des float de 0.0 à 9.0 dans array
	    	for(int i=0; i<CAPACITE; i++) {
	    		array[i] = 10 * rand.nextFloat();
	    		}
	    	
	    	fin = System.currentTimeMillis();
			
			tempsEcoulé += fin - début;
	    }
	    
	    durée = tempsEcoulé / ITERATION;
		System.out.println("La durée moyenne pour peupler la array avec "+CAPACITE+
				           " éléments est de "+ durée/1000 +" secondes");
		
		
		
		
		
		//******************** addition des éléments dans arrayList, linkedList, et array ********************
		System.out.println("**********************************************************");
		System.out.println("Addition des éléments dans arrayList, linkedList, et array");
	    System.out.println("**********************************************************");
	    
	    //arrayList
	    Iterator<Float> itérateur1;
	    float valeur1;
	    
	    début = 0 ; fin = 0 ; tempsEcoulé = 0 ; durée = 0;
	    
	    for(int j=0; j<ITERATION; j++) {
	    	
	    	itérateur1 = arrayList.iterator();
	    	
	    	valeur1 = 0;
	    	
	    	début = System.currentTimeMillis();
	    	
	    	while(itérateur1.hasNext()) {
	    		valeur1 += itérateur1.next();
	    		}
	    	
	    	fin = System.currentTimeMillis();
	    	
	    	tempsEcoulé += fin - début;
	    }
	    
	    durée = tempsEcoulé / ITERATION ;
	    
	    System.out.println("La durée moyenne pour additionner "+CAPACITE+
		                   " éléments dans la arrayList est de "+ durée/1000 +" secondes");
	    
	    
	    
	  //linkedList
	    Iterator<Float> itérateur2;
	    float valeur2;
	    
	    début = 0 ; fin = 0 ; tempsEcoulé = 0 ; durée = 0;
	    
	    for(int j=0; j<ITERATION; j++) {
	    	
	    	itérateur2 = linkedList.iterator();
	    	
	    	valeur2 = 0;
	    	
	    	début = System.currentTimeMillis();
	    	
	    	while(itérateur2.hasNext()) {
	    		valeur2 += itérateur2.next();
	    		}
	    	
	    	fin = System.currentTimeMillis();
	    	
	    	tempsEcoulé += fin - début;
	    }
	    
	    durée = tempsEcoulé / ITERATION ;
	    
	    System.out.println("La durée moyenne pour additionner "+CAPACITE+
		                   " éléments dans la linkedList est de "+ durée/1000 +" secondes");
	    
	    
	    
	    //array
	    float valeur3;
	    
	    début = 0 ; fin = 0 ; tempsEcoulé = 0 ; durée = 0;
	    
	    for(int j=0; j<ITERATION; j++) {
	    	
	    	valeur3 = 0;
	    	
	    	début = System.currentTimeMillis();
	    	
	    	for(int i=0; i<array.length; i++) {
	    		valeur3 += array[i];
	    		}
	    	
	    	fin = System.currentTimeMillis();
	    	
	    	tempsEcoulé += fin - début;
	    }
	    
	    durée = tempsEcoulé / ITERATION ;
	    
	    System.out.println("La durée moyenne pour additionner "+CAPACITE+
		                   " éléments dans la array est de "+ durée/1000 +" secondes");
	    
	    
	    
	    

	}

}
