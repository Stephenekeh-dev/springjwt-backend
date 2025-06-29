# Use Eclipse Temurin JDK 21 as base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven wrapper and project files
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .
COPY src/ src/

# Give Maven wrapper permission to run
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Copy the generated JAR to the container
COPY target/*.jar app.jar

# Expose the port used by Spring Boot
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
