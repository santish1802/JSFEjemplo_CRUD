FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copiar Payara Micro
COPY payara-micro-6.2025.10.jar payara-micro.jar

# Copiar tu WAR
COPY target/JSFEjemplo_CRUD-1.0-SNAPSHOT.war app.war

# Exponer puerto
EXPOSE 8080

# Ejecutar Payara Micro
CMD ["java", "-jar", "payara-micro.jar", "--deploy", "app.war", "--contextroot", "/", "--port", "8080"]
