# استخدام صورة Java
FROM eclipse-temurin:17-jdk-alpine

# نسخ المشروع إلى الحاوية
WORKDIR /app
COPY . .

# بناء المشروع
RUN ./gradlew build

# تشغيل التطبيق
CMD ["java", "-jar", "build/libs/captcha-project-1.0.0.jar"]
