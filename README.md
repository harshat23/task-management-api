# Task Management API

## About the Project

The Task Management API is a backend application developed using Java and Spring Boot. It provides REST API endpoints to manage tasks. Users can create, retrieve, update, and delete tasks using CRUD operations.

The project helped me understand REST API development, HTTP methods, backend application development, and API testing using Postman.

## Technologies Used

- Java– Backend programming
- Spring Boot – Backend framework
- REST API– Communication through HTTP requests
- SQL/MYSQL– Database, if configured in the project

## Features

- Create a new task
- Retrieve task details
- Update an existing task
- Delete a task
- Test API endpoints using Postman

## API Endpoints

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/tasks` | Retrieve all tasks |
| GET | `/tasks/{id}` | Retrieve a task by ID |
| POST | `/tasks` | Create a new task |
| PUT | `/tasks/{id}` | Update an existing task |
| DELETE | `/tasks/{id}` | Delete a task |

*Note: These are typical endpoint examples. Update them to match the actual endpoints implemented in your project.*

## How to Run the Project

### Prerequisites

- Java JDK
- Maven
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code

### Steps

1. Clone or download this repository.
2. Open the project in your IDE.
3. Make sure the required Java and Maven versions are installed.
4. Run the Spring Boot application using your IDE or Maven.

Using Maven:

```bash
mvn spring-boot:run
```

5. Once the application starts, send HTTP requests to your API using Postman.

The default Spring Boot port is usually `8080`, unless configured differently.

Example URL:

```text
http://localhost:8080/tasks
```

## Testing

The API endpoints can be tested using Postman by sending GET, POST, PUT, and DELETE requests and checking the responses.

## Learning Outcomes

- Understanding REST API development with Spring Boot
- Implementing CRUD operations
- Working with HTTP methods and request-response handling
- Testing APIs using Postman
- Understanding backend application structure

## Future Improvements

- Add authentication and authorization
- Integrate a persistent database, if not already configured
- Add input validation and exception handling
- Deploy the application online



