# Use the Amazon Corretto 11 base image
FROM amazoncorretto:17

# Set the working directory in the container
WORKDIR /app

ARG JAR_FILE=target/director-api-0.0.1-SNAPSHOT.jar

# Copy the compiled JAR file to the container
COPY ${JAR_FILE} /app/director-api.jar

# Expose the port on which the Spring Boot application will listen
EXPOSE 8082

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "/app/director-api.jar"]
