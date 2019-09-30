import java.util.Random;

/**
 * Cette classe teste la performance de design 2, design 3 et design 6,
 * et reporte la durrée moyenne de traitement des données pour
 * les différentes méthodes retoruvées dans chacuns des design 2, 3 et 6.
 *
 */

public class PointCPTestPerformanceAnalysis {
	

	public static void main(String[] args) {
		
		final int ITERATION_LOOP_INTERNE = 100000;     //nombre de fois qu'une méthode est appelée
		final int ITERATION_LOOP_EXETRNE = 1000;       //répete l'itération ci-haut 
		
		double début;
		double fin;
		double tempsEcoulé;                            
		double temporaire;
		double durée;                                  //durée moyenne de l'éxecution d'une méthode
		
		Random rand;                                   //permet de générer des valeurs aléatoires
		
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
	    
	    System.out.println("Les valeurs des coordonnées polaire générées sont rho = "
	                       +value1+" et theta = "+value2);
	    System.out.println("Avec pour point "+pointDesign2.toString());
	    
	    
	    
	    //Test getX()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign2.getX();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getX() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getY()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign2.getY();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getY() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getRho()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign2.getRho();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getRho() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getTheta()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign2.getTheta();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getTheta() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test convertStorageToPolar()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign2 point = pointDesign2.convertStorageToPolar();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode convertStorageToPolar() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test convertStorageToCartesian()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign3 point = pointDesign2.convertStorageToCartesian();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode convertStorageToCartesian() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getDistance(PointCPDesign2 pointB)
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    int value3 = rand.nextInt(100);
		int value4 = rand.nextInt(100);
	    PointCPDesign2 premierPoint = new PointCPDesign2(value3, value4);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		double number = pointDesign2.getDistance(premierPoint);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getDistance(premierPoint("+value3+","+value4+
				           ")) a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		
		//Test rotatePoint(double rotation)
        début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
        int value5 = rand.nextInt(100);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign2 point = pointDesign2.rotatePoint(value5);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode rotatePoint("+value5+") a"
				           + " une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test toString()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    String string = pointDesign2.toString();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode toString() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		System.out.println("**************************************************");
		System.out.println("Testing PointCPDesign3");
	    System.out.println("**************************************************");
		
	    rand = new Random();
		int value6 = rand.nextInt(100);
		int value7 = rand.nextInt(100);
		
		pointDesign3 = new PointCPDesign3 (value6, value7);
	    
	    System.out.println("Les valeurs des coordonnées cartésien générées sont x = "
	                       +value6+" et y = "+value7);
	    System.out.println("Avec pour point "+pointDesign3.toString());
	    
	    
	    
	    //Test getX()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign3.getX();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getX() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getY()
		début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign3.getY();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getY() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getRho()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign3.getRho();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getRho() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getTheta()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign3.getTheta();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getTheta() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test convertStorageToPolar()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign2 point = pointDesign3.convertStorageToPolar();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode convertStorageToPolar() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test convertStorageToCartesian()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign3 point = pointDesign3.convertStorageToCartesian();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode convertStorageToCartesian() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getDistance(PointCPDesign3 pointB)
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    int value8 = rand.nextInt(100);
		int value9 = rand.nextInt(100);
	    PointCPDesign3 deuxièmePoint = new PointCPDesign3(value8, value9);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		double number = pointDesign3.getDistance(deuxièmePoint);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getDistance(deuxièmePoint("+value8+","+value9+
				           ")) a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test rotatePoint(double rotation)
        début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
        int value10 = rand.nextInt(100);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign3 point = pointDesign3.rotatePoint(value10);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode rotatePoint("+value10+") a"
				           + " une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test toString()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    String string = pointDesign3.toString();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode toString() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		System.out.println("**************************************************");
		System.out.println("Testing PointCPDesign6D2");
	    System.out.println("**************************************************");
		
	    rand = new Random();
		int value11 = rand.nextInt(100);
		int value12 = rand.nextInt(100);
		
		pointDesign6D2 = new PointCPDesign6D2 (value11, value12);
	    
	    System.out.println("Les valeurs des coordonnées polaire générées sont rho = "
	                       +value11+" et theta = "+value12);
	    System.out.println("Avec pour point "+pointDesign6D2.toString());
	    
	    
	    
	    //Test getX()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign6D2.getX();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getX() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getY()
		début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign6D2.getY();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getY() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getRho()
		début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign6D2.getRho();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getRho() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getTheta()
		début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign6D2.getTheta();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getTheta() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test convertStorageToPolar()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign6D2 point = pointDesign6D2.convertStorageToPolar();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode convertStorageToPolar() a une durrée moyenne de "+durée+" millisecondes");
	    
	    
	    
		//Test convertStorageToCartesian()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign6D3 point = pointDesign6D2.convertStorageToCartesian();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode convertStorageToCartesian() a une durrée moyenne de "+durée+" millisecondes");
	    
		
		
		//Test getDistance(PointCPDesign6D2 pointB)
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    int value13 = rand.nextInt(100);
		int value14 = rand.nextInt(100);
	    PointCPDesign6D2 troisièmePoint = new PointCPDesign6D2(value13, value14);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		double number = pointDesign6D2.getDistance(troisièmePoint);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getDistance(troisièmePoint("+value13+","+value14+
				           ")) a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test rotatePoint(double rotation)
        début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
        int value15 = rand.nextInt(100);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign6D2 point = pointDesign6D2.rotatePoint(value15);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode rotatePoint("+value15+") a"
				           + " une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test toString()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    String string = pointDesign6D2.toString();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode toString() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		System.out.println("**************************************************");
		System.out.println("Testing PointCPDesign6D3");
	    System.out.println("**************************************************");
		
	    rand = new Random();
		int value16 = rand.nextInt(100);
		int value17 = rand.nextInt(100);
		
		pointDesign6D3 = new PointCPDesign6D3 (value16, value17);
	    
	    System.out.println("Les valeurs des coordonnées cartésien générées sont x = "
	                       +value16+" et y = "+value17);
	    System.out.println("Avec pour point "+pointDesign6D3.toString());
	    
	    
	    
	    //Test getX
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign6D3.getX();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getX() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getY 
		début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign6D3.getY();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getY() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getRho
		début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign6D3.getRho();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getRho() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getTheta
		début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    double number = pointDesign6D3.getTheta();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getTheta() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test convertStorageToPolar()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign6D2 point = pointDesign6D3.convertStorageToPolar();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode convertStorageToPolar() a une durrée moyenne de "+durée+" millisecondes");
	    
		
		
		//Test convertStorageToCartesian()
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign6D3 point = pointDesign6D3.convertStorageToCartesian();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode convertStorageToCartesian() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test getDistance(PointCPDesign6D2 pointB)
	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    int value18 = rand.nextInt(100);
		int value19 = rand.nextInt(100);
	    PointCPDesign6D3 quatrièmePoint = new PointCPDesign6D3(value18, value19);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		double number = pointDesign6D3.getDistance(quatrièmePoint);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode getDistance(quatrièmePoint("+value18+","+value19+
				           ")) a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test rotatePoint(double rotation)
        début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
        int value20 = rand.nextInt(100);
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    		PointCPDesign6D3 point = pointDesign6D3.rotatePoint(value20);
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	tempsEcoulé += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (tempsEcoulé / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode rotatePoint("+value20+") a"
				           + " une durrée moyenne de "+durée+" millisecondes");
		
		
		
		//Test toString()
	    début = 0; fin = 0; tempsEcoulé = 0; tempsEcoulé = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    String string = pointDesign6D3.toString();
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	tempsEcoulé += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (tempsEcoulé / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode toString() a une durrée moyenne de "+durée+" millisecondes");
		
		
		
		
	}
	
}
