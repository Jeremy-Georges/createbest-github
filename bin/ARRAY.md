
* Commit your data about arrays here.



```
**********************************************************
Peupler arrayList, linkedList, et array
**********************************************************
La dur�e moyenne pour peupler la arrayList avec 19099900 �l�ments est de 8.042 secondes
La dur�e moyenne pour peupler la linkedList avec 19099900 �l�ments est de 29.255 secondes
La dur�e moyenne pour peupler la array avec 19099900 �l�ments est de 0.36 secondes

**********************************************************
Addition des �l�ments dans arrayList, linkedList, et array
**********************************************************
La dur�e moyenne pour additionner 19099900 �l�ments dans la arrayList est de 0.066 secondes
La dur�e moyenne pour additionner 19099900 �l�ments dans la linkedList est de 0.1615 secondes
La dur�e moyenne pour additionner 19099900 �l�ments dans la array est de 0.039 secondes
```



* Use suitable tables and draw conclusions
from an analysis of the data.



|                                               Dur�e                                              | arrayList | linkedList | array |
|:------------------------------------------------------------------------------------------------:|:---------:|:----------:|:-----:|
| Dur�e moyenne en seconde pour peupler arrayList, linkedList, et array  avec 19099900 �l�ments    |   8.042   |   29.255   |  0.36 |
| Dur�e moyenne en seconde pour additionner 19099900 �l�ments dans arrayList, linkedList, et array |   0.066   |   0.1615   | 0.039 |



```
Avant de proposer des conclusions, j'aimerai approter � votre attention que
j'utilise une moyenne de plus ou moins 8 secondes pour peupler la arrayList
� la place de 10 secondes comme indiqu� dans l'�nonc� du devoir.
Lorsque l'ex�cution prend 10 secondes pour ajouter des floats dans une ArrayList,
cette quantit� de floats g�nere dans linkedList 
un Java.lang.OutOfMemoryError: Java heap space.

Encore, arrayList et linkedList sont cr��s en leur ajoutant successivement des �l�ments
et en leur permettant de grandir.
```



```
Afin de tirer des conclusions en terme de vitesse de peuplement, on remarque que:

array, le plus rapide met 0.36 secondes pour �tre peupl� avec 19099900 �l�ments.
arrayList, le deuxieme plus rapide met 8.042 secondes pour �tre peupl� avec 19099900 �l�ments.
linkedList le plus lent, met 29.255 secondes pour �tre peupl� avec 19099900 �l�ments.
```



```
Afin de tirer des conclusions en terme de vitesse d'addition d'�l�ments, on remarque que:

array, le plus rapide met 0.039 secondes pour pour additonner 19099900 �l�ments dans sa m�moire.
arrayList, le deuxieme plus rapide met 0.066 secondes pour additonner 19099900 �l�ments dans sa m�moire.
linkedList le plus lent, met 0.1615 secondes pour additonner 19099900 �l�ments dans sa m�moire.
```



* From your conclusions,
develop recommendations to designers.



```
Pour recommendations, dans le choix des trois types de collections qui sont
ArrayList, LinkedList et une simple Array, la collection la plus rapide � tariter
de l'information est l'Array simple, ensuite l'ArrayList, et en derni�re position
la LinkedList.  
```
