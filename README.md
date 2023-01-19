[![mvn-verify](https://github.com/matsim-org/matsim-code-examples/actions/workflows/mvn-verify.yml/badge.svg?branch=15.x)](https://github.com/matsim-org/matsim-code-examples/actions/workflows/mvn-verify.yml)

# AtelierMTQ

## Importer dans IntelliJ
 « File -> New -> Project from Version Control » et coller l'url du repository. 
 
 « File -> Project Structure -> Modules » ajouter le dossier java en source.
 
 Click droit sur le fichier pom.xml -> Maven -> Reload as Maven project
 
 
 ## Pour créer un jarfile
``` 
mvn package -DskipTests 
```

## Exécution
Exécuter le GUI :
``` 
java -jar atelier-1.0-SNAPSHOT-jar-with-dependencies.jar
``` 

Lancer un run:
``` 
java -cp atelier-1.0-SNAPSHOT-jar-with-dependencies.jar run.RunBase montreal_scenario/config.xml

``` 
