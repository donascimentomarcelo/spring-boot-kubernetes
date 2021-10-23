FROM openjdk:11
VOLUME /tmp
ADD ./target/two-0.0.1-SNAPSHOT.jar two.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","/two.jar"]