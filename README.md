
<h1 align="center"> 
Spring Project  DocTorApp</h1>
This is a Spring Boot project for an  DocTorApp that allows users to manage pateint,doctor, autentication, and ENUM for specialization. The project uses MySQL for storing data, Hibernate for object-relational mapping, and Maven for building the project.

>### Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)

* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

>## Getting started
* Clone the repository to your local machine.
* Create a MySQL database and update the application.properties file with the database credentials and connection details.
* Build the project using Maven: mvn clean install
* Run the application using java -jar target/employee-management-system-0.0.1-SNAPSHOT.jar
* Access the APIs using any HTTP client such as Postman or cURL.
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.
* **DTO** -This is same as model but not to create a table.
>## API Documentation
The API endpoints will be available at http://localhost:8080.

## Models
The following models are available:

Doctor
* id (integer) - The doctor ID.
* name (string) - The user name.
* specialization (ENUM) - The Doctor specialization.

Patient
* integer -  patientId;
* String- patientFirstName;
* String patientLastName;
* String patientEmail;
* String patientPassword;
* String patientContact;

 Appointment
 
 *  AppointmentKey id;
 *  Doctor doctor;
 * Patient patient;
 
Autentication Token
 * Long tokenId;
 * String token;
 * LocalDate tokenCreationDate;
 *  Patient patient;






>## Project Summary
This project provides a starting point for building a Spring Boot doctor API. It includes the basic functionality required for managing patient ,doctor and appointment and can be extended to meet the specific needs of your application.
