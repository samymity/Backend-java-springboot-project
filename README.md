# Spring-proj

A basic Spring Boot project demonstrating REST API development.

## Project Structure

See the detailed project structure diagram in [docs/diagrams/project-structure.md](docs/diagrams/project-structure.md)

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- Your favorite IDE (Spring Tool Suite, IntelliJ IDEA, or VS Code)

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/Spring-proj.git
   cd Spring-proj
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Test the endpoint:
   - Open your browser or use curl:
   ```bash
   curl http://localhost:8080/hello
   ```
   - You should see the message: "Hello from Spring Boot!"

## Features

- Basic Spring Boot REST API
- Maven build system
- Project documentation with Mermaid diagrams

## Documentation

- Project documentation can be found in the [docs](docs) directory
- API documentation (coming soon)
- Diagrams are created using Mermaid and can be found in [docs/diagrams](docs/diagrams)

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details 