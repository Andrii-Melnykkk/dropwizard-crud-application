FROM openjdk:11
COPY ./build/libs/* ./app.jar
COPY ./main.yml ./app/main.yml
ENTRYPOINT ["java", "-jar", "app.jar", "server","/app/main.yml"]