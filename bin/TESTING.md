
# Your discussion about testing

This is where you should provide a description in
[GitHub Markdown](https://guides.github.com/features/mastering-markdown/)
that clearly describes:

* how you did the tests,



```
Pour éffectuer les tests, je fait appel à chaque méthode
un nombre de 100000 fois, tout en conservant le temps écoulé
pour l'éxécution de chaques méthodes. Ensuite je répète 
la même procédure un nombre de 1000 fois. Et finalement,
je calcule la durée moyenne du temps passé pour
l'accomplissement de chaques méthodes.
Celà est effectué par la répétition du bloc de code
ci-bas


	    début = 0; fin = 0; tempsEcoulé = 0; temporaire = 0; durée = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		début = System.currentTimeMillis();
	    	    //appel de la méthode;
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoulé += fin - début;
	    	    }
	    	temporaire += (tempsEcoulé / ITERATION_LOOP_INTERNE);
	    }
	    
		durée = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel à la méthode *** a une durrée moyenne de "+durée+" millisecondes");
```



* sample outputs from running the tests



```
**************************************************
Testing PointCPDesign2
**************************************************
Les valeurs des coordonnées polaire générées sont rho = 69 et theta = 34
Avec pour point Polaire [69.0,34.0]
Appel à la méthode getX() a une durrée moyenne de 0.006861490000000004 millisecondes
Appel à la méthode getY() a une durrée moyenne de 0.0055251699999999985 millisecondes
Appel à la méthode getRho() a une durrée moyenne de 0.00450908 millisecondes
Appel à la méthode getTheta() a une durrée moyenne de 0.0048774099999999996 millisecondes
Appel à la méthode convertStorageToPolar() a une durrée moyenne de 0.004572820000000004 millisecondes
Appel à la méthode convertStorageToCartesian() a une durrée moyenne de 0.0052257800000000045 millisecondes
Appel à la méthode getDistance(premierPoint(81,23)) a une durrée moyenne de 0.005438660000000004 millisecondes
Appel à la méthode rotatePoint(92) a une durrée moyenne de 0.07641898999999998 millisecondes
Appel à la méthode toString() a une durrée moyenne de 0.09851222000000005 millisecondes




**************************************************
Testing PointCPDesign3
**************************************************
Les valeurs des coordonnées cartésien générées sont x = 39 et y = 19
Avec pour point Cartésien  (39.0,19.0)
Appel à la méthode getX() a une durrée moyenne de 0.0050502700000000025 millisecondes
Appel à la méthode getY() a une durrée moyenne de 0.00515476 millisecondes
Appel à la méthode getRho() a une durrée moyenne de 0.004863440000000001 millisecondes
Appel à la méthode getTheta() a une durrée moyenne de 0.06331316999999993 millisecondes
Appel à la méthode convertStorageToPolar() a une durrée moyenne de 0.06274115 millisecondes
Appel à la méthode convertStorageToCartesian() a une durrée moyenne de 0.004512189999999999 millisecondes
Appel à la méthode getDistance(deuxièmePoint(37,75)) a une durrée moyenne de 0.004988070000000005 millisecondes
Appel à la méthode rotatePoint(87) a une durrée moyenne de 0.07426671999999993 millisecondes
Appel à la méthode toString() a une durrée moyenne de 0.10333004999999987 millisecondes



**************************************************
Testing PointCPDesign6D2
**************************************************
Les valeurs des coordonnées polaire générées sont rho = 31 et theta = 68
Avec pour point Polaire [31.0,68.0]
Appel à la méthode getX() a une durrée moyenne de 0.023252879999999972 millisecondes
Appel à la méthode getY() a une durrée moyenne de 0.03580516999999996 millisecondes
Appel à la méthode getRho() a une durrée moyenne de 0.00335997 millisecondes
Appel à la méthode getTheta() a une durrée moyenne de 0.00428926 millisecondes
Appel à la méthode convertStorageToPolar() a une durrée moyenne de 0.00468118 millisecondes
Appel à la méthode convertStorageToCartesian() a une durrée moyenne de 0.05232749000000004 millisecondes
Appel à la méthode getDistance(troisièmePoint(10,95)) a une durrée moyenne de 0.0855791100000001 millis second
Appel à la méthode rotatePoint(96) a une durrée moyenne de 0.12659402999999994 millisecondes
Appel à la méthode toString() a une durrée moyenne de 0.09554087000000003 millisecondes



**************************************************
Testing PointCPDesign6D3
**************************************************
Les valeurs des coordonnées cartésien générées sont x = 50 et y = 39
Avec pour point Cartésien  (50.0,39.0)
Appel à la méthode getX() a une durrée moyenne de 0.004058610000000002 millisecondes
Appel à la méthode getY() a une durrée moyenne de 0.004440280000000002 millisecondes
Appel à la méthode getRho() a une durrée moyenne de 0.00395467 millisecondes
Appel à la méthode getTheta() a une durrée moyenne de 0.06554626999999992 millisecondes
Appel à la méthode convertStorageToPolar() a une durrée moyenne de 0.07286790999999998 millisecondes
Appel à la méthode convertStorageToCartesian() a une durrée moyenne de 0.004947880000000001 millisecondes
Appel à la méthode getDistance(quatrièmePoint(85,4)) a une durrée moyenne de 0.004698169999999998 millisecondes
Appel à la méthode rotatePoint(19) a une durrée moyenne de 0.875507207390855 millisecondes
Appel à la méthode toString() a une durrée moyenne de 22.450518920175245 millisecondes
```

* the table and



|           Méthodes          | PointCPDesign2 (vitesse moyenne pour éxécuter  une méthode en milliseconde) | PointCPDesign3 (vitesse moyenne pour éxécuter une méthode en milliseconde) | PointCPDesign6D2 (vitesse moyenne pour éxécuter une méthode en milliseconde) | PointCPDesign6D3 (vitesse moyenne pour éxécuter une méthode en milliseconde) |
|:---------------------------:|:---------------------------------------------------------------------------:|:--------------------------------------------------------------------------:|:----------------------------------------------------------------------------:|:----------------------------------------------------------------------------:|
|            getX()           |                             0.006861490000000004                            |                            0.0050502700000000025                           |                             0.023252879999999972                             |                             0.004058610000000002                             |
|            getY()           |                            0.0055251699999999985                            |                                 0.00515476                                 |                              0.03580516999999996                             |                             0.004440280000000002                             |
|           getRho()          |                                  0.00450908                                 |                            0.004863440000000001                            |                                  0.00335997                                  |                                  0.00395467                                  |
|          getTheta()         |                            0.0048774099999999996                            |                             0.06331316999999993                            |                                  0.00428926                                  |                              0.06554626999999992                             |
|   convertStorageToPolar()   |                             0.004572820000000004                            |                                 0.06274115                                 |                                  0.00468118                                  |                              0.07286790999999998                             |
| convertStorageToCartesian() |                            0.0052257800000000045                            |                            0.004512189999999999                            |                              0.05232749000000004                             |                             0.004947880000000001                             |
|     getDistance(pointB)     |                             0.005438660000000004                            |                            0.004988070000000005                            |                              0.0855791100000001                              |                             0.004698169999999998                             |
|    rotatePoint(rotation)    |                             0.07641898999999998                             |                             0.07426671999999993                            |                              0.12659402999999994                             |                               0.875507207390855                              |
|          toString()         |                             0.09851222000000005                             |                             0.10333004999999987                            |                              0.09554087000000003                             |                              22.450518920175245                              |



* a discussion of the results.



```
PointCPDesign2 mémorise les coordonnées polaire seulement.

Pour la classe PointCPDesign2 on remarque les temps d'exécution suivant en millisecond:
getRho() = 0.0045                  /   getX() = 0.0068
getTheta() = 0.0048                /   getY() = 0.0055
convertStorageToPolar() = 0.0045   /   convertStorageToCartesian() = 0.0052

Il est indiqué que les méthodes getRho(), getTheta(), et convertStorageToPolar()
prennent moins de temps d'exécution que les méthodes getX(), getY(), et
convertStorageToCartesian(). Celà est dû à la conversion des coordonnées polraie
à cartésien durant l'exécution des méthodes getX(), getY(), et 
convertStorageToCartesian().
Il s'en suit que la classe PointCPDesign2 est légèrement moins éfficace 
à traiter les données en coordonnées cartesien (tel qu'indiqué dans E26).
```



```
PointCPDesign3 mémorise les coordonnées cartésien seulement.

Pour la classe PointCPDesign3 on remarque les temps d'exécution suivant en millisecond:
getX() = 0.0050                       /   getRho() = 0.0048
getY() = 0.0051                       /   getTheta() = 0.0633
convertStorageToCartesian() = 0.0045  /   convertStorageToPolar() = 0.0627 

Il est indiqué que les méthodes getX(), getY(), et convertStorageToCartesian()
prennent moins de temps d'exécution que les méthodes getTheta(), et
convertStorageToPolar(). Celà est dû à la conversion des coordonnées cartésien
à polaire durant l'exécution des méthodes getTheta(), et convertStorageToPolar().
Il s'en suit que la classe PointCPDesign3 est légèrement moins éfficace 
à traiter les données en coordonnées polaire (tel qu'indiqué dans E26).
```



```
PointCPDesign6D2 mémorise les coordonnées polaire seulement,
et implemente l'interfaceDesign6.

Pour la classe PointCPDesign6D2 on remarque les temps d'exécution suivant en millisecond:
getRho() = 0.0033                  /   getX() = 0.0232
getTheta() = 0.0042                /   getY() = 0.0358
convertStorageToPolar() = 0.0046   /   convertStorageToCartesian() = 0.0523

Il est indiqué que les méthodes getRho(), getTheta(), et convertStorageToPolar()
prennent moins de temps d'exécution que les méthodes getX(), getY(), et
convertStorageToCartesian(). Celà est dû à la conversion des coordonnées polraie
à cartésien durant l'exécution des méthodes getX(), getY(), et 
convertStorageToCartesian().
Toutefois la classe PointCPDesign6D2 permet efficacement de générer
des coordonnées polaire qui sont traitées avec le même temps que dans
la classe PointCPDesign2. Ceci vérifie l'argument en avangate indiqué dans E26.
```



```
PointCPDesign6D3 mémorise les coordonnées cartésien seulement,
et implemente l'interfaceDesign6.

Pour la classe PointCPDesign3 on remarque les temps d'exécution suivant en millisecond:
getX() = 0.0040                       /   getRho() = 0.0039
getY() = 0.0044                       /   getTheta() = 0.0655
convertStorageToCartesian() = 0.0049  /   convertStorageToPolar() = 0.0728 

Il est indiqué que les méthodes getX(), getY(), et convertStorageToCartesian()
prennent moins de temps d'exécution que les méthodes getTheta(), et
convertStorageToPolar(). Celà est dû à la conversion des coordonnées cartésien
à polaire durant l'exécution des méthodes getTheta(), et convertStorageToPolar().
Toutefois la classe PointCPDesign6D3 permet efficacement de générer
des coordonnées cartésien qui sont traitées avec le même temps
que dans la classe PointCPDesign3. Ceci vérifie l'argument en avangate indiqué dans E26.
```
