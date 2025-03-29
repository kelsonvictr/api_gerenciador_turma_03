FROM eclipse-temurin:17-jdk-alpine AS builder

WORKDIR /app

COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

jdbc:postgresql://localhost:5439/gerenciador_turma_3

jdbc:postgresql://dpg-cvk2msgdl3ps73fo4u8g-a/gerenciador_de_produtos_gh81
