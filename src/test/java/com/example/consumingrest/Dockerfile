# Use a base image with Java installed
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Java application into the container
COPY target/consuming-rest.jar /app

# Specify the command to run your application
CMD ["java", "-jar", "consuming-rest.jar"]
