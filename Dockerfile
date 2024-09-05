FROM openjdk:21
COPY ./target/test.jar test.jar
CMD ["java","-jar","test.jar"]