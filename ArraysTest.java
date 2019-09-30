import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util. Iterator;


/**
 * Cette classe test les performances de ArrayList, LinkedList, et array.
 */
public class ArraysTest {

	public static void main(String[] args) {
		
		final int CAPACITE = 19099900;         //nombre d'�l�ments pour peupler arrayList, linkedList, et array
		final int ITERATION = 2;               //nombre d'it�rations pour repeupler arrayList, linkedList, et array
		
		ArrayList<Float> arrayList;            //instance de ArrayList<Float>
	    LinkedList<Float> linkedList;          //instance de LinkedList<Float>
	    float[] array;                         //instance de float[]
		Random rand;                           //pour g�n�rer des float al�atoire de 0.0 � 9.0
		
		double d�but;
		double fin;
		double tempsEcoul�;                            
		double dur�e;                          //dur�e moyenne pour peupler arrayList, linkedList, ou array
		
		arrayList = new ArrayList<Float>();
		linkedList = new LinkedList<Float>();
		array = new float[CAPACITE];
		rand = new Random();
		
		
		
		
		
		//******************** peupler arrayList, linkedList, et array ********************
		System.out.println("**********************************************************");
		System.out.println("Peupler arrayList, linkedList, et array");
	    System.out.println("**********************************************************");
		
		//arrayList
		d�but = 0 ; fin = 0 ; tempsEcoul� = 0 ; dur�e = 0;
		
		for(int j=0 ;j<ITERATION; j++) {
			
			arrayList.clear();
			
			d�but = System.currentTimeMillis();
			
			//ajoute des float de 0.0 � 9.0  dans arrayList
			for(int i=0; i<CAPACITE; i++) {
				arrayList.add(10 * rand.nextFloat());
				}
			
			fin = System.currentTimeMillis();
			
			tempsEcoul� += fin - d�but;
			
		}
		
		dur�e = tempsEcoul� / ITERATION;
		
		System.out.println("La dur�e moyenne pour peupler la arrayList avec "+CAPACITE+
				           " �l�ments est de "+ dur�e/1000 +" secondes");
		
		
		
		//linkedList
		d�but = 0 ; fin = 0 ; tempsEcoul� = 0 ; dur�e = 0;
		
		for(int j=0; j<ITERATION; j++) {
			
			linkedList.clear();
			
			d�but = System.currentTimeMillis();
			
			//ajoute des float de 0.0 � 9.0 dans linkedList
			for(int i=0; i<CAPACITE; i++) {
				linkedList.add(10 * rand.nextFloat());
				}
			
			fin = System.currentTimeMillis();
			
			tempsEcoul� += fin - d�but;
		}
		
		dur�e = tempsEcoul� / ITERATION;
		System.out.println("La dur�e moyenne pour peupler la linkedList avec "+CAPACITE+
				           " �l�ments est de "+ dur�e/1000 +" secondes");
		
		
		
		//array
	    d�but = 0 ; fin = 0 ; tempsEcoul� = 0 ; dur�e = 0;
	    
	    for(int j=0; j<ITERATION; j++) {
	    	
			d�but = System.currentTimeMillis();
	    	
	    	//ajoute des float de 0.0 � 9.0 dans array
	    	for(int i=0; i<CAPACITE; i++) {
	    		array[i] = 10 * rand.nextFloat();
	    		}
	    	
	    	fin = System.currentTimeMillis();
			
			tempsEcoul� += fin - d�but;
	    }
	    
	    dur�e = tempsEcoul� / ITERATION;
		System.out.println("La dur�e moyenne pour peupler la array avec "+CAPACITE+
				           " �l�ments est de "+ dur�e/1000 +" secondes");
		
		
		
		
		
		//******************** addition des �l�ments dans arrayList, linkedList, et array ********************
		System.out.println("**********************************************************");
		System.out.println("Addition des �l�ments dans arrayList, linkedList, et array");
	    System.out.println("**********************************************************");
	    
	    //arrayList
	    Iterator<Float> it�rateur1;
	    float valeur1;
	    
	    d�but = 0 ; fin = 0 ; tempsEcoul� = 0 ; dur�e = 0;
	    
	    for(int j=0; j<ITERATION; j++) {
	    	
	    	it�rateur1 = arrayList.iterator();
	    	
	    	valeur1 = 0;
	    	
	    	d�but = System.currentTimeMillis();
	    	
	    	while(it�rateur1.hasNext()) {
	    		valeur1 += it�rateur1.next();
	    		}
	    	
	    	fin = System.currentTimeMillis();
	    	
	    	tempsEcoul� += fin - d�but;
	    }
	    
	    dur�e = tempsEcoul� / ITERATION ;
	    
	    System.out.println("La dur�e moyenne pour additionner "+CAPACITE+
		                   " �l�ments dans la arrayList est de "+ dur�e/1000 +" secondes");
	    
	    
	    
	  //linkedList
	    Iterator<Float> it�rateur2;
	    float valeur2;
	    
	    d�but = 0 ; fin = 0 ; tempsEcoul� = 0 ; dur�e = 0;
	    
	    for(int j=0; j<ITERATION; j++) {
	    	
	    	it�rateur2 = linkedList.iterator();
	    	
	    	valeur2 = 0;
	    	
	    	d�but = System.currentTimeMillis();
	    	
	    	while(it�rateur2.hasNext()) {
	    		valeur2 += it�rateur2.next();
	    		}
	    	
	    	fin = System.currentTimeMillis();
	    	
	    	tempsEcoul� += fin - d�but;
	    }
	    
	    dur�e = tempsEcoul� / ITERATION ;
	    
	    System.out.println("La dur�e moyenne pour additionner "+CAPACITE+
		                   " �l�ments dans la linkedList est de "+ dur�e/1000 +" secondes");
	    
	    
	    
	    //array
	    float valeur3;
	    
	    d�but = 0 ; fin = 0 ; tempsEcoul� = 0 ; dur�e = 0;
	    
	    for(int j=0; j<ITERATION; j++) {
	    	
	    	valeur3 = 0;
	    	
	    	d�but = System.currentTimeMillis();
	    	
	    	for(int i=0; i<array.length; i++) {
	    		valeur3 += array[i];
	    		}
	    	
	    	fin = System.currentTimeMillis();
	    	
	    	tempsEcoul� += fin - d�but;
	    }
	    
	    dur�e = tempsEcoul� / ITERATION ;
	    
	    System.out.println("La dur�e moyenne pour additionner "+CAPACITE+
		                   " �l�ments dans la array est de "+ dur�e/1000 +" secondes");
	    
	    
	    
	    

	}

}
