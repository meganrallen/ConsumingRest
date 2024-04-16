# Use the official OpenJDK 11 image as base
FROM openjdk:11-jre-slim

# Copy the compiled JAR file from the target directory to the container
COPY target/ConsumingRest.jar /ConsumingRest.jar

# Set the entry point command to run the JAR file when the container starts
ENTRYPOINT ["java", "-jar", "/ConsumingRest.jar"]
