# Spring-Boot-User-Management-Using-REST-API
Spring Boot User Management Using REST API is a Simple , Lightweight RESTful Application for add ,Search users. 
## Requirements
* JAVA JDK 17
* Maven
* PostgreSQL
* Postman (for testing APIs)
# Spring Starter 
*Spring Web
*Spring Data JPA
*PostgreSQL
*Spring Boot Dev Tool

# Running the Application Locally
-Using IDE
*Open the project in your IDE (Intellij, Eclipse, VS Code)
* Run the main class.
  |_com.adduserapi.adduserapi.AdduserapiApplication

# Server Port
  *The server will start on port 2020.
 - URL example: http://localhost:2020

# API EndPoints
    Method             Endpoint              Description
*    GET               /user/all            Get all users
*    Post              /user/add            Add a new user
*    Post              /user/search         Search userby fields

# Database
  *PostgreSQL database is required
  * The users table is automatically created using JPA.
  Column                  Type              Notes
    Id                   BIGINT        Auto-generated ID
  username               VARCHAR        Unique,not null
  firstName              VARCHAR          Not null
  lastName               VARCHAR          Not null
  email                  VARCHAR          Not null
  password               VARCHAR          Not null

# Testing with Postman
* Set the HTTP method according to endpoint(GET,POST).
  * Set Headers:
    Key                      Value
Authorization          Bearer admin:admin123
Content-Type             application/json
* For POST requests, add raw JSON body.
* Click Send check the Responses.

# Headers for all requests
        Key                        Value
Authorization              Bearer admin:admin123
Content-type                application/json

# Usage
- Add user
POST/user/add
Content-Type:application/json
Authorization: Bearer admin:admin123

-Response
{
"status":"Success",
"userId":1
}

# Get All Users
- GET/user/all
Authorization: Bearer admin:admin123

-Response
[
    {
        "email": "abcd@gmail.com",
        "firstName": "Anjali",
        "id": 1,
        "lastName": "gn",
        "password": "anjali112",
        "username": "Anjali25"
    },
    {
        "email": "abcd@gmail.com",
        "firstName": "Abcd",
        "id": 2,
        "lastName": "n",
        "password": "abcd22",
        "username": "abc5"
    }
]

-Search user
POST/user/search
Authorization  Bearer admin:admin123
Content-Type:application/json
Example:
[
{
  "username":"Anjali25"
  }
]






