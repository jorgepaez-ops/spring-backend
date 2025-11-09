# spring-backend-lab

A simple **Spring Boot REST API** that serves as the backend for the **Fullstack Automation Lab** project.  
This backend provides REST endpoints for testing and integration with a frontend or CI/CD environment.  
It can be deployed manually, in Docker containers, or automated via Ansible.

---

## 🧩 Project Overview

This project is part of a fullstack environment that demonstrates:
- **Spring Boot** backend (this repository)
- **Frontend or CI/CD automation** (handled in another repo, e.g. `ansible-fullstack-lab`)
- Optional **database integration** (PostgreSQL, MySQL, etc.)

---

## ⚙️ Tech Stack

- **Java 21**
- **Spring Boot 3.x**
- **Maven**
- **REST API**
- **(Optional)** PostgreSQL or MySQL for persistence

---

## 🚀 How to Run Locally

### 1️⃣ Prerequisites
- Java 21+ installed  
- Maven installed (`mvn -v` to verify)  
- Git installed  

### 2️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/spring-backend-lab.git
cd spring-backend-lab

### 3️⃣ Build the project
mvn clean install

4️⃣ Run the application
mvn spring-boot:run


The app will start at:

http://localhost:8080

🧠 Example Endpoint

Once running, test with:

curl http://localhost:8080/api/messages


Expected response:

["Hello", "from", "Spring Boot API!"]

🧪 Test

You can run tests using:

mvn test

🐳 Docker Support (Optional)

To build and run as a Docker container:

docker build -t spring-backend-lab .
docker run -p 8080:8080 spring-backend-lab

📦 Folder Structure
spring-backend/
├── pom.xml
└── src
    ├── main
    │   ├── java/com/example/
    │   │   ├── DemoApplication.java
    │   │   ├── controller/
    │   │   ├── entity/
    │   │   └── repository/
    │   └── resources/
    └── test/java/


👨‍💻 Author

Jorge Páez
System Engineer | Linux SysAdmin | Cloud & DevOps Enthusiast
💼 Project part of the Fullstack Automation Lab
