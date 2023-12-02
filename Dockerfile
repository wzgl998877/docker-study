FROM openjdk:8
WORKDIR /test
COPY *.jar /test/docker-study.jar

EXPOSE 8080

CMD ["java","-jar","docker-study.jar"]
