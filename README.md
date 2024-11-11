# <span style="color:blue; font-size:2em;">The ems-Application System</span>

![EMS Application](https://github.com/user-attachments/assets/f2c39f6b-b34a-4f34-a93b-493416963f6c)

## <span style="color:green; font-size:1.5em;">Overview</span>
The ems-Application System is a full-stack application built using Spring Boot for the backend, React.js for the frontend, and a MySQL database. It uses RESTful APIs for communication between the frontend and backend. The application is containerized using Docker and deployed on Google Cloud Platform (GCP) using Docker Compose for web hosting.

## <span style="color:green; font-size:1.5em;">Features</span>
- Add Employee
- Validation Check

## <span style="color:green; font-size:1.5em;">Screenshots</span>

### <span style="color:purple; font-size:1.2em;">Add Employee</span>

![Add Employee](https://github.com/user-attachments/assets/8af63636-bce3-4dab-8939-a9f758ba77e7)

### <span style="color:purple; font-size:1.2em;">Validation Check</span>

![Validation Check 1](https://github.com/user-attachments/assets/1c21d6fc-e53b-4019-8184-f785cbb5feb3)

![Validation Check 2](https://github.com/user-attachments/assets/f9a748f3-66fe-4338-9222-1abf2233e672)

## <span style="color:green; font-size:1.5em;">Technologies Used</span>
- <span style="color:orange;">**Backend**</span>: Spring Boot
- <span style="color:orange;">**Frontend**</span>: React.js
- <span style="color:orange;">**Database**</span>: MySQL
- <span style="color:orange;">**APIs**</span>: RESTful APIs
- <span style="color:orange;">**Containerization**</span>: Docker
- <span style="color:orange;">**Deployment**</span>: Docker Compose, Google Cloud Platform (GCP)

## <span style="color:green; font-size:1.5em;">Installation</span>
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

## <span style="color:green; font-size:1.5em;">Usage</span>
Once the application is up and running, you can access the frontend interface to manage employees and perform validation checks.

## <span style="color:green; font-size:1.5em;">Contributing</span>
Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## <span style="color:green; font-size:1.5em;">License</span>
This project is licensed under the MIT License.

## <span style="color:green; font-size:1.5em;">Contact</span>
For any questions or feedback, please reach out to [kcwu229](https://github.com/kcwu229).
