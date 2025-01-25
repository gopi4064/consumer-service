# Consumer Service

## Overview

The **Consumer Service** is responsible for listening to and processing messages from one or more message queues, typically via **JMS (Java Message Service)**. In this implementation, the service listens for messages sent by a **Producer Service** and processes them accordingly.

### Key Features:
- **JMS Integration**: Utilizes JMS to communicate with message brokers like **ActiveMQ**.
- **Dynamic Queue Support**: Listens to multiple queues dynamically, with the ability to add more queues at runtime.
- **Message Processing**: Once a message is received, it is processed and logged, with custom logic available for further actions (e.g., updating databases, triggering external services).
- **Error Handling**: Robust error handling to manage message consumption and processing failures.

## Technologies Used

- **Spring Boot**: Framework used to build the consumer service.
- **ActiveMQ**: Message broker for sending and receiving JMS messages.
- **JMS (Java Message Service)**: Communication protocol for message-driven processing.
- **SLF4J & Logback**: Logging framework for application monitoring and debugging.

## How It Works

1. **Listening to Queues**: The consumer service listens for messages on predefined queues (such as `sample-queue`, `config-queue`, etc.).
   
2. **Message Consumption**: When a message is sent to the queue by the producer, the consumer service picks up the message and triggers the appropriate listener method.
   
3. **Processing the Message**: After receiving a message, the consumer service processes it by applying the business logic. This can include things like:
    - Logging the message for audit purposes.
    - Calling external services or APIs.
    - Updating internal application state or databases.

4. **Dynamic Queue Support**: The service can be configured to listen to multiple queues, which can be dynamically added at runtime.

## Setup & Installation

### Prerequisites
- **JDK 17 or higher**
- **Maven 3.4.2
- **ActiveMQ or any other JMS broker**

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/your-repo/consumer-service.git
   cd consumer-service
