FROM openjdk:8
EXPOSE 8080
ADD target/*.jar *.jar
ENTRYPOINT ["java","-jar","/springboot-images-new.jar"]