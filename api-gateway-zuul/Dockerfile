FROM openjdk:11
VOLUME /tmp
ADD ./target/api-gateway-zuul-0.0.1-SNAPSHOT.jar api-gateway-zuul.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","/api-gateway-zuul.jar"]