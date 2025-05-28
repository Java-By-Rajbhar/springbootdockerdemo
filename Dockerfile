FROM openjdk:17
EXPOSE 9090
ADD target/spring-boot-docker-jenkins-demo.jar spring-boot-docker-jenkins-demo.jar
ENTRYPOINT [ "java","-jar","/spring-boot-docker-jenkins-demo.jar" ]