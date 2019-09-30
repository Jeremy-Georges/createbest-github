
# Your discussion about testing

This is where you should provide a description in
[GitHub Markdown](https://guides.github.com/features/mastering-markdown/)
that clearly describes:

* how you did the tests,



```
Pour �ffectuer les tests, je fait appel � chaque m�thode
un nombre de 100000 fois, tout en conservant le temps �coul�
pour l'�x�cution de chaques m�thodes. Ensuite je r�p�te 
la m�me proc�dure un nombre de 1000 fois. Et finalement,
je calcule la dur�e moyenne du temps pass� pour
l'accomplissement de chaques m�thodes.
Cel� est effectu� par la r�p�tition du bloc de code
ci-bas


	    d�but = 0; fin = 0; tempsEcoul� = 0; temporaire = 0; dur�e = 0;
	    
	    for(int j=0; j<ITERATION_LOOP_EXETRNE; j++) {
	    	
	    	for (int i=0; i<ITERATION_LOOP_INTERNE; i++) {
	    		d�but = System.currentTimeMillis();
	    	    //appel de la m�thode;
	    	    fin = System.currentTimeMillis();
	    	
	    	    tempsEcoul� += fin - d�but;
	    	    }
	    	temporaire += (tempsEcoul� / ITERATION_LOOP_INTERNE);
	    }
	    
		dur�e = (temporaire / ITERATION_LOOP_EXETRNE);
		System.out.println("Appel � la m�thode *** a une durr�e moyenne de "+dur�e+" millisecondes");
```



* sample outputs from running the tests



```
**************************************************
Testing PointCPDesign2
**************************************************
Les valeurs des coordonn�es polaire g�n�r�es sont rho = 69 et theta = 34
Avec pour point Polaire [69.0,34.0]
Appel � la m�thode getX() a une durr�e moyenne de 0.006861490000000004 millisecondes
Appel � la m�thode getY() a une durr�e moyenne de 0.0055251699999999985 millisecondes
Appel � la m�thode getRho() a une durr�e moyenne de 0.00450908 millisecondes
Appel � la m�thode getTheta() a une durr�e moyenne de 0.0048774099999999996 millisecondes
Appel � la m�thode convertStorageToPolar() a une durr�e moyenne de 0.004572820000000004 millisecondes
Appel � la m�thode convertStorageToCartesian() a une durr�e moyenne de 0.0052257800000000045 millisecondes
Appel � la m�thode getDistance(premierPoint(81,23)) a une durr�e moyenne de 0.005438660000000004 millisecondes
Appel � la m�thode rotatePoint(92) a une durr�e moyenne de 0.07641898999999998 millisecondes
Appel � la m�thode toString() a une durr�e moyenne de 0.09851222000000005 millisecondes




**************************************************
Testing PointCPDesign3
**************************************************
Les valeurs des coordonn�es cart�sien g�n�r�es sont x = 39 et y = 19
Avec pour point Cart�sien  (39.0,19.0)
Appel � la m�thode getX() a une durr�e moyenne de 0.0050502700000000025 millisecondes
Appel � la m�thode getY() a une durr�e moyenne de 0.00515476 millisecondes
Appel � la m�thode getRho() a une durr�e moyenne de 0.004863440000000001 millisecondes
Appel � la m�thode getTheta() a une durr�e moyenne de 0.06331316999999993 millisecondes
Appel � la m�thode convertStorageToPolar() a une durr�e moyenne de 0.06274115 millisecondes
Appel � la m�thode convertStorageToCartesian() a une durr�e moyenne de 0.004512189999999999 millisecondes
Appel � la m�thode getDistance(deuxi�mePoint(37,75)) a une durr�e moyenne de 0.004988070000000005 millisecondes
Appel � la m�thode rotatePoint(87) a une durr�e moyenne de 0.07426671999999993 millisecondes
Appel � la m�thode toString() a une durr�e moyenne de 0.10333004999999987 millisecondes



**************************************************
Testing PointCPDesign6D2
**************************************************
Les valeurs des coordonn�es polaire g�n�r�es sont rho = 31 et theta = 68
Avec pour point Polaire [31.0,68.0]
Appel � la m�thode getX() a une durr�e moyenne de 0.023252879999999972 millisecondes
Appel � la m�thode getY() a une durr�e moyenne de 0.03580516999999996 millisecondes
Appel � la m�thode getRho() a une durr�e moyenne de 0.00335997 millisecondes
Appel � la m�thode getTheta() a une durr�e moyenne de 0.00428926 millisecondes
Appel � la m�thode convertStorageToPolar() a une durr�e moyenne de 0.00468118 millisecondes
Appel � la m�thode convertStorageToCartesian() a une durr�e moyenne de 0.05232749000000004 millisecondes
Appel � la m�thode getDistance(troisi�mePoint(10,95)) a une durr�e moyenne de 0.0855791100000001 millis second
Appel � la m�thode rotatePoint(96) a une durr�e moyenne de 0.12659402999999994 millisecondes
Appel � la m�thode toString() a une durr�e moyenne de 0.09554087000000003 millisecondes



**************************************************
Testing PointCPDesign6D3
**************************************************
Les valeurs des coordonn�es cart�sien g�n�r�es sont x = 50 et y = 39
Avec pour point Cart�sien  (50.0,39.0)
Appel � la m�thode getX() a une durr�e moyenne de 0.004058610000000002 millisecondes
Appel � la m�thode getY() a une durr�e moyenne de 0.004440280000000002 millisecondes
Appel � la m�thode getRho() a une durr�e moyenne de 0.00395467 millisecondes
Appel � la m�thode getTheta() a une durr�e moyenne de 0.06554626999999992 millisecondes
Appel � la m�thode convertStorageToPolar() a une durr�e moyenne de 0.07286790999999998 millisecondes
Appel � la m�thode convertStorageToCartesian() a une durr�e moyenne de 0.004947880000000001 millisecondes
Appel � la m�thode getDistance(quatri�mePoint(85,4)) a une durr�e moyenne de 0.004698169999999998 millisecondes
Appel � la m�thode rotatePoint(19) a une durr�e moyenne de 0.875507207390855 millisecondes
Appel � la m�thode toString() a une durr�e moyenne de 22.450518920175245 millisecondes
```

* the table and



|           M�thodes          | PointCPDesign2 (vitesse moyenne pour �x�cuter  une m�thode en milliseconde) | PointCPDesign3 (vitesse moyenne pour �x�cuter une m�thode en milliseconde) | PointCPDesign6D2 (vitesse moyenne pour �x�cuter une m�thode en milliseconde) | PointCPDesign6D3 (vitesse moyenne pour �x�cuter une m�thode en milliseconde) |
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
PointCPDesign2 m�morise les coordonn�es polaire seulement.

Pour la classe PointCPDesign2 on remarque les temps d'ex�cution suivant en millisecond:
getRho() = 0.0045                  /   getX() = 0.0068
getTheta() = 0.0048                /   getY() = 0.0055
convertStorageToPolar() = 0.0045   /   convertStorageToCartesian() = 0.0052

Il est indiqu� que les m�thodes getRho(), getTheta(), et convertStorageToPolar()
prennent moins de temps d'ex�cution que les m�thodes getX(), getY(), et
convertStorageToCartesian(). Cel� est d� � la conversion des coordonn�es polraie
� cart�sien durant l'ex�cution des m�thodes getX(), getY(), et 
convertStorageToCartesian().
Il s'en suit que la classe PointCPDesign2 est l�g�rement moins �fficace 
� traiter les donn�es en coordonn�es cartesien (tel qu'indiqu� dans E26).
```



```
PointCPDesign3 m�morise les coordonn�es cart�sien seulement.

Pour la classe PointCPDesign3 on remarque les temps d'ex�cution suivant en millisecond:
getX() = 0.0050                       /   getRho() = 0.0048
getY() = 0.0051                       /   getTheta() = 0.0633
convertStorageToCartesian() = 0.0045  /   convertStorageToPolar() = 0.0627 

Il est indiqu� que les m�thodes getX(), getY(), et convertStorageToCartesian()
prennent moins de temps d'ex�cution que les m�thodes getTheta(), et
convertStorageToPolar(). Cel� est d� � la conversion des coordonn�es cart�sien
� polaire durant l'ex�cution des m�thodes getTheta(), et convertStorageToPolar().
Il s'en suit que la classe PointCPDesign3 est l�g�rement moins �fficace 
� traiter les donn�es en coordonn�es polaire (tel qu'indiqu� dans E26).
```



```
PointCPDesign6D2 m�morise les coordonn�es polaire seulement,
et implemente l'interfaceDesign6.

Pour la classe PointCPDesign6D2 on remarque les temps d'ex�cution suivant en millisecond:
getRho() = 0.0033                  /   getX() = 0.0232
getTheta() = 0.0042                /   getY() = 0.0358
convertStorageToPolar() = 0.0046   /   convertStorageToCartesian() = 0.0523

Il est indiqu� que les m�thodes getRho(), getTheta(), et convertStorageToPolar()
prennent moins de temps d'ex�cution que les m�thodes getX(), getY(), et
convertStorageToCartesian(). Cel� est d� � la conversion des coordonn�es polraie
� cart�sien durant l'ex�cution des m�thodes getX(), getY(), et 
convertStorageToCartesian().
Toutefois la classe PointCPDesign6D2 permet efficacement de g�n�rer
des coordonn�es polaire qui sont trait�es avec le m�me temps que dans
la classe PointCPDesign2. Ceci v�rifie l'argument en avangate indiqu� dans E26.
```



```
PointCPDesign6D3 m�morise les coordonn�es cart�sien seulement,
et implemente l'interfaceDesign6.

Pour la classe PointCPDesign3 on remarque les temps d'ex�cution suivant en millisecond:
getX() = 0.0040                       /   getRho() = 0.0039
getY() = 0.0044                       /   getTheta() = 0.0655
convertStorageToCartesian() = 0.0049  /   convertStorageToPolar() = 0.0728 

Il est indiqu� que les m�thodes getX(), getY(), et convertStorageToCartesian()
prennent moins de temps d'ex�cution que les m�thodes getTheta(), et
convertStorageToPolar(). Cel� est d� � la conversion des coordonn�es cart�sien
� polaire durant l'ex�cution des m�thodes getTheta(), et convertStorageToPolar().
Toutefois la classe PointCPDesign6D3 permet efficacement de g�n�rer
des coordonn�es cart�sien qui sont trait�es avec le m�me temps
que dans la classe PointCPDesign3. Ceci v�rifie l'argument en avangate indiqu� dans E26.
```
