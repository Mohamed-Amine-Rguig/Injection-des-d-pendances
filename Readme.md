# Projet de Démonstration d'Injection de Dépendances

## À propos

Ce projet démontre l'utilisation de l'injection de dépendances dans une application Spring. L'injection de dépendances est un principe de conception qui permet de réduire le couplage entre les différentes classes d'une application.

## Prérequis

- Java 17 ou version ultérieure
- IDE recommandé: IntelliJ IDEA ou Eclipse

## Installation

1. Clonez le dépôt:

   ```bash
   git clone [https://github.com/Mohamed-Amine-Rguig/Injection-des-d-pendances.git]
   cd dependency_injection
   ```

2. Compilez le projet avec Maven:

   ```bash
   mvn clean install
   ```

3. Exécutez l'application:
   ```bash
   mvn spring-boot:run
   ```

## Structure du Projet

```
dependency_injection/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── me/
│   │   │       └── medev/
│   │   │           └── dependency_injection/
│   │   └── resources/
│   └── test/
├── pom.xml
└── Readme.md
```

## Utilisation

Les exemples d'utilisation de l'injection de dépendances sont disponibles dans les différentes classes du projet. Vous trouverez notamment:

- Injection par constructeur
- Injection par champ
- Utilisation des annotations @Autowired, @Component, @Service, @Repository, etc.

## Technologies Utilisées

- Spring Boot 3.4.3
- Java 17
