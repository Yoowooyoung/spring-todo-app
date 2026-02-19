package com.example.spring_todo_app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")      // 와일드 카드: 모든 경로에 대해 CORS설정 적용
                .allowedOrigins("http://localhost:5173")    // ("localhost:5173")출처에서의 요청 허용
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}