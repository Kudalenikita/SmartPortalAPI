SmartPortalAPI 🚀

A Spring Boot REST API project with MongoDB, Lombok, and debugging features.

📌 Project Overview

SmartPortalAPI is a backend application built using Spring Boot, designed to help learners understand how modern REST APIs are created.
It demonstrates real-world concepts like:

RESTful API design

MongoDB integration

Lombok for reducing boilerplate

Debugging + logging

Layered architecture (Controller → Service → Repository)

This project is ideal for learning or showcasing backend development skills.

🛠️ Tech Stack

Java 17+

Spring Boot

MongoDB (NoSQL)

Spring Data MongoDB

Project Lombok

Maven

Postman / Thunder Client for testing APIs

✨ Features

CRUD operations with MongoDB

Clean and structured REST APIs

Input validation & proper HTTP codes

Lombok for getters/setters/constructors

Logging & debugging support

Environment configuration in application.properties

Scalable layered architecture

📂 Project Structure
src/
 ├─ main/
 │   ├─ java/
 │   │   └─ com.smartportal.api
 │   │         ├─ controller/   # API endpoints
 │   │         ├─ service/      # Business logic
 │   │         ├─ repository/   # MongoDB interaction
 │   │         └─ model/        # MongoDB document schemas
 │   └─ resources/
 │       ├─ application.properties
 │       └─ static/templates (optional)
 └─ test/
     └─ ... (JUnit tests)

🔌 API Examples
1. Create User

POST /api/users

{
  "name": "Nikita",
  "email": "nikita@gmail.com",
  "role": "Admin"
}

2. Get All Users

GET /api/users

⚙️ How to Run the Project
1. Clone Repository
git clone https://github.com/your-username/SmartPortalAPI.git
cd SmartPortalAPI

2. Install Dependencies
mvn clean install

3. Run Application
mvn spring-boot:run


App starts at:
👉 http://localhost:8080

🗄️ MongoDB Setup

Install & run MongoDB

Update connection in application.properties:

spring.data.mongodb.uri=mongodb://localhost:27017/SmartPortalDB

🧰 Learnings from the Project

How to build REST APIs from scratch

Working with MongoDB & Spring Data

Using Lombok to simplify Java code

Debugging techniques using IDE breakpoints

Following clean coding + layered architecture

🤝 Contributions

Pull requests are always welcome!
For major changes, please open an issue first to discuss the idea.

📜 License

This project is for learning and development purposes.
You can modify, improve, and use it freely.
