
FROM openjdk:17-alpine


ARG JAR_FILE=target/*.jar

COPY ./target/LoginKube-0.0.1-SNAPSHOT.jar app.jar

# Entrypoint to run the application jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
