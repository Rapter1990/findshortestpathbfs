FROM openjdk:17-alpine
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} findshortestpathbfs-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/findshortestpathbfs-0.0.1-SNAPSHOT.jar"]