FROM openjdk:11
VOLUME /tmp
ADD ./target/three-0.0.1-SNAPSHOT.jar three.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","/three.jar"]