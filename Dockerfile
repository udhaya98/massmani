FROM eclipse-temurin:17
COPY target/massmani.jar massmani.jar
CMD [ "java","-jar","massmani.jar" ]