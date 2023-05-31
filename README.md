# Registration-Login-API

Registration-Login-API is a Spring Boot application that provides login and signup functionality using H2 database, Spring Security, Spring Data JPA, and Thymeleaf.

## Prerequisites

- Java Development Kit (JDK) installed
- Maven build tool installed
- Internet connectivity to download dependencies

## Installation and Setup

1. Clone the repository or download the project ZIP file.

2. Open a terminal or command prompt and navigate to the project directory.

3. Build the project using Maven:
   ```
   mvn clean install
   ```

4. Start the application:
   ```
   mvn spring-boot:run
   ```

5. The application will start running on a local server (e.g., http://localhost:3031).

## Usage

- Open a web browser and navigate to `http://localhost:3031` to access the application.

- Use the provided signup form to create a new user account.

- Use the login form to authenticate with the created user credentials.

- Upon successful login, you will be redirected to the dashboard page.

- The application uses Spring Security to handle authentication and authorization.

- The application uses H2 in-memory database for data storage.

## Configuration

- The application configuration can be found in the `application.properties` file.

- Modify the configuration properties as needed (e.g., database connection settings, security settings).

## Database

- The application uses H2 in-memory database by default.

- The database schema and tables will be automatically created upon application startup.

- Access the H2 console at `http://localhost:3031/h2-console` to view and query the database.

## Security

- The application utilizes Spring Security to secure the login and dashboard pages.

- The passwords are stored securely using BCrypt encryption in the database.

## Technologies Used

- Spring Boot: A framework for building Java applications quickly and easily.
- Spring Security: A powerful and highly customizable security framework for Java applications.
- Spring Data JPA: A framework that simplifies database access and provides repositories for data persistence.
- H2 Database: An in-memory database that provides fast and efficient data storage for development and testing.
- Thymeleaf: A server-side Java template engine for rendering dynamic web pages.
