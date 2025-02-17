# User_Authentication_Using_Spring_Security_React
# JWT Authentication System with React & Spring Boot

## 🚀 Project Overview
This is a **full-stack authentication system** built with **React.js** (frontend) and **Spring Boot** (backend). It implements **JWT-based authentication** to ensure secure user login, registration, and access control.

The frontend is styled using **Bootstrap**, handles API requests using **Axios**, and displays notifications using **React Hot Toast**.

---

## 📌 Features
✅ User Registration & Login  
✅ JWT Token-Based Authentication  
✅ Secure API with Spring Security  
✅ Protected Routes in React  
✅ Axios for API Requests  
✅ Bootstrap UI for Styling  
✅ React Hot Toast for Notifications  

---

## 🛠️ Tech Stack

### **Frontend:**
- React.js  
- React Router  
- Axios  
- Bootstrap  
- React Hot Toast  

### **Backend:**
- Spring Boot  
- Spring Security  
- JPA (Java Persistence API)  
- MySQL  

### **Security:**
- JWT (JSON Web Token) Authentication  

---

## 🔧 Installation Guide

### **Backend (Spring Boot)**
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd backend
   ```
2. Configure the **application.properties** file with your **MySQL database** settings.
3. Build and run the Spring Boot application:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```
   The backend will now be running on `http://localhost:8080`.

---

### **Frontend (React)**
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd frontend
   ```
2. Install the necessary dependencies:
   ```sh
   npm run dev
   ```
3. Run the React application:
   ```sh
   npm start
   ```
   The frontend will be running on `http://localhost:5173`.

---

## ⚙️ How to Use

### **User Registration**  
- Go to `/register` in the frontend to create a new user by providing a username and password.
- Passwords are securely hashed and stored in the backend.

### **User Login**  
- Go to `/login` to log in with your registered username and password.
- If credentials are valid, you will receive a **JWT token** which is stored in **localStorage** for authentication in subsequent requests.

### **Protected Routes**  
- Once logged in, users can access the **Home Page**, which is a protected route.
- If a valid JWT token is not found or the token is expired, the user will be redirected to the login page.

### **Logout**  
- Clicking the **Logout** button will remove the token from **localStorage**, logging the user out and redirecting them to the login page.

---

## 🤝 Contributing  
Feel free to fork the repository, create issues, and send pull requests. Contributions are always welcome!  
