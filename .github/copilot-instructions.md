#  Coding Guidelines for ip1-Jaile-Estell

## Project Overview
This is a basic Maven-based Java project for COSI103A IP1, featuring a simple "Hello World" application with JUnit testing.

## Architecture
- **Structure**: Standard Maven layout with source in `src/main/java` and tests in `src/test/java`
- **Main Class**: `edu.brandeis.cosi103a.ip1.App` - single entry point printing "Hello World!"
- **Testing**: JUnit 4.11 for unit tests, located in `src/test/java/edu/brandeis/cosi103a/ip1/AppTest.java`

## Development Workflow
- **Build**: Run `mvn clean compile` from `.github/ip1/` directory to compile sources
- **Test**: Execute `mvn test` to run JUnit tests
- **Run**: Use `java -cp target/classes edu.brandeis.cosi103a.ip1.App` to execute the application
- **Full Build**: `mvn clean install` packages the JAR and runs tests

## Key Conventions
- **Java Version**: Target Java 25 (maven.compiler.source/target = 25)
- **Package Naming**: Follows `edu.brandeis.cosi103a.ip1` for all classes
- **Testing**: Use JUnit 4 with `@Test` annotations and `assertTrue` for basic assertions
- **Dependencies**: Minimal - only JUnit 4.11 in test scope

## File Locations
- **Source Code**: `.github/ip1/src/main/java/edu/brandeis/cosi103a/ip1/App.java`
- **Tests**: `.github/ip1/src/test/java/edu/brandeis/cosi103a/ip1/AppTest.java`
- **Build Config**: `.github/ip1/pom.xml`
- **Dev Environment**: Uses VS Code dev container with Java features

## Patterns to Follow
- Place new classes in the `edu.brandeis.cosi103a.ip1` package
- Add corresponding test classes in `src/test/java` with `Test` suffix
- Update `pom.xml` for any new dependencies, maintaining JUnit 4 compatibility</content>
<parameter name="filePath">/workspaces/ip1-Jaile-Estell/.github/copilot-instructions.md