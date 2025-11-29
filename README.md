# مشروع CAPTCHA باستخدام Spring Boot

## وصف المشروع
مشروع لإنشاء CAPTCHA للتحقق من المستخدمين.

## طريقة التشغيل
1. استنساخ المشروع من GitHub
2. فتح المشروع في IntelliJ IDEA أو Eclipse
3. تشغيل `CaptchaApplication.java`
4. افتح الرابط: http://localhost:8080/captcha/new

## API
- /captcha/new → إنشاء كابتشا جديدة
- /captcha/image/{id} → عرض صورة الكابتشا
- /captcha/verify → التحقق من الإجابة
