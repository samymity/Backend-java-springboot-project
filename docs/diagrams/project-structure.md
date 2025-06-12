# Project Structure Diagram

```mermaid
graph TD
    A[Project Root] --> B[pom.xml]
    A --> C[src]
    A --> O[docs]
    O --> P[diagrams]
    P --> Q[project-structure.md]
    C --> D[main]
    C --> E[test]
    D --> F[java]
    D --> G[resources]
    G --> H[application.properties]
    F --> I[com]
    I --> J[example]
    J --> K[demo]
    K --> L[DemoApplication.java]
    K --> M[controller]
    M --> N[HelloController.java]
    
    style A fill:#f9f,stroke:#333,stroke-width:2px
    style B fill:#bbf,stroke:#333,stroke-width:1px
    style H fill:#bbf,stroke:#333,stroke-width:1px
    style L fill:#bbf,stroke:#333,stroke-width:1px
    style N fill:#bbf,stroke:#333,stroke-width:1px
    style Q fill:#bbf,stroke:#333,stroke-width:1px
```

## Directory Structure Explanation

- `docs/`: Documentation folder
  - `diagrams/`: Contains all project diagrams
    - `project-structure.md`: This file containing the project structure diagram

- `src/`: Source code directory
  - `main/`: Main application code
    - `java/`: Java source files
    - `resources/`: Configuration files
  - `test/`: Test code

- `pom.xml`: Maven configuration file 