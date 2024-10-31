# Jira Clone

A simplified Jira clone built with Spring Boot and Clean Architecture principles.

## Technology Stack

### Backend
- Java 21
- Spring Boot 3.3.5
- Spring Security with JWT
- PostgreSQL
- Flyway for database migrations
- MapStruct for object mapping
- OpenAPI/Swagger for API documentation

## Prerequisites

- JDK 21
- Docker and Docker Compose
- Maven
- PostgreSQL (if running locally without Docker)

## Getting Started

### 1. Clone the repository
```bash
git clone <repository-url>
cd jiraclone
```

### 2. Database Setup
Start the PostgreSQL database using Docker:
```bash
cd .docker/postgres
docker-compose -f docker-compose-postgres-dev.yml up -d
```

### 3. Build the application
```bash
./mvnw clean install
```

### 4. Run the application
```bash
./mvnw spring-boot:run
```

The application will be available at `http://localhost:8080`

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/btronics/jiraclone/
│   │       ├── domain/           # Enterprise business rules
│   │       ├── application/      # Application business rules
│   │       ├── infrastructure/   # Frameworks, drivers, tools
│   │       └── interfaces/       # Controllers, presenters
```

## Architecture

This project follows Clean Architecture principles:
- Domain-centric design
- Dependency inversion
- Separation of concerns
- Framework independence

### Layers
1. **Domain Layer**: Contains business logic and rules
2. **Application Layer**: Contains application use cases
3. **Infrastructure Layer**: Contains technical details
4. **Interfaces Layer**: Contains delivery mechanisms (REST API)

## API Documentation

Once the application is running, you can access:
- Swagger UI: `http://localhost:8080/api/swagger-ui.html`
- OpenAPI docs: `http://localhost:8080/api/v3/api-docs`

## Database Migrations

Migrations are managed by Flyway and located in:
```
src/main/resources/db/migration/
```

## Testing

Run tests using:
```bash
./mvnw test
```

## Logging

Logs are written to:
- Console
- `logs/jiraclone.log` (all logs)
- `logs/jiraclone-error.log` (error logs only)

## Development

### Running locally
1. Start the database:
```bash
cd .docker/postgres
docker-compose -f docker-compose-postgres-dev.yml up -d
```

2. Run the application with dev profile:
```bash
./mvnw spring-boot:run -Dspring.profiles.active=dev
```

### Available Profiles
- `dev`: Development configuration
- `test`: Test configuration
- `prod`: Production configuration