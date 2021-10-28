URL : https://github.com/mennio/moda_tdd_oct2021_wurm.git
//exercice 1 question 5:

Il y a une duplication de code car dans la méthode getNom on spécifie en valeur de retour "Example"
alors que dans le paramètre du constructeur on spécifie deja le nom.

Il faut donc return la variable nom pour la méthode getNom

//exercice 1 question 6:

la notion de refactoring permet de rendre le code plus performant et d'eviter sa dupplication.
Il vat permettre de mieux comprendre le code.

//exercice 1 question 8:
la methode isEmpty retourne tous le temps true donc elle n'est pas fiable car si le dictionnaire est vide ou non elle va retourner true;


//exercice 2 question 2:
Les deux méthodes (getTranslation et addTranslation)  sont différentes et ne concerne pas la meme chose
on peut donc dire qu elles sont indépendantes entre elles.

//exercice 3 question 1 :
Je propose de faire une list de list.

* [ ] FakeIT
* [ ] Construire une classe de tests nommée DictionaryTest
  * [ ] Creer un objet de type directory
  * [ ] méthode getName()
  * [ ] refactoring 
  * [ ] attribut private name
  * [ ] Méthode isEmpty()

* [ ] Triangulation
  * [ ] ecriire un test
  * [ ] question 
  * [ ] rafinnage du test
  * [ ] classe xith tab hachage
  * [ ] addtranslation + gettranslation
  * [ ] Améliorer le test du vide du dictionnaire en augmentant le test initial.

* [ ] Les fixtures de JUnit
  * [ ] mise en place du after classe
  
* [ ] Traductions multiples
  * [ ] question traduction multiple
  * [ ] test traduction multiple
  * [ ] addTranslation, getTranslation, setList, getList
