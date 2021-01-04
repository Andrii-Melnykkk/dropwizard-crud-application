FROM openjdk:11
COPY ./build/libs/* ./app.jar
COPY ./main.yml ./app/main.yml
CMD java -jar app.jar server /app/main.yml
EXPOSE 8080


