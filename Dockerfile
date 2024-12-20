FROM openjdk:23-jdk
ARG JAR_FILE=build/libs/*.jar
ARG CONFIG_FILE=src/main/resources/application.yaml
COPY ${JAR_FILE} app.jar
COPY ${CONFIG_FILE} /configuration/application.yaml
ENTRYPOINT ["java","-jar","/app.jar", "--spring.config.location=/configuration/application.yaml"]