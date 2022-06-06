FROM openjdk:8
EXPOSE 8080


RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar

# ADD target/*.jar *.jar

ENTRYPOINT ["java","-jar","/app/spring-boot-application.jar"]

# ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]