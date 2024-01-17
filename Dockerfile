FROM openjdk:17
VOLUME /tmp
COPY target/*.jar bankan-1.0.0.jar
ENTRYPOINT ["java", "-jar", "/bankan-1.0.0.jar"]