# spring-security-auth
# Mon Projet Spring Boot avec PostgreSQL

Ce projet est une application Spring Boot utilisant PostgreSQL comme base de données pour la gestion de la sécurité. Il inclut une configuration de base pour la source de données PostgreSQL et Hibernate.

## Prérequis

Assurez-vous d'avoir les éléments suivants installés sur votre système :

- Java 17 
- Apache Maven
- PostgreSQL (avec une base de données nommée `springsecurity`)
- Votre IDE préféré (par exemple, IntelliJ IDEA, Eclipse, Visual Studio Code)

## Configuration de la source de données PostgreSQL

Pour exécuter ce projet, vous devez configurer la source de données PostgreSQL. Ouvrez le fichier `application.properties` (ou `application.yml`) situé dans le répertoire `src/main/resources` de votre projet, et modifiez les propriétés suivantes en fonction de votre configuration PostgreSQL :

```properties
# URL de la source de données PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/springsecurity

# Nom d'utilisateur et mot de passe de la base de données PostgreSQL
spring.datasource.username=postgres
spring.datasource.password=1234

# Driver JDBC PostgreSQL
spring.datasource.driver-class-name=org.postgresql.Driver
