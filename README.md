# Hello World Spring Boot Application

This is a simple Spring Boot application that demonstrates a basic "Hello, World!" functionality.

## Project Structure

```
hello-world-spring-boot
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── helloworld
│   │   │               ├── HelloWorldApplication.java
│   │   │               └── controller
│   │   │                   └── HelloController.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── helloworld
│                       └── HelloWorldApplicationTests.java
├── pom.xml
└── README.md
```

## How to Run

1. Ensure you have Java and Maven installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory.
4. Run the following command to start the application:

   ```
   mvn spring-boot:run
   ```

5. Open your web browser and go to `http://localhost:8080/hello` to see the "Hello, World!" message.

## Dependencies

This project uses Spring Boot and requires the following dependencies:

- Spring Web
- Spring Boot Starter

## Testing

To run the tests, use the following command:

```
mvn test
```

This will execute the test cases defined in `HelloWorldApplicationTests.java`.