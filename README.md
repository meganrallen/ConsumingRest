# ConsumingRest

This repository contains a client application for consuming a RESTful service. The client application is built using Spring Boot and makes RESTful API calls to the Quoters server.

## Prerequisites

Before running the client application, ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Maven
- Docker (if you plan to containerize the application)
- Kubernetes (optional, for deployment to Kubernetes)

## Instructions to Build

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/ConsumingRest.git
2. Navigate to the project directory
   ```bash
   cd ConsumingRest
3. Build the application using Maven:
   ```bash
   mvn clean package

## Instructions to Run Locally

1. Start the Quoters service and leave the port forwarding running:
   ```bash
   kubectl run quoters --image=javajon/quoters:1.0.0 --port=8080
   kubectl expose pod quoters --name=quoters
   kubectl get all -l run=quoters
   kubectl port-forward service/quoters 8080:8080
2. Run the client application:
   ```bash
   java -jar target/consuming-rest.jar

## Instructions to Run in Docker
1. Build the Docker image:
   ```bash
   docker build -t consuming-rest .
2. Run the Docker container:
   ```bash
   docker run -it consuming-rest

## Instructions to Deploy to Kubernetes
1. Ensure you have a Kubernetes cluster configured and kubectl installed.
2. Deploy the client application:
   ```bash
   kubectl run consumingrest --image=consuming-rest --env="quoters_base_url=http://quoters:8080"
3. Verify the deployment:
   ```bash
   kubectl get pods
4. Once the pod is running, check the logs:
   ```bash
   kubectl logs consumingrest
  
   

   

