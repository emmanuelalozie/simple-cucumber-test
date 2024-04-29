# RESTAssured Cucumber Testing Example

## Overview

This repository demonstrates the use of RESTAssured in conjunction with Cucumber to perform integration testing of RESTful APIs. The project uses Java and Gradle to create a robust automated testing environment, showcasing best practices in API testing and continuous integration workflows.

## Key Features

- **RESTAssured Integration**: Utilizes RESTAssured to handle HTTP requests and validate responses from the JSONPlaceholder API, a popular service for testing typical REST interactions.
  
- **Cucumber for BDD**: Implements Cucumber to define the test scenarios in a behavior-driven development (BDD) style, allowing non-developers to understand the testing process easily.
  
- **Gradle Support**: Uses Gradle and its wrapper for easy building and testing across different environments, ensuring that dependencies are managed and consistent.

- **Automated Test Scenarios**: Includes automated tests for verifying user data retrieval, user ID confirmation, and comment validation using the JSONPlaceholder typicode API.

## Getting Started

### Prerequisites
- Java 8 or newer
- Gradle 6.3 or newer

### Setup

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/restassured-cucumber-example.git
   ```
2. Navigate to the project directory:
   ```
   cd restassured-cucumber-example
   ```

3. Run the test using Gradle:
   ```
   ./gradlew cucumberTest
   ```

## Scenarios Covered

1. **Retrieve a List of Users**: Validates that the service can retrieve a list of users and asserts that the HTTP status code is 200.

2. **User ID Confirmation**: Checks if the specified user's ID matches the expected value from the retrieved user list.

3. **Find Comment by Title**: Ensures a specific comment is present in the user comments, verifying both the content and the HTTP response status.

