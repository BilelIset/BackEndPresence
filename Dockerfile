FROM openjdk:17-jdk-alpine

RUN apk add --no-cache maven

COPY pom.xml .
COPY src ./src

# Copier le fichier JAR généré dans le répertoire cible du conteneur
COPY target/presence-0.0.1-SNAPSHOT.jar /app/presence-0.0.1-SNAPSHOT.jar
COPY src/main/resources/application.properties /app/src/main/resources/application.properties

EXPOSE 80
# Commande par défaut pour exécuter l'application Spring Boot
CMD ["java", "-jar", "/app/presence-0.0.1-SNAPSHOT.jar"]
