FROM openjdk:8
ADD target/ChargesModule.jar ChargesModule.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","ChargesModule.jar"]