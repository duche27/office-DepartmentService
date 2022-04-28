FROM openjdk:11
ARG JAR_FILE=target/*.jar
ARG JAR_FILE_NAME=deparment-service
COPY ${JAR_FILE} ${JAR_FILE_NAME}.jar
ENTRYPOINT ["java","-jar","/${JAR_FILE_NAME}.jar"]
EXPOSE 9001