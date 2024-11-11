# The ems-Application System

![EMS Application](https://github.com/user-attachments/assets/f2c39f6b-b34a-4f34-a93b-493416963f6c)

## Overview
The ems-Application System is a full-stack application built using Spring Boot for the backend, React.js for the frontend, and a MySQL database. It uses RESTful APIs for communication between the frontend and backend. The application is containerized using Docker and deployed on Google Cloud Platform (GCP) using Docker Compose for web hosting.

## Features
- Add Employee
- Validation Check

## Screenshots

### Add Employee

![Add Employee](https://github.com/user-attachments/assets/8af63636-bce3-4dab-8939-a9f758ba77e7)

### Validation Check

![Validation Check 1](https://github.com/user-attachments/assets/1c21d6fc-e53b-4019-8184-f785cbb5feb3)

![Validation Check 2](https://github.com/user-attachments/assets/f9a748f3-66fe-4338-9222-1abf2233e672)

## Technologies Used
- **Backend**: Spring Boot
- **Frontend**: React.js
- **Database**: MySQL
- **APIs**: RESTful APIs
- **Containerization**: Docker
- **Deployment**: Docker Compose, Google Cloud Platform (GCP)

## Installation
To set up the project locally, follow these steps:

1. **Clone the repository**:
    ```sh
    git clone https://github.com/kcwu229/ems-Application.git
    cd ems-Application
    ```

2. **Backend Setup**:
    - Navigate to the backend directory and run the Spring Boot application.
    ```sh
    cd backend
    ./mvnw spring-boot:run
    ```

3. **Frontend Setup**:
    - Navigate to the frontend directory and start the React application.
    ```sh
    cd frontend
    npm install
    npm start
    ```

4. **Database Setup**:
    - Ensure MySQL is running and create a database for the application.
    - Update the database configuration in the `application.properties` file.

## Usage
Once the application is up and running, you can access the frontend interface to manage employees and perform validation checks.

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License
This project is licensed under the MIT License.

## Contact
For any questions or feedback, please reach out to [kcwu229](https://github.com/kcwu229).
