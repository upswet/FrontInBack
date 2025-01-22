package ru.back.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Тестовое приложение",
                description = "Тестовый пример бэка",
                version = "1.0.0",
                contact = @Contact(
                        name = "Иван Иванов",
                        email = "zz@zzzz.ru",
                        url = "https://localhost:8080/index.html"
                )
        )
)
public class OpenApiConfig {
    // Конфигурация для Swagger
}
