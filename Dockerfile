FROM openjdk:8-jre
COPY build/libs/-*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
