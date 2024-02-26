# Spring Boot JPA CRUD REST API

This project demonstrates building a CRUD REST API with Spring Boot and JPA for persisting data to a MySQL database. 

## Overview

The API exposes the following endpoints:

- `POST /user` - Create a new user
- `GET /user/{id}` - Get a user by ID
- `PUT /user` - Update an existing user 
- `DELETE /user/{id}` - Delete a user

The database persistence is handled by Spring Data JPA repositories.

The project structure follows a common Spring Boot layout:

```
com.example.demo
  - controller
    - UserAPIController.java
  - model
    - User.java 
  - repository
    - UserRepository.java
  - service
    - UserService.java
  - DemoApplication.java
```

Key components:

- `UserAPIController` - Handles API requests 
- `User` - JPA entity mapped to database table
- `UserRepository` - JPA repository for data access 
- `UserService` - Business logic service layer

## Running the App

Prerequisites:
- Java 11
- Maven
- MySQL

Steps:

1. Create a MySQL database 
2. Update the credentials in `application.yaml`
3. Build using Maven: `mvn clean install`
4. Run the app: `java -jar target/demo-0.0.1-SNAPSHOT.jar`

The app will start on port 8080.

## Testing the API

You can test the API endpoints using cURL or Postman.

Examples:

```
# Create User
curl -X POST -H "Content-Type: application/json" 
  -d '{"firstname":"John","lastname":"Doe","email":"john@example.com"}' 
  http://localhost:8080/user

# Get User
curl http://localhost:8080/user/1

# Update User
curl -X PUT -H "Content-Type: application/json"
  -d '{"firstname":"Jane"}' http://localhost:8080/user

# Delete User 
curl -X DELETE http://localhost:8080/user/1
```

## Visit my blog


[aggrandizer.info](https://www.aggrandizer.info/)
