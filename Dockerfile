FROM openjdk:8-jre
COPY build/libs/springboot-toyproject-todolist-*-SNAPSHOT.jar app.jar
ENTRYPOINT ["sh", "-c","java ${JAVA_OPTS} -jar /app.jar"]