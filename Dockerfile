# Use Eclipse Temurin JDK 21 as base image
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copy all required files to build the app
COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .
COPY src/ src/

RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Use the JAR file generated inside /app/target
CMD ["java", "-jar", "target/springjwt-0.0.1-SNAPSHOT.jar"]
