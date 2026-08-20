# Bước 1: Môi trường build (dùng Maven và JDK 11)
FROM maven:3.8.6-openjdk-11-slim AS build
WORKDIR /app

# Copy file cấu hình maven
COPY pom.xml .

# Copy toàn bộ source code
COPY src ./src

# Build code thành file .war
RUN mvn clean package

# Bước 2: Môi trường chạy (dùng Tomcat 9 và JRE 11)
FROM tomcat:9.0-jdk11-openjdk-slim

# Xóa các app mặc định của Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy file NhapMon.war từ Bước 1 sang Tomcat, đổi tên thành ROOT.war để web chạy ở tên miền gốc (/)
COPY --from=build /app/target/NhapMon.war /usr/local/tomcat/webapps/ROOT.war

# Khai báo port 8080 cho Render
EXPOSE 8080

# Chạy Tomcat
CMD ["catalina.sh", "run"]
