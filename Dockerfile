FROM openjdk:11
EXPOSE 8080


RUN mkdir /app

COPY build/libs/starwars.jar /app/starwars.jar

# ADD target/*.jar *.jar

ENTRYPOINT ["java","-jar","/app/starwars.jar"]

# ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]