FROM openjdk:11
EXPOSE 8080
RUN mkdir /app
COPY build/libs/starwars.jar /app/starwars.jar
ENTRYPOINT ["java","-jar","/app/starwars.jar"]
