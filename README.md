# **Full-Stack Role-Based Authentication System** (Spring Boot + Angular)

A powerful and secure full-stack authentication system built with **Spring Boot**, **Spring Security**, **JWT**, and **Angular**, featuring **role-based access control**, **PostgreSQL** database, and **dynamic dashboards**.
Built for scalable enterprise apps. Perfect for SaaS platforms, admin dashboards, or secure web apps.

## 🌟 Features

### 🔧 Backend (Spring Boot)
- ✅ User Registration & Login APIs
- 🔐 JWT Token-based Authentication
- 🛡️ Role-Based Access Control (RBAC)
- 📊 Secure Dashboard API
- 📁 Spring Data JPA with PostgreSQL
- 🔄 Refresh Token Ready (Extendable)
- 📦 Modular, Scalable Code Structure

### 💻 Frontend (Angular)
- 🖥️ Responsive Dashboard UI (Angular 19)
- 🔐 Secure Login & Registration
- 🎯 Dynamic UI rendering based on user roles
- 🌗 Light/Dark Mode Support
- 📈 Dashboard ready for chart integrations

---

## ⚙️ Tech Stack

| Layer     | Technology         |
|-----------|--------------------|
| Backend   | Spring Boot        |
| Security  | Spring Security, JWT |
| Database  | PostgreSQL         |
| ORM       | Spring Data JPA    |
| Frontend  | Angular 19         |
| Auth      | Token-Based (JWT)  |

---

## 📂 Project Structure
backend/
├── src/
│ ├── main/java/com/hellosteve/springjwt
│ │ ├── config/
│ │ ├── controller/
│ │ ├── dto/
│ │ ├── model/
│ │ ├── repository/
│ │ ├── filter/
│ │ └── service/
│ └── resources/
│ └── application.properties


---

## 🧪 How to Run

### 🔙 Backend (Spring Boot)
1. Clone the repository:
   ```bash
   git clone https://github.com/Stephenekeh-dev/user-auth-spring-security.git
   cd backend
    API Overview
Endpoint	Method	Role	Description
/api/register	POST	Public	User registration
/api/login	POST	Public	User login & JWT issue
/api/dashboard	GET	USER/ADMIN	Protected dashboard data
/api/admin/users	GET	ADMIN Only	View all users (admin)

Roles & Access
Role	Access Scope
USER	Dashboard, personal data
ADMIN	Full access, manage users

Configure PostgreSQL credentials in application.yml
Run the application: ./mvnw spring-boot:run


Contact
Created by Stephen Ekeh
📧 Email: stevenadibee@yahoo.com



