FROM openjdk:8
EXPOSE 8000
ADD target/test-microservice.jar test-microservice.jar
ENTRYPOINT ["java","-jar","/test-microservice.jar"]
