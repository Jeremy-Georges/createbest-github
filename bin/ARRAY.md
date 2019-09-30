
* Commit your data about arrays here.



```
**********************************************************
Peupler arrayList, linkedList, et array
**********************************************************
La durée moyenne pour peupler la arrayList avec 19099900 éléments est de 8.042 secondes
La durée moyenne pour peupler la linkedList avec 19099900 éléments est de 29.255 secondes
La durée moyenne pour peupler la array avec 19099900 éléments est de 0.36 secondes

**********************************************************
Addition des éléments dans arrayList, linkedList, et array
**********************************************************
La durée moyenne pour additionner 19099900 éléments dans la arrayList est de 0.066 secondes
La durée moyenne pour additionner 19099900 éléments dans la linkedList est de 0.1615 secondes
La durée moyenne pour additionner 19099900 éléments dans la array est de 0.039 secondes
```



* Use suitable tables and draw conclusions
from an analysis of the data.



|                                               Durée                                              | arrayList | linkedList | array |
|:------------------------------------------------------------------------------------------------:|:---------:|:----------:|:-----:|
| Durée moyenne en seconde pour peupler arrayList, linkedList, et array  avec 19099900 éléments    |   8.042   |   29.255   |  0.36 |
| Durée moyenne en seconde pour additionner 19099900 éléments dans arrayList, linkedList, et array |   0.066   |   0.1615   | 0.039 |



```
Avant de proposer des conclusions, j'aimerai approter à votre attention que
j'utilise une moyenne de plus ou moins 8 secondes pour peupler la arrayList
à la place de 10 secondes comme indiqué dans l'énoncé du devoir.
Lorsque l'exécution prend 10 secondes pour ajouter des floats dans une ArrayList,
cette quantité de floats génere dans linkedList 
un Java.lang.OutOfMemoryError: Java heap space.

Encore, arrayList et linkedList sont créés en leur ajoutant successivement des éléments
et en leur permettant de grandir.
```



```
Afin de tirer des conclusions en terme de vitesse de peuplement, on remarque que:

array, le plus rapide met 0.36 secondes pour être peuplé avec 19099900 éléments.
arrayList, le deuxieme plus rapide met 8.042 secondes pour être peuplé avec 19099900 éléments.
linkedList le plus lent, met 29.255 secondes pour être peuplé avec 19099900 éléments.
```



```
Afin de tirer des conclusions en terme de vitesse d'addition d'éléments, on remarque que:

array, le plus rapide met 0.039 secondes pour pour additonner 19099900 éléments dans sa mémoire.
arrayList, le deuxieme plus rapide met 0.066 secondes pour additonner 19099900 éléments dans sa mémoire.
linkedList le plus lent, met 0.1615 secondes pour additonner 19099900 éléments dans sa mémoire.
```



* From your conclusions,
develop recommendations to designers.



```
Pour recommendations, dans le choix des trois types de collections qui sont
ArrayList, LinkedList et une simple Array, la collection la plus rapide à tariter
de l'information est l'Array simple, ensuite l'ArrayList, et en dernière position
la LinkedList.  
```
