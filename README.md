# CINEMA-APP
## Project description 
This project is a simulation of backend part for cinema application.
Before using this app user should be authenticated.
He can register by sending post request to endpoint "/register" with body that contains email, password and repeat password. 
Ordinary user can see available movies, cinema halls and movie sessions, but change or creates new entity can only user with admin role.
When user has authenticated, he can add movie session to his shopping cart (she creates during registration) and complete order. 
## Features
- registration like a user
- spring authentication
- automatically creating user's shopping cart during registration
- access to the endpoints based on roles
- creating cinema halls, movies, movie sessions
- display list of cinema halls, movies and available movie sessions
- creating, updating and removing movie sessions
- custom global exception handler that returns response with timestamp, http status and errors
## Project-structure 
- N-tier architecture:
  - Database layer  
  - DAO layer
  - Service layer
  - Client layer
- Followed SOLID-principles.
## Project technologies
- Java;
- Hibernate;
- Spring;
- Tomcat v9.0.50
## Instruction for successful project start
1. Set your own SQL properties in db.properties: 
```
#SQL properties
db.driver=YOUR_DB_DRIVER
db.url=YOUR_DB_URL
db.user=YOUR_DB_USERNAME
db.password=YOUR_DB_PASSWORD
```
2. Edit debug configurations and add Local Tomcat Server(recommended 9.0.50 version).
3. Add artifact (war exploded) to deploy project in Tomcat settings.
4. Now you can run this project. Roles (ADMIN, USER) and first admin create automatically in DataInitializer class during application start.
5. First admin should create cinema hall entity and some movie entity, then will possibly create movie session.
