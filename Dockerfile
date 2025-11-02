FROM eclipse-temurin:17-jdk

# Descargar Payara Micro
RUN curl -L -o payara-micro.jar https://repo1.maven.org/maven2/fish/payara/extras/payara-micro/6.2025.10/payara-micro-6.2025.10.jar

# Crear carpeta de app
WORKDIR /app

# Copiar tu WAR (ajusta el nombre si cambia)
COPY target/JSFEjemplo_CRUD-1.0-SNAPSHOT.war app.war

# Exponer el puerto
EXPOSE 8080

# Ejecutar Payara Micro
CMD ["java", "-jar", "/payara-micro.jar", "--deploy", "app.war", "--contextroot", "/", "--port", "8080"]
