import java.util.Random;

/**
 * Cette classe teste la performance de design 2, design 3 et design 6,
 * et reporte la durr�e moyenne de traitement des donn�es pour
 * les diff�rentes m�thodes retoruv�es dans chacuns des design 2, 3 et 6.
 *
 */

public class PointCPTestPerformanceAnalysis {
	

	public static void main(String[] args) {
		
		final int ITERATION_LOOP_INTERNE = 100000;     //nombre de fois qu'une m�thode est appel�e
		final int ITERATION_LOOP_EXETRNE = 1000;       //r�pete l'it�ration ci-haut 
		
		double d�but;
		double fin;
		double tempsEcoul�;                            
		double temporaire;
		double dur�e;                                  //dur�e moyenne de l'�xecution d'une m�thode
		
		Random rand;                                   //permet de g�n�rer des valeurs al�atoires
		
		PointCPDesign2 pointDesign2;                   //instance de la classe PointCPDesign2
		PointCPDesign3 pointDesign3;                   //instance de la classe PointCPDesign3
		PointCPDesign6D2 pointDesign6D2;               //instance de la classe PointCPDesign6D2
		PointCPDesign6D3 pointDesign6D3;               //instance de la classe PointCPDesign6D3
		
		
		
		System.out.println("**************************************************");
		System.out.println("Testing PointCPDesign2");
	    System.out.println("**************************************************");
	    
		rand = new Random();
		int value1 = rand.nextInt(100);
		int value2 = rand.nextInt(100);
		
	    pointDesign2 = new PointCPDesign2 (value1, value2);
	    
	    System.out.println("Les valeurs des coordonn�es polaire g�n�r�es sont rho = "
	                       +value1+" et theta = "+value2);
	    System.out.println("Avec pour point "+pointDesign2.toString());
	    
	    
	    
	    //Test getX()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign2.getX();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getX() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getY()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign2.getY();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getY() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getRho()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign2.getRho();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getRho() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getTheta()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign2.getTheta();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getTheta() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test convertStorageToPolar()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign2 point = pointDesign2.convertStorageToPolar();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode convertStorageToPolar() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test convertStorageToCartesian()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign3 point = pointDesign2.convertStorageToCartesian();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode convertStorageToCartesian() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getDistance(PointCPDesign2 pointB)
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    int value3 = rand.nextInt(100);
		int value4 = rand.nextInt(100);
	    PointCPDesign2 premierPoint = new PointCPDesign2(value3, value4);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		double number = pointDesign2.getDistance(premierPoint);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getDistance(premierPoint("+value3+","+value4+
				           ")) a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		
		//Test rotatePoint(double rotation)
        d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
        int value5 = rand.nextInt(100);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign2 point = pointDesign2.rotatePoint(value5);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode rotatePoint("+value5+") a"
				           + " une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test toString()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    String string = pointDesign2.toString();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode toString() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		System.out.println("**************************************************");
		System.out.println("Testing PointCPDesign3");
	    System.out.println("**************************************************");
		
	    rand = new Random();
		int value6 = rand.nextInt(100);
		int value7 = rand.nextInt(100);
		
		pointDesign3 = new PointCPDesign3 (value6, value7);
	    
	    System.out.println("Les valeurs des coordonn�es cart�sien g�n�r�es sont x = "
	                       +value6+" et y = "+value7);
	    System.out.println("Avec pour point "+pointDesign3.toString());
	    
	    
	    
	    //Test getX()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign3.getX();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getX() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getY()
		d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign3.getY();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getY() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getRho()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign3.getRho();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getRho() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getTheta()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign3.getTheta();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getTheta() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test convertStorageToPolar()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign2 point = pointDesign3.convertStorageToPolar();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode convertStorageToPolar() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test convertStorageToCartesian()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign3 point = pointDesign3.convertStorageToCartesian();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode convertStorageToCartesian() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getDistance(PointCPDesign3 pointB)
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    int value8 = rand.nextInt(100);
		int value9 = rand.nextInt(100);
	    PointCPDesign3 deuxi�mePoint = new PointCPDesign3(value8, value9);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		double number = pointDesign3.getDistance(deuxi�mePoint);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getDistance(deuxi�mePoint("+value8+","+value9+
				           ")) a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test rotatePoint(double rotation)
        d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
        int value10 = rand.nextInt(100);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign3 point = pointDesign3.rotatePoint(value10);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode rotatePoint("+value10+") a"
				           + " une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test toString()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    String string = pointDesign3.toString();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode toString() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		System.out.println("**************************************************");
		System.out.println("Testing PointCPDesign6D2");
	    System.out.println("**************************************************");
		
	    rand = new Random();
		int value11 = rand.nextInt(100);
		int value12 = rand.nextInt(100);
		
		pointDesign6D2 = new PointCPDesign6D2 (value11, value12);
	    
	    System.out.println("Les valeurs des coordonn�es polaire g�n�r�es sont rho = "
	                       +value11+" et theta = "+value12);
	    System.out.println("Avec pour point "+pointDesign6D2.toString());
	    
	    
	    
	    //Test getX()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign6D2.getX();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getX() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getY()
		d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign6D2.getY();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getY() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getRho()
		d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign6D2.getRho();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getRho() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getTheta()
		d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign6D2.getTheta();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getTheta() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test convertStorageToPolar()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign6D2 point = pointDesign6D2.convertStorageToPolar();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode convertStorageToPolar() a une durr�e moyenne de "+dur�e+" millisecondes");
	    
	    
	    
		//Test convertStorageToCartesian()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign6D3 point = pointDesign6D2.convertStorageToCartesian();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode convertStorageToCartesian() a une durr�e moyenne de "+dur�e+" millisecondes");
	    
		
		
		//Test getDistance(PointCPDesign6D2 pointB)
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    int value13 = rand.nextInt(100);
		int value14 = rand.nextInt(100);
	    PointCPDesign6D2 troisi�mePoint = new PointCPDesign6D2(value13, value14);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		double number = pointDesign6D2.getDistance(troisi�mePoint);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getDistance(troisi�mePoint("+value13+","+value14+
				           ")) a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test rotatePoint(double rotation)
        d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
        int value15 = rand.nextInt(100);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign6D2 point = pointDesign6D2.rotatePoint(value15);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode rotatePoint("+value15+") a"
				           + " une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test toString()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    String string = pointDesign6D2.toString();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode toString() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		System.out.println("**************************************************");
		System.out.println("Testing PointCPDesign6D3");
	    System.out.println("**************************************************");
		
	    rand = new Random();
		int value16 = rand.nextInt(100);
		int value17 = rand.nextInt(100);
		
		pointDesign6D3 = new PointCPDesign6D3 (value16, value17);
	    
	    System.out.println("Les valeurs des coordonn�es cart�sien g�n�r�es sont x = "
	                       +value16+" et y = "+value17);
	    System.out.println("Avec pour point "+pointDesign6D3.toString());
	    
	    
	    
	    //Test getX
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign6D3.getX();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getX() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getY 
		d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign6D3.getY();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getY() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getRho
		d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign6D3.getRho();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getRho() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getTheta
		d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    double number = pointDesign6D3.getTheta();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getTheta() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test convertStorageToPolar()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign6D2 point = pointDesign6D3.convertStorageToPolar();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode convertStorageToPolar() a une durr�e moyenne de "+dur�e+" millisecondes");
	    
		
		
		//Test convertStorageToCartesian()
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign6D3 point = pointDesign6D3.convertStorageToCartesian();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode convertStorageToCartesian() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test getDistance(PointCPDesign6D2 pointB)
	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    int value18 = rand.nextInt(100);
		int value19 = rand.nextInt(100);
	    PointCPDesign6D3 quatri�mePoint = new PointCPDesign6D3(value18, value19);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		double number = pointDesign6D3.getDistance(quatri�mePoint);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode getDistance(quatri�mePoint("+value18+","+value19+
				           ")) a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test rotatePoint(double rotation)
        d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
        int value20 = rand.nextInt(100);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    		PointCPDesign6D3 point = pointDesign6D3.rotatePoint(value20);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	tempsEcoul� += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (tempsEcoul� / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode rotatePoint("+value20+") a"
				           + " une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		//Test toString()
	    d�but = 0; fin = 0; tempsEcoul� = 0; tempsEcoul� = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    String string = pointDesign6D3.toString();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	tempsEcoul� += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (tempsEcoul� / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode toString() a une durr�e moyenne de "+dur�e+" millisecondes");
		
		
		
		
	}
	
}
