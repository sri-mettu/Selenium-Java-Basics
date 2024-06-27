# Use a base image with Java and Maven installed
FROM maven:3.8.4-openjdk-11-slim AS build

# Set working directory in the Docker image
WORKDIR /app

# Copy the Maven project files into the Docker image
COPY pom.xml .
COPY src ./src

# Build the Selenium project
RUN mvn clean package

# Use a smaller base image for the final Docker image
FROM openjdk:11-jre-slim

# Set working directory in the Docker image
WORKDIR /app

# Copy the compiled Selenium JAR file into the Docker image
COPY --from=build /app/target/your-selenium-project.jar .

# Specify the command to run your Selenium tests
CMD ["java", "-jar", "your-selenium-project.jar"]

