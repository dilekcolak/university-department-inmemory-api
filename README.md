# University Department In-Memory API

This project is a simple **RESTful API** developed using **Spring Boot**.  
It manages **university department** data without using a database –  
data is stored **in-memory** using a **Java List** structure.

---

## 📚 Features
- **Spring Boot** based REST API
- **CRUD operations** for university departments
- **In-Memory** Java List for data storage
- **No external database** integration
- **RESTful Endpoints** using standard HTTP methods (GET, POST, PUT, DELETE)

---

## 🛠️ Technologies Used
- Java 17
- Spring Boot 3.x
- Spring Web
- Maven

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/dilekcolak/university-department-inmemory-api.git
   
2. Import the project into Spring Tool Suite (STS) or any compatible IDE.

3. Run the UniversityDepartmentInmemoryApiApplication class.

4. Access the API using Postman or any API testing tool.

📌 Example Endpoints
Method	Endpoint						Description
GET		/rest/api/departments			List all departments
GET		/rest/api/departments/{id}		Get department by ID
POST	/rest/api/departments			Add new department
PUT		/rest/api/departments/{id}		Update department
DELETE	/rest/api/departments/{id}		Delete department

👩‍💻 Developer
Name: Dilek Çolak
GitHub: @dilekcolak