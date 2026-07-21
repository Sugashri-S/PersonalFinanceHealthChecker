# 💰 Personal Finance Health Checker

A Java Servlet-based web application that helps users manage their personal finances by tracking income, expenses, budgets, and overall financial health through a simple and interactive interface.

## 📌 Overview

Personal Finance Health Checker is designed to help users understand their financial status by recording income and expenses, calculating budgets, and providing a financial health summary.

This project was developed using Java Servlets and JSP/HTML as a backend-focused web application following the MVC architecture.

---

## ✨ Features

- 💵 Add Income
- 💸 Record Expenses
- 📊 Budget Management
- ❤️ Financial Health Analysis
- 🌐 Simple Web Interface
- ⚡ Java Servlet Based Backend
- 📁 Maven Project Structure

---

## 🛠️ Tech Stack

### Frontend
- HTML5
- CSS3

### Backend
- Java
- Java Servlets

### Build Tool
- Apache Maven

### Server
- Apache Tomcat 10+

---

## 📂 Project Structure

```
PersonalFinanceHealthChecker
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.finance
│   │   │       ├── AddIncomeServlet.java
│   │   │       ├── AddExpenseServlet.java
│   │   │       ├── BudgetServlet.java
│   │   │       ├── HealthServlet.java
│   │   │       └── WelcomeServlet.java
│   │   │
│   │   └── webapp
│   │       ├── index.html
│   │       ├── income.html
│   │       ├── expense.html
│   │       ├── budget.html
│   │       ├── health.html
│   │       └── WEB-INF
│   │
│   └── pom.xml
│
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 17 or later
- Apache Maven
- Apache Tomcat 10+
- Git

---

### Clone the Repository

```bash
git clone https://github.com/Sugashri-S/PersonalFinanceHealthChecker.git
```

```bash
cd PersonalFinanceHealthChecker
```

---

### Build the Project

```bash
mvn clean package
```

A WAR file will be generated inside:

```
target/
```

---

### Deploy

Copy the generated WAR file to your Apache Tomcat `webapps` folder.

Start Tomcat and open:

```
http://localhost:8080/PersonalFinanceHealthChecker/
```

---

## 📸 Screenshots

Add screenshots here after deployment.

Example:

```
screenshots/
    home.png
    income.png
    expense.png
    budget.png
    health.png
```

---

## 🎯 Modules

### 🏠 Home
Navigation page for all finance modules.

### 💵 Income Module
Allows users to add income records.

### 💸 Expense Module
Stores and manages expense details.

### 📊 Budget Module
Calculates available budget based on income and expenses.

### ❤️ Financial Health Module
Displays a summary of the user's financial condition.

---

## 🔮 Future Improvements

- User Authentication
- Database Integration (MySQL)
- Expense Categories
- Monthly Reports
- Data Visualization using Charts
- Export Reports as PDF
- Responsive UI
- REST API Integration
- Dashboard with Analytics

---

## 📚 Concepts Used

- Java Servlets
- MVC Architecture
- HTTP Request & Response
- Form Handling
- Maven Build Management
- Web Application Deployment
- Apache Tomcat

---

## 👩‍💻 Author

**Sugashri S**

- B.E. Cyber Security
- Dhanalakshmi Srinivasan Engineering College
- GitHub: https://github.com/Sugashri-S
- LinkedIn: https://www.linkedin.com/in/sugashri1112/

---

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository
2. Create a new branch

```bash
git checkout -b feature-name
```

3. Commit your changes

```bash
git commit -m "Added new feature"
```

4. Push the branch

```bash
git push origin feature-name
```

5. Open a Pull Request

---

## ⭐ If you like this project

Give this repository a ⭐ on GitHub to support the project.

---

## 📄 License

This project is developed for educational and learning purposes.
