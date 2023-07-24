FROM openjdk:17-jdk-alpine
EXPOSE 8000
ADD target/SpringPractice-1.0-SNAPSHOT.jar practice.jar
ENTRYPOINT ["java","-jar","/practice.jar"]