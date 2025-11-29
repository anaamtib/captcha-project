package com.example.captcha;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class KaptchaConfig {

    @Bean
    public DefaultKaptcha producer() {
        DefaultKaptcha kaptcha = new DefaultKaptcha();
        Properties props = new Properties();
        props.setProperty("kaptcha.border", "yes");
        props.setProperty("kaptcha.textproducer.font.color", "black");
        props.setProperty("kaptcha.image.width", "200");
        props.setProperty("kaptcha.image.height", "50");
        kaptcha.setConfig(new Config(props));
        return kaptcha;
    }
}
