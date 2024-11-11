# Stage 1: Build the application
# 1. Description: Dockerfile for building the Spring Boot application
FROM maven:3.8.4-openjdk-17-slim AS build

# 2. set the current working directory inside the container
WORKDIR /app

# 3. copy maven executive tp the container
COPY mvnw .
COPY .mvn .mvn

# 4. copy the pom.xml file
COPY pom.xml .

# 5. Build all the dependencies in preparation to go offline.
RUN ./mvnw dependency:go-offline -B

# 6. Copy the project source
COPY src src

# 7. Package the application
RUN ./mvnw clean package -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

# Stage 2: A minimal docker image with command to run the app
FROM openjdk:17-jdk

ARG DEPENDENCY=/app/target/dependency

# Copy project dependencies from the build stage
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java","-jar","/app/demo-0.0.1-SNAPSHOT.jar"]
