FROM openjdk:8
EXPOSE 8080


RUN mkdir /app

COPY build/libs/*.jar /app/spring-boot-application.jar

# ADD target/*.jar *.jar

ENTRYPOINT ["java","-jar","/app/"]

# ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]