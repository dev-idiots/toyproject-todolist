FROM openjdk:8-jre
COPY build/libs/springboot-toyproject-todolist-*-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "app.jar"]
