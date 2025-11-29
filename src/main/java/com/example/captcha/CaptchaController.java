package com.example.captcha;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/captcha")
public class CaptchaController {

    @GetMapping("/new")
    public String newCaptcha() {
        // هنا الكود لإنشاء captcha جديد
        return "{\"captchaId\":\"1234\",\"imageUrl\":\"/captcha/image/1234\"}";
    }

    @GetMapping("/image/{id}")
    public String getImage(@PathVariable String id) {
        // هنا الكود لعرض صورة الكابتشا
        return "صورة الكابتشا";
    }

    @PostMapping("/verify")
    public String verify(@RequestParam String id, @RequestParam String answer) {
        // هنا الكود للتحقق من الإجابة
        return "{\"success\":true}";
    }
}
