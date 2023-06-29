FROM openjdk:17-jdk-alpine
COPY target/cliente.jar app.jar

ENTRYPOINT ["java","-jar","app.jar", "--spring.profiles.active=swagger"]