# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim as builder

# Set the working directory
WORKDIR /app

# Copy the Maven or Gradle configuration files (pom.xml or build.gradle) to the container
COPY pom.xml /app/
COPY src /app/src/

# Install Maven and build the application
RUN apt-get update && apt-get install -y maven

# Build the Spring Boot application (JAR file)
RUN mvn clean package -DskipTests

# Use a lighter base image to run the application
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=builder /demo/target/*.jar /app/app.jar

# Expose the port the app will run on
EXPOSE 8080

# Set the entry point for the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
