FROM openjdk:11
VOLUME /tmp
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","/eureka-server.jar"]