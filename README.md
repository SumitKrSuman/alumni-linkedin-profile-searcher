# alumni-linkedin-profile-searcher

Alumni LinkedIn Profile Searcher is a Spring Boot REST API application that allows users to search for LinkedIn profiles of alumni from a specific university based on:

*   University Name
*   Current Designation
*   Optional Pass-out Year

The application integrates with the PhantomBuster API to fetch LinkedIn alumni data and stores the retrieved information in a PostgreSQL database for future access.

This project follows industry-standard layered architecture and REST principles, and is fully testable using Postman.

Features:

1.  Search alumni by university and designation
2.  Optional filtering by pass-out year
3.  Store alumni data in PostgreSQL database
4.  REST-compliant API design
5.  Clean layered architecture (Controller → Service → Repository → Entity)
6.  Robust exception handling
7.  Postman testable APIs
8.  Maintainable and scalable code structure


## Tech Stack:

| Technology        | Description                |
| ----------------- | -------------------------- |
| Java 17           | Programming Language       |
| Spring Boot       | Backend Framework          |
| Spring Data JPA   | ORM Framework              |
| PostgreSQL        | Database                   |
| Maven             | Dependency Management      |
| Lombok            | Boilerplate Code Reduction |
| Postman           | API Testing Tool           |

## Architecture

The project adheres to a layered architecture, comprising the following components:

*   Controller Layer: Handles HTTP requests and responses.
*   Service Layer: Implements business logic and API integration.
*   Repository Layer: Facilitates database interaction.
*   Entity Layer: Defines JPA entity mappings.
*   DTO Layer: Utilizes data transfer objects.

This structure ensures:
*   Separation of concerns
*   Clean code
*   Maintainability
*   Scalability

## API Endpoints

1.  Search Alumni Profiles

    *   **Method:** POST
    *   **Endpoint:** /api/alumni/search

2.  Get All Saved Alumni

    *   **Method:** GET
    *   **Endpoint:** /api/alumni/all

    Returns all stored alumni profiles from the database.
