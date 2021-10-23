FROM openjdk:11
VOLUME /tmp
ADD ./target/one-0.0.1-SNAPSHOT.jar one.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","/one.jar"]