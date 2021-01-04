FROM openjdk:11
#VOLUME /tmp
#EXPOSE 8080
#ARG JAR_FILE=build/libs/gs-accessing-data-rest-0.1.0.jar
#ADD ${JAR_FILE} gs-accessing-data-rest-0.1.0.jar
#ENTRYPOINT ["java", "-jar", "gs-accessing-data-rest-0.1.0.jar"]
#CMD java -jar $jarFile
#ENV APP_HOME=/usr/app/
#WORKDIR $APP_HOME
COPY ./build/libs/* ./app.jar
COPY ./main.yml ./app/main.yml
#CMD ["java","-jar","app.jar"]
CMD java -jar app.jar server /app/main.yml
EXPOSE 8080


