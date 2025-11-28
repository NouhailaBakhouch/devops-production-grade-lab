# Copilot Instructions for spring-nexus-demo

## Project Overview

This is a **Spring Boot 3.4.12 REST API demo project** configured for Java 17+ and Maven builds. The project demonstrates integration patterns with Nexus (artifact repository), LocalStack (AWS services), and GitLab CI/CD.

**Key Facts:**
- **Framework:** Spring Boot 3.4.12 with spring-boot-starter-web
- **Build Tool:** Maven (uses Maven Wrapper: `./mvnw`)
- **Java Version:** 17
- **Package Structure:** `com.devops.lab.spring_nexus_demo` (note: underscores, not hyphens)

## Architecture & Components

### Entry Points
- **Main Application Class:** `SpringNexusDemoApplication.java` - Standard Spring Boot application with `@SpringBootApplication` annotation
- **REST Controller:** `HelloController.java` - Single `@RestController` with a `/hello` GET endpoint that returns "Hello from Spring / Nexus / LocalStack / GitLab !"

### Simple Endpoint Structure
The project follows a minimal REST pattern with a single controller. When adding new endpoints:
1. Extend `HelloController` OR create new `@RestController` classes in the main package
2. Use `@GetMapping`, `@PostMapping`, etc. annotations for HTTP methods
3. Reference: `HelloController.java` demonstrates the pattern

### Key File Locations
- **Application Configuration:** `src/main/resources/application.properties` (currently minimal)
- **Build Configuration:** `pom.xml` - defines Spring Boot parent, dependencies, and Maven plugins
- **Tests:** `src/test/java/com/devops/lab/spring_nexus_demo/SpringNexusDemoApplicationTests.java` - uses `@SpringBootTest`

## Build & Deployment

### Maven Commands
- **Build:** `./mvnw clean package` (Windows: `./mvnw.cmd clean package`)
- **Run Locally:** `./mvnw spring-boot:run`
- **Run Tests:** `./mvnw test`
- **Create Docker Image:** `./mvnw spring-boot:build-image` (requires Docker)

### Naming Convention Warning
The original package name `com.devops.lab.spring-nexus-demo` (with hyphens) is invalid in Java. The project **correctly uses `com.devops.lab.spring_nexus_demo` (with underscores)**. Ensure all new Java classes follow this package naming convention.

## Testing

Tests use **JUnit 5 (Jupiter)** via `spring-boot-starter-test`. The base test class is annotated with `@SpringBootTest` to load the full application context.

When adding tests:
- Place in `src/test/java/com/devops/lab/spring_nexus_demo/`
- Use `@SpringBootTest` for integration tests
- Use `@Test` from `org.junit.jupiter.api`

## Dependencies & External Integration

**Currently Minimal Dependencies:**
- `spring-boot-starter-web` - REST API and embedded Tomcat
- `spring-boot-starter-test` - Testing framework

**Context from Naming:** The project is designed to integrate with:
- **Nexus** - Artifact repository (for Maven dependencies)
- **LocalStack** - Local AWS services emulation
- **GitLab** - CI/CD pipelines

These are external integrations not yet active in code; when implementing, add appropriate dependencies to `pom.xml`.

## Developer Workflow

1. **Create/Modify Code:** Edit Java files in `src/main/java/com/devops/lab/spring_nexus_demo/`
2. **Build:** `./mvnw clean package`
3. **Test Locally:** `./mvnw spring-boot:run` - Application starts on port 8080 by default
4. **Verify REST Endpoint:** `curl http://localhost:8080/hello`
5. **Run Tests:** `./mvnw test` before committing

## Common Patterns

### Adding a New REST Endpoint
Use the existing `HelloController` as the template:
```java
@GetMapping("/your-endpoint")
public String yourMethod() {
    return "Response string";
}
```

### Configuring Application Properties
Edit `src/main/resources/application.properties` for environment-specific settings (port, logging level, etc.).

## Notes for AI Agents

- The project is in early development with minimal functionality
- Keep changes focused and well-tested
- Always run `./mvnw test` before suggesting commits
- Respect the package naming convention (`spring_nexus_demo`, not `spring-nexus-demo`)
- The `/hello` endpoint is the current sole business logic - extend thoughtfully
