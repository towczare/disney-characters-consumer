FROM openjdk:17

EXPOSE 8080

WORKDIR /applications

COPY target/disney-0.0.1-SNAPSHOT.jar /applications/disney-application.jar

ENTRYPOINT ["java","-jar", "disney-application.jar"]
