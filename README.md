**État actuel du projet :**

Le projet compile correctement, cependant la carte générée avec le bruit de Perlin ne fonctionne pas pour des tailles trop importantes. En effet, l'hygrométrie dépasse la plage de 0 à 1. De plus, une erreur "out of bound" se produit probablement en raison du tableau de mélange.

**Questions :**

1. Pourquoi l'attribut graine est-il final ?
   - Cela permet que la classe ne puisse pas être modifiée dans les sous-classes, évitant ainsi que la valeur soit modifiée par d'autres classes filles.

2. Réaliser l'architecture que prendrait la forme d'une telle modélisation sous forme d'un diagramme UML. Quelle serait la différence d'attributs et de méthodes entre ces classes ? Expliquer, en s'appuyant sur un exercice vu en cours, pourquoi c'est une mauvaise idée. Quelle est la solution qu'il faudrait préférer (et que l'on va préférer) ?
   - Il y aurait juste une différence dans la valeur du nom et l'image, ou le getImage. C'est une mauvaise idée car cela rend la maintenance du code plus difficile et cela peut induire des spécialisations complexes, comme le chat qui peut aboyer. Il faudrait préférer un ENUM de tous les types de Terrain.

3. Quel type utilisez-vous ?
   - Double.

4. Pourquoi sortir, selon vous, ce bout d'algorithme de la classe ?
   - Pour rendre le code plus modulaire et améliorer la facilité de maintenance.
   
 
 **Conclusion Personnelle** 
 
 J'ai eu beaucoup de mal à réaliser le projet même avec l'aide de Killian. De plus, il est vrai que j'aurai dû travailler dessus durant la période d'entreprise. Je ne sais pas si c'est de partir de l'existant qui m'a autant posé de problème en plus de mes difficultés en Java. J'espère que le gros projet se passera mieux, mais je n'y crois pas trop.

On a utilisé Chat GPT (le plus intelligemment possible) avec Killian, mais on a quand même pas réussi à régler tous les problèmes.
